package pe.com.consultisoft.dao.curso;

import java.util.List;

import pe.com.consultisoft.model.Asignatura;

public interface AsignaturaDao {
	public List<Asignatura> list();
	public int add(Asignatura asignatura);
	public int update(Asignatura asignatura);
	public int delete(int int_idcurso);
	public List<Asignatura> find(Asignatura asignatura);
	public Asignatura find(int int_idcurso);
}