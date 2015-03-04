package pe.com.consultisoft.dao.impl.curso;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.com.consultisoft.controller.curso.DcnController;
import pe.com.consultisoft.dao.curso.DcnDao;
import pe.com.consultisoft.model.Dcn;
import pe.com.consultisoft.utilitarios.Constantes;

@Repository
public class DcnDaoImpl implements DcnDao {
	@Autowired
    private SessionFactory sessionFactory;
	
	private static final Logger logger = LoggerFactory.getLogger(DcnDaoImpl.class);

	@Override
	public List<Dcn> list() {
		try{
			List<Dcn> listDcns = new ArrayList();
			listDcns = sessionFactory.getCurrentSession().createQuery("from Dcn order by str_dcn").list();
			return listDcns;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return null;
		}	
	}

	@Override
	public int add(Dcn dcn) {
		try{
			dcn.setInt_idestado(Constantes.Estados.EST_ACTIVO1);
			sessionFactory.getCurrentSession().save(dcn);
			//sessionFactory.getCurrentSession().flush();
			return 0;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return -1;
		}
	}

	@Override
	public int update(Dcn dcn) {
		try{
			sessionFactory.getCurrentSession().update(dcn);
			return 0;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return -1;
		}
	}

	@Override
	public int delete(int codigo) {
		try{
			Dcn dcn = (Dcn)sessionFactory.getCurrentSession().get(Dcn.class, codigo);
			dcn.setInt_idestado(Constantes.Estados.EST_INACTIVO1);
			sessionFactory.getCurrentSession().save(dcn);
			return 0;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return -1;
		}
	}

	@Override
	public List<Dcn> find(Dcn dcn) {
		try{
			List<Dcn> listDcns = new ArrayList();
			String query = "from Dcn where str_dcn like '%"+dcn.getStr_dcn().trim()+"%'";
			listDcns = sessionFactory.getCurrentSession().createQuery(query).list();
			return listDcns;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return null;
		}
	}

	@Override
	public Dcn find(int codigo) {
		try{
			return (Dcn) sessionFactory.getCurrentSession().get(Dcn.class, codigo);
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
