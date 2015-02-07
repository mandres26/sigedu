package pe.com.consultisoft.dao.commons;

import java.util.List;

import pe.com.consultisoft.model.Departamento;
import pe.com.consultisoft.model.Provincia;

public interface UbigeoDao {
	public List<Departamento> listDepartamentos();
	public List<Provincia> findProvinciasPorDepartamento(int idDepartamento);
}
