package pe.com.consultisoft.dao.curso;

import java.util.List;

import pe.com.consultisoft.model.Plc;
//import pe.com.consultisoft.model.Parametro;

public interface PlcDao {
	public List<Plc> list();
	public int add(Plc plc);
	public int update(Plc plc);
	public int delete(int int_idplc);
	public List<Plc> find(Plc plc);
	public Plc find(int int_idplc);
	//public List<Parametro> listEstado();
}
