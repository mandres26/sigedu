package pe.com.consultisoft.dao.impl.commons;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.com.consultisoft.dao.commons.GeneroDao;
//import pe.com.consultisoft.dao.impl.matricula.AlumnoDaoImpl;
import pe.com.consultisoft.model.Parametro;


@Repository
public class GeneroDaoImpl implements GeneroDao {
	@Autowired
    private SessionFactory sessionFactory;
	
	private static final Logger logger = LoggerFactory.getLogger(GeneroDaoImpl.class);
	
	@Override
	public List<Parametro> listGeneros() {
		try{
			List<Parametro> listGeneros = new ArrayList();
			listGeneros = sessionFactory.getCurrentSession().createQuery("from Parametro where int_tipo_parametro=6 order by str_parametro").list();
			return listGeneros;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return null;
		}
	}
	
}
