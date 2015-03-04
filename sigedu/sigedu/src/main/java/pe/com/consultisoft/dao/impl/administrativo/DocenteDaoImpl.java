package pe.com.consultisoft.dao.impl.administrativo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.com.consultisoft.controller.administrativo.DocenteController;
import pe.com.consultisoft.dao.administrativo.DocenteDao;
import pe.com.consultisoft.model.Docente;
//import pe.com.consultisoft.model.Parametro;
import pe.com.consultisoft.utilitarios.Constantes;

@Repository
public class DocenteDaoImpl implements DocenteDao {
	@Autowired
    private SessionFactory sessionFactory;
	
	private static final Logger logger = LoggerFactory.getLogger(DocenteDaoImpl.class);

	@Override
	public List<Docente> list() {
		try{
			List<Docente> listDocentes = new ArrayList();
			listDocentes = sessionFactory.getCurrentSession().createQuery("from Docente order by str_nombre").list();
			return listDocentes;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return null;
		}	
	}

	@Override
	public int add(Docente docente) {
		try{
			docente.setInt_idestado(Constantes.Estados.EST_ACTIVO1);
			sessionFactory.getCurrentSession().save(docente);
			//sessionFactory.getCurrentSession().flush();
			return 0;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return -1;
		}
	}

	@Override
	public int update(Docente docente) {
		try{
			sessionFactory.getCurrentSession().update(docente);
			return 0;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return -1;
		}
	}

	@Override
	public int delete(int int_iddocente) {
		try{
			Docente docente = (Docente)sessionFactory.getCurrentSession().get(Docente.class, int_iddocente);
			docente.setInt_idestado(Constantes.Estados.EST_INACTIVO1);
			sessionFactory.getCurrentSession().save(docente);
			return 0;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return -1;
		}
	}

	@Override
	public List<Docente> find(Docente docente) {
		try{
			List<Docente> listDocentes = new ArrayList();
			String query = "from Docente where str_nombre like '%"+docente.getStr_nombre().trim()+"%'";
			listDocentes = sessionFactory.getCurrentSession().createQuery(query).list();
			return listDocentes;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return null;
		}
	}

	@Override
	public Docente find(int int_iddocente) {
		try{
			return (Docente) sessionFactory.getCurrentSession().get(Docente.class, int_iddocente);
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return null;
		}
	}
	
/*	//Validar.
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
	}	*/
}
