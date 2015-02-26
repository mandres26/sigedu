package pe.com.consultisoft.service.impl.curso;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.com.consultisoft.service.curso.IeService;
import pe.com.consultisoft.dao.curso.IeDao;
import pe.com.consultisoft.model.Ie;

@Service
public class IeServiceImpl implements IeService{
	@Autowired
	private IeDao ieDao;
	@Override
	@Transactional
	public List<Ie> list() {
		// TODO Auto-generated method stub
		return ieDao.list();
	}
	@Override
	@Transactional
	public int add(Ie ie) {
		return ieDao.add(ie);
	}
	@Override
	@Transactional
	public int update(Ie ie) {
		return ieDao.update(ie);
	}
	@Override
	@Transactional
	public int delete(int int_idie) {
		return ieDao.delete(int_idie);
	}
	@Override
	@Transactional
	public List<Ie> find(Ie ie) {
		return ieDao.find(ie);
	}
	@Override
	@Transactional
	public Ie find(int int_idie) {
		return ieDao.find(int_idie);
	}
}