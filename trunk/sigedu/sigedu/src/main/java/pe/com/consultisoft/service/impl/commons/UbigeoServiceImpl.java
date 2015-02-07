package pe.com.consultisoft.service.impl.commons;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.com.consultisoft.dao.commons.UbigeoDao;
import pe.com.consultisoft.dao.matricula.AlumnoDao;
import pe.com.consultisoft.model.Departamento;
import pe.com.consultisoft.model.Provincia;
import pe.com.consultisoft.service.commons.UbigeoService;

@Service
public class UbigeoServiceImpl implements UbigeoService {
	@Autowired
	private UbigeoDao ubigeoDao;
	@Override
	@Transactional
	public List<Departamento> listDepartamentos() {
		return ubigeoDao.listDepartamentos();
	}

	@Override
	public List<Provincia> findProvinciasPorDepartamento(int idDepartamento) {
		return ubigeoDao.findProvinciasPorDepartamento(idDepartamento);
	}

}
