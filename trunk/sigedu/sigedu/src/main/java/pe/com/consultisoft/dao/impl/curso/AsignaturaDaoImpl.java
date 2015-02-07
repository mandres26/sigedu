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
//import pe.com.consultisoft.model.Parametro;
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
			listAsignaturas = sessionFactory.getCurrentSession().createQuery("from Asignatura order by str_curso").list();
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
			asignatura.setInt_idestado(Constantes.Estados.EST_ACTIVO1);
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
	public int delete(int int_idcurso) {
		try{
			Asignatura asignatura = (Asignatura)sessionFactory.getCurrentSession().get(Asignatura.class, int_idcurso);
			asignatura.setInt_idestado(Constantes.Estados.EST_INACTIVO1);
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
			String query = "from Asignatura where str_curso like '%"+asignatura.getStr_curso().trim()+"%'";
			listAsignaturas = sessionFactory.getCurrentSession().createQuery(query).list();
			return listAsignaturas;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return null;
		}
	}

	@Override
	public Asignatura find(int int_idcurso) {
		try{
			return (Asignatura) sessionFactory.getCurrentSession().get(Asignatura.class, int_idcurso);
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return null;
		}
	}
	
	//Validar.
	/*
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
