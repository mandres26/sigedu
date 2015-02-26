package pe.com.consultisoft.service.impl.commons;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.com.consultisoft.dao.commons.GeneroDao;
import pe.com.consultisoft.model.Parametro;
import pe.com.consultisoft.service.commons.GeneroService;

@Service
public class GeneroServiceImpl implements GeneroService {
	@Autowired
	private GeneroDao generoDao;
	@Override
	@Transactional
	
	public List<Parametro> listGeneros() {
		return generoDao.listGeneros();
	}
}
