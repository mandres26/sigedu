package pe.com.consultisoft.service.impl.matricula;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.com.consultisoft.dao.matricula.AlumnoDao;
import pe.com.consultisoft.model.Alumno;
import pe.com.consultisoft.service.matricula.AlumnoService;

@Service
public class AlumnoServiceImpl implements AlumnoService{
	@Autowired
	private AlumnoDao alumnoDao;
	@Override
	@Transactional
	public List<Alumno> list() {
		// TODO Auto-generated method stub
		return alumnoDao.list();
	}
	@Override
	@Transactional
	public int add(Alumno alumno) {
		return alumnoDao.add(alumno);
	}
	@Override
	@Transactional
	public int update(Alumno alumno) {
		return alumnoDao.update(alumno);
	}
	@Override
	@Transactional
	public int delete(int idAlumno) {
		return alumnoDao.delete(idAlumno);
	}
	@Override
	@Transactional
	public List<Alumno> find(Alumno alumno) {
		return alumnoDao.find(alumno);
	}
	@Override
	@Transactional
	public Alumno find(int idAlumno) {
		return alumnoDao.find(idAlumno);
	}

	
}
