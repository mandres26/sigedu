package pe.com.consultisoft.dao.impl.curso;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.com.consultisoft.controller.curso.AsignaturaController;
import pe.com.consultisoft.dao.curso.AsignaturaDao;
import pe.com.consultisoft.model.Asignatura;
import pe.com.consultisoft.utilitarios.Constantes;

@Repository
public class AsignaturaDaoImpl implements AsignaturaDao {
	@Autowired
    private SessionFactory sessionFactory;
	
	private static final Logger logger = LoggerFactory.getLogger(AsignaturaDaoImpl.class);

	@Override
	public List<Asignatura> list() {
		try{
			List<Asignatura> listAsignaturas = new ArrayList();
			listAsignaturas = sessionFactory.getCurrentSession().createQuery("from Asignatura order by nombre").list();
			return listAsignaturas;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return null;
		}
		
	}


	@Override
	public int add(Asignatura asignatura) {
		try{
			asignatura.setEstado(Constantes.Estados.EST_ACTIVO);
			sessionFactory.getCurrentSession().save(asignatura);
			//sessionFactory.getCurrentSession().flush();
			return 0;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return -1;
		}

	}


	@Override
	public int update(Asignatura asignatura) {
		try{
			sessionFactory.getCurrentSession().update(asignatura);
			return 0;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return -1;
		}
	}


	@Override
	public int delete(int idAsignatura) {
		try{
			Asignatura asignatura = (Asignatura)sessionFactory.getCurrentSession().get(Asignatura.class, idAsignatura);
			asignatura.setEstado(Constantes.Estados.EST_INACTIVO);
			sessionFactory.getCurrentSession().save(asignatura);
			return 0;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return -1;
		}
	}


	@Override
	public List<Asignatura> find(Asignatura asignatura) {
		try{
			List<Asignatura> listAsignaturas = new ArrayList();
			String query = "from Asignatura where nombre like '"+asignatura.getNombre().trim()+"%'";
			listAsignaturas = sessionFactory.getCurrentSession().createQuery(query).list();
			return listAsignaturas;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return null;
		}
	}


	@Override
	public Asignatura find(int idAsignatura) {
		try{
			return (Asignatura) sessionFactory.getCurrentSession().get(Asignatura.class, idAsignatura);
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return null;
		}
	}

	
}
