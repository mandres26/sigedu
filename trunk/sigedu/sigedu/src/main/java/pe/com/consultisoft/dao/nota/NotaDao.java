package pe.com.consultisoft.dao.nota;

import java.util.List;

import pe.com.consultisoft.model.Nota;
//import pe.com.consultisoft.model.Parametro;

public interface NotaDao {
	public List<Nota> list();
	public int add(Nota nota);
	public int update(Nota nota);
	public int delete(int int_idnota);
	public List<Nota> find(Nota nota);
	public Nota find(int int_idnota);
	//public List<Parametro> listEstado();
}