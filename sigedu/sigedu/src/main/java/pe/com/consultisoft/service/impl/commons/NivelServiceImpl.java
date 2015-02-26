package pe.com.consultisoft.service.impl.commons;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.com.consultisoft.dao.commons.NivelDao;
import pe.com.consultisoft.model.Parametro;
import pe.com.consultisoft.service.commons.NivelService;

@Service
public class NivelServiceImpl implements NivelService {
	@Autowired
	private NivelDao nivelDao;
	@Override
	@Transactional
	
	public List<Parametro> listNiveles() {
		return nivelDao.listNiveles();
	}
}