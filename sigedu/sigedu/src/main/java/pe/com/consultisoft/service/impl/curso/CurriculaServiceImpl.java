package pe.com.consultisoft.service.impl.curso;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.com.consultisoft.dao.curso.CurriculaDao;
import pe.com.consultisoft.model.Curricula;
import pe.com.consultisoft.service.curso.CurriculaService;

@Service
public class CurriculaServiceImpl implements CurriculaService{
	@Autowired
	private CurriculaDao curriculaDao;
	@Override
	@Transactional
	public List<Curricula> list() {
		// TODO Auto-generated method stub
		return curriculaDao.list();
	}
	@Override
	@Transactional
	public int add(Curricula curricula) {
		return curriculaDao.add(curricula);
	}
	@Override
	@Transactional
	public int update(Curricula curricula) {
		return curriculaDao.update(curricula);
	}
	@Override
	@Transactional
	public int delete(int idCurricula) {
		return curriculaDao.delete(idCurricula);
	}
	@Override
	@Transactional
	public List<Curricula> find(Curricula curricula) {
		return curriculaDao.find(curricula);
	}
	@Override
	@Transactional
	public Curricula find(int idCurricula) {
		return curriculaDao.find(idCurricula);
	}
}
