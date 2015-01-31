package pe.com.consultisoft.dao.curso;

import java.util.List;

import pe.com.consultisoft.model.Curricula;

public interface CurriculaDao {
	public List<Curricula> list();
	public int add(Curricula curricula);
	public int update(Curricula curricula);
	public int delete(int idCurricula);
	public List<Curricula> find(Curricula curricula);
	public Curricula find(int idCurricula);
}
