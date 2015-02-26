package pe.com.consultisoft.service.impl.commons;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.com.consultisoft.dao.commons.EstadoDao;
import pe.com.consultisoft.model.Parametro;
import pe.com.consultisoft.service.commons.EstadoService;

@Service
public class EstadoServiceImpl implements EstadoService {
	@Autowired
	private EstadoDao estadoDao;
	@Override
	@Transactional
	
	public List<Parametro> listEstados() {
		return estadoDao.listEstados();
	}
}
