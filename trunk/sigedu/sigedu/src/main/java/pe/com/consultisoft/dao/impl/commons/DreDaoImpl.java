package pe.com.consultisoft.dao.impl.commons;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.com.consultisoft.dao.commons.DreDao;
//import pe.com.consultisoft.dao.impl.matricula.AlumnoDaoImpl;
import pe.com.consultisoft.model.Parametro;


@Repository
public class DreDaoImpl implements DreDao {
	@Autowired
    private SessionFactory sessionFactory;
	
	private static final Logger logger = LoggerFactory.getLogger(DreDaoImpl.class);
	
	@Override
	public List<Parametro> listDres() {
		try{
			List<Parametro> listDres= new ArrayList();
			listDres = sessionFactory.getCurrentSession().createQuery("from Parametro where int_tipo_parametro=8 order by str_parametro").list();
			return listDres;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return null;
		}
		
	}
	
}
