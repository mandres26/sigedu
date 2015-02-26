package pe.com.consultisoft.dao.curso;

import java.util.List;

import pe.com.consultisoft.model.Dcn;
//import pe.com.consultisoft.model.Parametro;

public interface DcnDao {
	public List<Dcn> list();
	public int add(Dcn dcn);
	public int update(Dcn dcn);
	public int delete(int int_iddcn);
	public List<Dcn> find(Dcn dcn);
	public Dcn find(int int_iddcn);
	//public List<Parametro> listEstado();
}
