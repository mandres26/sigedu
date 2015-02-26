package pe.com.consultisoft.service.curso;

import java.util.List;

import pe.com.consultisoft.model.Plc;

public interface PlcService{
	public List<Plc> list();
	public int add(Plc plc);
	public int update(Plc plc);
	public int delete(int int_idplc);
	public List<Plc> find(Plc plc);
	public Plc find(int int_idplc);
}