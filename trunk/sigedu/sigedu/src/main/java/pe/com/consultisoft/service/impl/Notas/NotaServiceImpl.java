package pe.com.consultisoft.service.impl.Notas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.com.consultisoft.service.notas.NotaService;
import pe.com.consultisoft.dao.nota.*;
import pe.com.consultisoft.model.Nota;

@Service
public class NotaServiceImpl implements NotaService{
	@Autowired
	private NotaDao notaDao;
	@Override
	@Transactional
	public List<Nota> list() {
		// TODO Auto-generated method stub
		return notaDao.list();
	}
	@Override
	@Transactional
	public int add(Nota nota) {
		return notaDao.add(nota);
	}
	@Override
	@Transactional
	public int update(Nota nota) {
		return notaDao.update(nota);
	}
	@Override
	@Transactional
	public int delete(int int_idnotas) {
		return notaDao.delete(int_idnotas);
	}
	@Override
	@Transactional
	public List<Nota> find(Nota nota) {
		return notaDao.find(nota);
	}
	@Override
	@Transactional
	public Nota find(int int_idnotas) {
		return notaDao.find(int_idnotas);
	}
}