package pe.com.consultisoft.service.impl.curso;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.com.consultisoft.service.curso.ColegioService;
import pe.com.consultisoft.dao.curso.ColegioDao;
import pe.com.consultisoft.model.Colegio;

@Service
public class ColegioServiceImpl implements ColegioService{
	@Autowired
	private ColegioDao colegioDao;
	@Override
	@Transactional
	public List<Colegio> list() {
		// TODO Auto-generated method stub
		return colegioDao.list();
	}
	@Override
	@Transactional
	public int add(Colegio colegio) {
		return colegioDao.add(colegio);
	}
	@Override
	@Transactional
	public int update(Colegio colegio) {
		return colegioDao.update(colegio);
	}
	@Override
	@Transactional
	public int delete(int int_idcolegio) {
		return colegioDao.delete(int_idcolegio);
	}
	@Override
	@Transactional
	public List<Colegio> find(Colegio colegio) {
		return colegioDao.find(colegio);
	}
	@Override
	@Transactional
	public Colegio find(int int_idcolegio) {
		return colegioDao.find(int_idcolegio);
	}
}