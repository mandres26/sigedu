package pe.com.consultisoft.service.curso;

import java.util.List;

import pe.com.consultisoft.model.Dcn;

public interface DcnService{
	public List<Dcn> list();
	public int add(Dcn dcn);
	public int update(Dcn dcn);
	public int delete(int int_iddcn);
	public List<Dcn> find(Dcn dcn);
	public Dcn find(int int_iddcn);
}