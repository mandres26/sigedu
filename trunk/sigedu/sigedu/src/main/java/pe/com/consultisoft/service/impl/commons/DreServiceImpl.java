package pe.com.consultisoft.service.impl.commons;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.com.consultisoft.dao.commons.DreDao;
import pe.com.consultisoft.model.Parametro;
import pe.com.consultisoft.service.commons.DreService;

@Service
public class DreServiceImpl implements DreService {
	@Autowired
	private DreDao dreDao;
	@Override
	@Transactional
	
	public List<Parametro> listDres() {
		return dreDao.listDres();
	}
}