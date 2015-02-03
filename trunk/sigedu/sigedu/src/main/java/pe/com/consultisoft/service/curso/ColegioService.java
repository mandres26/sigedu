package pe.com.consultisoft.service.curso;

import java.util.List;

import pe.com.consultisoft.model.Colegio;

public interface ColegioService{
	public List<Colegio> list();
	public int add(Colegio colegio);
	public int update(Colegio colegio);
	public int delete(int int_idcolegio);
	public List<Colegio> find(Colegio colegio);
	public Colegio find(int int_idcolegio);
}