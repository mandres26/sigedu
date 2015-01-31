package pe.com.consultisoft.dao.impl.curso;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.com.consultisoft.controller.curso.CurriculaController;
import pe.com.consultisoft.dao.curso.CurriculaDao;
import pe.com.consultisoft.model.Curricula;
import pe.com.consultisoft.utilitarios.Constantes;

@Repository
public class CurriculaDaoImpl implements CurriculaDao {
	@Autowired
    private SessionFactory sessionFactory;
	
	private static final Logger logger = LoggerFactory.getLogger(CurriculaDaoImpl.class);

	@Override
	public List<Curricula> list() {
		try{
			List<Curricula> listCurriculas = new ArrayList();
			listCurriculas = sessionFactory.getCurrentSession().createQuery("from Curricula order by nombre").list();
			return listCurriculas;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return null;
		}
		
	}


	@Override
	public int add(Curricula curricula) {
		try{
			curricula.setEstado(Constantes.Estados.EST_ACTIVO);
			sessionFactory.getCurrentSession().save(curricula);
			//sessionFactory.getCurrentSession().flush();
			return 0;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return -1;
		}

	}


	@Override
	public int update(Curricula curricula) {
		try{
			sessionFactory.getCurrentSession().update(curricula);
			return 0;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return -1;
		}
	}


	@Override
	public int delete(int idCurricula) {
		try{
			Curricula curricula = (Curricula)sessionFactory.getCurrentSession().get(Curricula.class, idCurricula);
			curricula.setEstado(Constantes.Estados.EST_INACTIVO);
			sessionFactory.getCurrentSession().save(curricula);
			return 0;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return -1;
		}
	}


	@Override
	public List<Curricula> find(Curricula curricula) {
		try{
			List<Curricula> listCurriculas = new ArrayList();
			String query = "from Curricula where nombre like '"+curricula.getNombre().trim()+"%'";
			listCurriculas = sessionFactory.getCurrentSession().createQuery(query).list();
			return listCurriculas;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return null;
		}
	}


	@Override
	public Curricula find(int idCurricula) {
		try{
			return (Curricula) sessionFactory.getCurrentSession().get(Curricula.class, idCurricula);
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return null;
		}
	}

	
}
