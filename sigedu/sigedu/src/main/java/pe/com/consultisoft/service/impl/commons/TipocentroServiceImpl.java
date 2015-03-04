package pe.com.consultisoft.service.impl.commons;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.com.consultisoft.dao.commons.TipocentroDao;
import pe.com.consultisoft.model.Parametro;
import pe.com.consultisoft.service.commons.TipocentroService;

@Service
public class TipocentroServiceImpl implements TipocentroService {
	@Autowired
	private TipocentroDao tipocentroDao;
	@Override
	@Transactional
	
	public List<Parametro> listTipocentros() {
		return tipocentroDao.listTipocentros();
	}
}