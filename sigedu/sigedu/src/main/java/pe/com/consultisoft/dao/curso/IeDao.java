package pe.com.consultisoft.dao.curso;

import java.util.List;

import pe.com.consultisoft.model.Ie;
//import pe.com.consultisoft.model.Parametro;

public interface IeDao {
	public List<Ie> list();
	public int add(Ie ie);
	public int update(Ie ie);
	public int delete(int int_idie);
	public List<Ie> find(Ie ie);
	public Ie find(int int_idie);
	//public List<Parametro> listEstado();
}
