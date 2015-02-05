package pe.com.consultisoft.service.impl.curso;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.com.consultisoft.dao.curso.AsignaturaDao;
import pe.com.consultisoft.model.Asignatura;
import pe.com.consultisoft.service.curso.AsignaturaService;

@Service
public class AsignaturaServiceImpl implements AsignaturaService{
	@Autowired
	private AsignaturaDao asignaturaDao;
	@Override
	@Transactional
	public List<Asignatura> list() {
		// TODO Auto-generated method stub
		return asignaturaDao.list();
	}
	@Override
	@Transactional
	public int add(Asignatura asignatura) {
		return asignaturaDao.add(asignatura);
	}
	@Override
	@Transactional
	public int update(Asignatura asignatura) {
		return asignaturaDao.update(asignatura);
	}
	@Override
	@Transactional
	public int delete(int int_idcurso) {
		return asignaturaDao.delete(int_idcurso);
	}
	@Override
	@Transactional
	public List<Asignatura> find(Asignatura asignatura) {
		return asignaturaDao.find(asignatura);
	}
	@Override
	@Transactional
	public Asignatura find(int int_idcurso) {
		return asignaturaDao.find(int_idcurso);
	}
}
