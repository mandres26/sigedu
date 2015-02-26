package pe.com.consultisoft.service.impl.commons;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.com.consultisoft.dao.commons.UgelDao;
import pe.com.consultisoft.model.Parametro;
import pe.com.consultisoft.service.commons.UgelService;

@Service
public class UgelServiceImpl implements UgelService {
	@Autowired
	private UgelDao ugelDao;
	@Override
	@Transactional
	
	public List<Parametro> listUgeles() {
		return ugelDao.listUgeles();
	}
}