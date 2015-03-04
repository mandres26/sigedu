package pe.com.consultisoft.service.impl.administrativo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.com.consultisoft.service.administrativo.DocenteService;
import pe.com.consultisoft.dao.administrativo.DocenteDao;
import pe.com.consultisoft.model.Docente;

@Service
public class DocenteServiceImpl implements DocenteService{
	@Autowired
	private DocenteDao docenteDao;
	@Override
	@Transactional
	public List<Docente> list() {
		// TODO Auto-generated method stub
		return docenteDao.list();
	}
	@Override
	@Transactional
	public int add(Docente docente) {
		return docenteDao.add(docente);
	}
	@Override
	@Transactional
	public int update(Docente docente) {
		return docenteDao.update(docente);
	}
	@Override
	@Transactional
	public int delete(int int_iddocente) {
		return docenteDao.delete(int_iddocente);
	}
	@Override
	@Transactional
	public List<Docente> find(Docente docente) {
		return docenteDao.find(docente);
	}
	@Override
	@Transactional
	public Docente find(int int_iddocente) {
		return docenteDao.find(int_iddocente);
	}
}