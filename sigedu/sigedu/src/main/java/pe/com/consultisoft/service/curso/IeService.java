package pe.com.consultisoft.service.curso;

import java.util.List;

import pe.com.consultisoft.model.Ie;

public interface IeService{
	public List<Ie> list();
	public int add(Ie ie);
	public int update(Ie ie);
	public int delete(int int_idie);
	public List<Ie> find(Ie ie);
	public Ie find(int int_idie);
}