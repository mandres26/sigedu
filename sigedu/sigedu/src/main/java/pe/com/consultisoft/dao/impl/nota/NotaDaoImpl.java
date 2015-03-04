package pe.com.consultisoft.dao.impl.nota;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.com.consultisoft.controller.administrativo.DocenteController;
import pe.com.consultisoft.dao.nota.*;
import pe.com.consultisoft.model.Nota;
//import pe.com.consultisoft.model.Parametro;
import pe.com.consultisoft.utilitarios.Constantes;

@Repository
public class NotaDaoImpl implements NotaDao {
	@Autowired
    private SessionFactory sessionFactory;
	
	private static final Logger logger = LoggerFactory.getLogger(NotaDaoImpl.class);

	@Override
	public List<Nota> list() {
		try{
			List<Nota> listNotas = new ArrayList();
			listNotas = sessionFactory.getCurrentSession().createQuery("from Nota order by Nota").list();
			return listNotas;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return null;
		}	
	}

	@Override
	public int add(Nota nota) {
		try{
			nota.setInt_idestado(Constantes.Estados.EST_ACTIVO1);
			sessionFactory.getCurrentSession().save(nota);
			//sessionFactory.getCurrentSession().flush();
			return 0;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return -1;
		}
	}

	@Override
	public int update(Nota nota) {
		try{
			sessionFactory.getCurrentSession().update(nota);
			return 0;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return -1;
		}
	}

	@Override
	public int delete(int int_idnotas) {
		try{
			Nota nota = (Nota)sessionFactory.getCurrentSession().get(Nota.class, int_idnotas);
			nota.setInt_idestado(Constantes.Estados.EST_INACTIVO1);
			sessionFactory.getCurrentSession().save(nota);
			return 0;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return -1;
		}
	}

	@Override
	public List<Nota> find(Nota nota) {
		try{
			List<Nota> listNotas = new ArrayList();
			String query = "from Nota where int_idnotas ="+nota.getInt_idnotas();
			listNotas = sessionFactory.getCurrentSession().createQuery(query).list();
			return listNotas;
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			return null;
		}
	}

	@Override
	public Nota find(int int_idnotas) {
		try{
			return (Nota) sessionFactory.getCurrentSession().get(Nota.class, int_idnotas);
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
