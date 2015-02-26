package pe.com.consultisoft.service.impl.commons;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.com.consultisoft.dao.commons.GestionDao;
import pe.com.consultisoft.model.Parametro;
import pe.com.consultisoft.service.commons.GestionService;

@Service
public class GestionServiceImpl implements GestionService {
	@Autowired
	private GestionDao gestionDao;
	@Override
	@Transactional
	
	public List<Parametro> listGestiones() {
		return gestionDao.listGestiones();
	}
}
