package pe.com.consultisoft.service.impl.commons;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.com.consultisoft.dao.commons.ModalidadDao;
import pe.com.consultisoft.model.Parametro;
import pe.com.consultisoft.service.commons.ModalidadService;

@Service
public class ModalidadServiceImpl implements ModalidadService {
	@Autowired
	private ModalidadDao modalidadDao;
	@Override
	@Transactional
	
	public List<Parametro> listModalidades() {
		return modalidadDao.listModalidades();
	}
}