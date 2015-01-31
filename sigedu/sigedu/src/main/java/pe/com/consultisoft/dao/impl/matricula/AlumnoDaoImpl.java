package pe.com.consultisoft.dao.impl.matricula;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.com.consultisoft.controller.matricula.AlumnoController;
import pe.com.consultisoft.dao.matricula.AlumnoDao;
import pe.com.consultisoft.model.Alumno;
import pe.com.consultisoft.utilitarios.Constantes;

@Repository
public class AlumnoDaoImpl implements AlumnoDao {
	@Autowired
    private SessionFactory sessionFactory;
	
	private static final Logger logger = LoggerFactory.getLogger(AlumnoDaoImpl.class);

	@Override
	public List<Alumno> list() {
		try{
			List<Alumno> listAlumnos = new ArrayList();
			listAlumnos = sessionFactory.getCurrentSession().createQuery("from Alumno order by paterno, materno, nombres").list();
			return listAlumnos;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return null;
		}
		
	}


	@Override
	public int add(Alumno alumno) {
		try{
			alumno.setEstado(Constantes.Estados.EST_ACTIVO);
			sessionFactory.getCurrentSession().save(alumno);
			//sessionFactory.getCurrentSession().flush();
			return 0;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return -1;
		}

	}


	@Override
	public int update(Alumno alumno) {
		try{
			sessionFactory.getCurrentSession().update(alumno);
			return 0;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return -1;
		}
	}


	@Override
	public int delete(int idAlumno) {
		try{
			Alumno alumno = (Alumno)sessionFactory.getCurrentSession().get(Alumno.class, idAlumno);
			alumno.setEstado(Constantes.Estados.EST_INACTIVO);
			sessionFactory.getCurrentSession().save(alumno);
			return 0;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return -1;
		}
	}


	@Override
	public List<Alumno> find(Alumno alumno) {
		try{
			List<Alumno> listAlumnos = new ArrayList();
			String query = "from Alumno where paterno like '"+alumno.getPaterno().trim()+"%'" +
							" and materno like '"+alumno.getMaterno().trim()+"%'" +
							" and nombres like '"+alumno.getNombres().trim()+"%'";
			listAlumnos = sessionFactory.getCurrentSession().createQuery(query).list();
			return listAlumnos;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return null;
		}
	}


	@Override
	public Alumno find(int idAlumno) {
		try{
			return (Alumno) sessionFactory.getCurrentSession().get(Alumno.class, idAlumno);
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return null;
		}
	}

	
}
