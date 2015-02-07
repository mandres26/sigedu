package pe.com.consultisoft.dao.impl.curso;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.com.consultisoft.controller.curso.ColegioController;
import pe.com.consultisoft.dao.curso.ColegioDao;
import pe.com.consultisoft.model.Colegio;
//import pe.com.consultisoft.model.Parametro;
import pe.com.consultisoft.utilitarios.Constantes;

@Repository
public class ColegioDaoImpl implements ColegioDao {
	@Autowired
    private SessionFactory sessionFactory;
	
	private static final Logger logger = LoggerFactory.getLogger(ColegioDaoImpl.class);

	@Override
	public List<Colegio> list() {
		try{
			List<Colegio> listColegios = new ArrayList();
			listColegios = sessionFactory.getCurrentSession().createQuery("from Colegio order by str_colegio").list();
			return listColegios;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return null;
		}	
	}

	@Override
	public int add(Colegio colegio) {
		try{
			colegio.setInt_idestado(Constantes.Estados.EST_ACTIVO1);
			sessionFactory.getCurrentSession().save(colegio);
			//sessionFactory.getCurrentSession().flush();
			return 0;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return -1;
		}
	}

	@Override
	public int update(Colegio colegio) {
		try{
			sessionFactory.getCurrentSession().update(colegio);
			return 0;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return -1;
		}
	}

	@Override
	public int delete(int int_idcolegio) {
		try{
			Colegio colegio = (Colegio)sessionFactory.getCurrentSession().get(Colegio.class, int_idcolegio);
			colegio.setInt_idestado(Constantes.Estados.EST_INACTIVO1);
			sessionFactory.getCurrentSession().save(colegio);
			return 0;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return -1;
		}
	}

	@Override
	public List<Colegio> find(Colegio colegio) {
		try{
			List<Colegio> listColegios = new ArrayList();
			String query = "from Colegio where str_colegio like '%"+colegio.getStr_colegio().trim()+"%'";
			listColegios = sessionFactory.getCurrentSession().createQuery(query).list();
			return listColegios;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return null;
		}
	}

	@Override
	public Colegio find(int int_idcolegio) {
		try{
			return (Colegio) sessionFactory.getCurrentSession().get(Colegio.class, int_idcolegio);
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return null;
		}
	}
	/*
	//Validar.
	@Override
	public List<Parametro> listEstado() {
		try{
			List<Parametro> listEstados = new ArrayList();
			listEstados = sessionFactory.getCurrentSession().createQuery("from sgcm_para where int_tipo_parametro = '1' order by str_parametro").list();
			return listEstados;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return null;
		}	
	}*/
}
