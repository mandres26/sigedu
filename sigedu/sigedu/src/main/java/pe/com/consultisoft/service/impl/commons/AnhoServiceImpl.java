package pe.com.consultisoft.service.impl.commons;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.com.consultisoft.dao.commons.AnhoDao;
import pe.com.consultisoft.model.Anho;
import pe.com.consultisoft.service.commons.AnhoService;

@Service
public class AnhoServiceImpl implements AnhoService {
	@Autowired
	private AnhoDao anhoDao;
	@Override
	@Transactional
	
	public List<Anho> listAnhos() {
		return anhoDao.listAnhos();
	}
}
