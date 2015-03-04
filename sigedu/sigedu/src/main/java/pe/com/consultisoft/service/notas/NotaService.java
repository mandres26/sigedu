package pe.com.consultisoft.service.notas;

import java.util.List;

import pe.com.consultisoft.model.Nota;

public interface NotaService{
	public List<Nota> list();
	public int add(Nota nota);
	public int update(Nota nota);
	public int delete(int int_idnotas);
	public List<Nota> find(Nota nota);
	public Nota find(int int_idnotas);
}