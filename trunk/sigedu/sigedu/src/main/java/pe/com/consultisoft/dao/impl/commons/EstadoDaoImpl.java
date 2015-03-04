package pe.com.consultisoft.dao.impl.commons;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.com.consultisoft.dao.commons.EstadoDao;
//import pe.com.consultisoft.dao.impl.matricula.AlumnoDaoImpl;
import pe.com.consultisoft.model.Parametro;


@Repository
public class EstadoDaoImpl implements EstadoDao {
	@Autowired
    private SessionFactory sessionFactory;
	
	private static final Logger logger = LoggerFactory.getLogger(EstadoDaoImpl.class);
	
	@Override
	public List<Parametro> listEstados() {
		try{
			List<Parametro> listEstados = new ArrayList();
			listEstados = sessionFactory.getCurrentSession().createQuery("from Parametro where int_tipo_parametro=1 order by str_parametro").list();
			return listEstados;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return null;
		}
		
	}
	
}
