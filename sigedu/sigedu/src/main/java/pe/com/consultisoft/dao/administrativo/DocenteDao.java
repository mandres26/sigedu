package pe.com.consultisoft.dao.administrativo;

import java.util.List;

import pe.com.consultisoft.model.Docente;
//import pe.com.consultisoft.model.Parametro;

public interface DocenteDao {
	public List<Docente> list();
	public int add(Docente docente);
	public int update(Docente docente);
	public int delete(int int_iddocente);
	public List<Docente> find(Docente docente);
	public Docente find(int int_iddocente);
	//public List<Parametro> listEstado();
}