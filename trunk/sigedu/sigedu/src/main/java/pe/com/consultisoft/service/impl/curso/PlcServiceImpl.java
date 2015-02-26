package pe.com.consultisoft.service.impl.curso;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.com.consultisoft.service.curso.PlcService;
import pe.com.consultisoft.dao.curso.PlcDao;
import pe.com.consultisoft.model.Plc;

@Service
public class PlcServiceImpl implements PlcService{
	@Autowired
	private PlcDao plcDao;
	@Override
	@Transactional
	public List<Plc> list() {
		// TODO Auto-generated method stub
		return plcDao.list();
	}
	@Override
	@Transactional
	public int add(Plc plc) {
		return plcDao.add(plc);
	}
	@Override
	@Transactional
	public int update(Plc plc) {
		return plcDao.update(plc);
	}
	@Override
	@Transactional
	public int delete(int int_idplc) {
		return plcDao.delete(int_idplc);
	}
	@Override
	@Transactional
	public List<Plc> find(Plc plc) {
		return plcDao.find(plc);
	}
	@Override
	@Transactional
	public Plc find(int int_idplc) {
		return plcDao.find(int_idplc);
	}
}