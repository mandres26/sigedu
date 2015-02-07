package pe.com.consultisoft.service.commons;

import java.util.List;

import pe.com.consultisoft.model.Departamento;
import pe.com.consultisoft.model.Provincia;

public interface UbigeoService {
	public List<Departamento> listDepartamentos();
	public List<Provincia> findProvinciasPorDepartamento(int idDepartamento);

}
