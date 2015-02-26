package pe.com.consultisoft.dao.impl.curso;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.com.consultisoft.controller.curso.IeController;
import pe.com.consultisoft.dao.curso.IeDao;
import pe.com.consultisoft.model.Ie;
//import pe.com.consultisoft.model.Parametro;
import pe.com.consultisoft.utilitarios.Constantes;

@Repository
public class IeDaoImpl implements IeDao {
	@Autowired
    private SessionFactory sessionFactory;
	
	private static final Logger logger = LoggerFactory.getLogger(IeDaoImpl.class);

	@Override
	public List<Ie> list() {
		try{
			List<Ie> listIes = new ArrayList();
			listIes = sessionFactory.getCurrentSession().createQuery("from Ie order by str_ie").list();
			return listIes;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return null;
		}	
	}

	
	@Override
	public int add(Ie ie) {
		try{
			//Revisar
			//ie.setEstado(ie.getEstado().(Constantes.Estados.EST_ACTIVO1));
			sessionFactory.getCurrentSession().save(ie);
			//sessionFactory.getCurrentSession().flush();
			return 0;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return -1;
		}
	}

	@Override
	public int update(Ie ie) {
		try{
			sessionFactory.getCurrentSession().update(ie);
			return 0;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return -1;
		}
	}

	@Override
	public int delete(int int_idie) {
		try{
			Ie ie = (Ie)sessionFactory.getCurrentSession().get(Ie.class, int_idie);
			//Revisar
			//ie.setInt_idestado(Constantes.Estados.EST_INACTIVO1);
			sessionFactory.getCurrentSession().save(ie);
			return 0;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return -1;
		}
	}

	@Override
	public List<Ie> find(Ie ie) {
		try{
			List<Ie> listIes = new ArrayList();
			String query = "from Ie where str_codigo_modular like '%"+ie.getStr_codigo_modular().trim()+"%'";
			listIes = sessionFactory.getCurrentSession().createQuery(query).list();
			return listIes;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return null;
		}
	}

	@Override
	public Ie find(int int_idie) {
		try{
			return (Ie) sessionFactory.getCurrentSession().get(Ie.class, int_idie);
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
