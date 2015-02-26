package pe.com.consultisoft.dao.impl.commons;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.com.consultisoft.dao.commons.AnhoDao;
import pe.com.consultisoft.dao.impl.commons.AnhoDaoImpl;
import pe.com.consultisoft.model.Anho;


@Repository
public class AnhoDaoImpl implements AnhoDao {
	@Autowired
    private SessionFactory sessionFactory;
	
	private static final Logger logger = LoggerFactory.getLogger(AnhoDaoImpl.class);
	
	@Override
	public List<Anho> listAnhos() {
		try{
			List<Anho> listAnhos = new ArrayList();
			listAnhos = sessionFactory.getCurrentSession().createQuery("from Anho order by str_anho").list();
			return listAnhos;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return null;
		}
		
	}
	
}
