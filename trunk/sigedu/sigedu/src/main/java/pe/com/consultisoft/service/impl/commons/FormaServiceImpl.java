package pe.com.consultisoft.service.impl.commons;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.com.consultisoft.dao.commons.FormaDao;
import pe.com.consultisoft.model.Parametro;
import pe.com.consultisoft.service.commons.FormaService;

@Service
public class FormaServiceImpl implements FormaService {
	
	@Autowired
	private FormaDao formaDao;
	@Override
	@Transactional
	
	public List<Parametro> listFormas() {
		return formaDao.listFormas();
	}
}