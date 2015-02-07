package pe.com.consultisoft.dao.impl.commons;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.com.consultisoft.dao.commons.UbigeoDao;
import pe.com.consultisoft.dao.impl.matricula.AlumnoDaoImpl;
import pe.com.consultisoft.model.Alumno;
import pe.com.consultisoft.model.Departamento;
import pe.com.consultisoft.model.Provincia;

@Repository
public class UbigeoDaoImpl implements UbigeoDao {
	@Autowired
    private SessionFactory sessionFactory;
	
	private static final Logger logger = LoggerFactory.getLogger(AlumnoDaoImpl.class);
	
	@Override
	public List<Departamento> listDepartamentos() {
		try{
			List<Departamento> listDepartamentos = new ArrayList();
			listDepartamentos = sessionFactory.getCurrentSession().createQuery("from Departamento order by nombre").list();
			return listDepartamentos;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return null;
		}
	}

	@Override
	public List<Provincia> findProvinciasPorDepartamento(int idDepartamento) {
		try{
			List<Provincia> listProvincias = new ArrayList();
			listProvincias = sessionFactory.getCurrentSession().createQuery("from Provincia where departamento.id="+ idDepartamento + " order by nombre").list();
			return listProvincias;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return null;
		}
	}

}
