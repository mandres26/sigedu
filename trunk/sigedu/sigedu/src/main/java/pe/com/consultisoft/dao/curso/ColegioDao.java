package pe.com.consultisoft.dao.curso;

import java.util.List;

import pe.com.consultisoft.model.Colegio;

public interface ColegioDao {
	public List<Colegio> list();
	public int add(Colegio colegio);
	public int update(Colegio colegio);
	public int delete(int idColegio);
	public List<Colegio> find(Colegio colegio);
	public Colegio find(int idColegio);
}