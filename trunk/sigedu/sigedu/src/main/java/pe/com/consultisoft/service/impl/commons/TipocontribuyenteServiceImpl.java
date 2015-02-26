package pe.com.consultisoft.service.impl.commons;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.com.consultisoft.dao.commons.TipocontribuyenteDao;
import pe.com.consultisoft.model.Parametro;
import pe.com.consultisoft.service.commons.TipocontribuyenteService;

@Service
public class TipocontribuyenteServiceImpl implements TipocontribuyenteService {
	@Autowired
	private TipocontribuyenteDao tipocontribuyenteDao;
	@Override
	@Transactional
	
	public List<Parametro> listTipocontribuyentes() {
		return tipocontribuyenteDao.listTipocontribuyentes();
	}
}
