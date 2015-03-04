package pe.com.consultisoft.service.administrativo;

import java.util.List;

import pe.com.consultisoft.model.Docente;

public interface DocenteService{
	public List<Docente> list();
	public int add(Docente docente);
	public int update(Docente docente);
	public int delete(int int_iddocente);
	public List<Docente> find(Docente docente);
	public Docente find(int int_iddocente);
}