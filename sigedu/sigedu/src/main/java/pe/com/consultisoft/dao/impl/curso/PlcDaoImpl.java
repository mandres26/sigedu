package pe.com.consultisoft.dao.impl.curso;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.com.consultisoft.controller.curso.PlcController;
import pe.com.consultisoft.dao.curso.PlcDao;
import pe.com.consultisoft.model.Plc;
import pe.com.consultisoft.model.Parametro;
import pe.com.consultisoft.utilitarios.Constantes;

@Repository
public class PlcDaoImpl implements PlcDao {
	@Autowired
    private SessionFactory sessionFactory;
	
	private static final Logger logger = LoggerFactory.getLogger(PlcDaoImpl.class);

	@Override
	public List<Plc> list() {
		try{
			List<Plc> listPlcs = new ArrayList();
			listPlcs = sessionFactory.getCurrentSession().createQuery("from Plc order by str_plc").list();
			return listPlcs;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return null;
		}	
	}

	@Override
	public int add(Plc plc) {
		try{
			//plc.setEstado((Constantes.Estados.EST_ACTIVO1);
			sessionFactory.getCurrentSession().save(plc);
			//sessionFactory.getCurrentSession().flush();
			return 0;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return -1;
		}
	}

	@Override
	public int update(Plc plc) {
		try{
			sessionFactory.getCurrentSession().update(plc);
			return 0;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return -1;
		}
	}

	@Override
	public int delete(int int_idplc) {
		try{
			Plc plc = (Plc)sessionFactory.getCurrentSession().get(Plc.class, int_idplc);
			//plc.setInt_idestado(Constantes.Estados.EST_INACTIVO1);
			sessionFactory.getCurrentSession().save(plc);
			return 0;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return -1;
		}
	}

	@Override
	public List<Plc> find(Plc plc) {
		try{
			List<Plc> listPlcs = new ArrayList();
			String query = "from Plc where str_plc like '%"+plc.getStr_plc().trim()+"%'";
			listPlcs = sessionFactory.getCurrentSession().createQuery(query).list();
			return listPlcs;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return null;
		}
	}

	@Override
	public Plc find(int int_idplc) {
		try{
			return (Plc) sessionFactory.getCurrentSession().get(Plc.class, int_idplc);
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return null;
		}
	}
	
}
