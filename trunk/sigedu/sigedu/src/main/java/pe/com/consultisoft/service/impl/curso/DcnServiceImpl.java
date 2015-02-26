package pe.com.consultisoft.service.impl.curso;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.com.consultisoft.service.curso.DcnService;
import pe.com.consultisoft.dao.curso.DcnDao;
import pe.com.consultisoft.model.Dcn;

@Service
public class DcnServiceImpl implements DcnService{
	@Autowired
	private DcnDao dcnDao;
	@Override
	@Transactional
	public List<Dcn> list() {
		// TODO Auto-generated method stub
		return dcnDao.list();
	}
	@Override
	@Transactional
	public int add(Dcn dcn) {
		return dcnDao.add(dcn);
	}
	@Override
	@Transactional
	public int update(Dcn dcn) {
		return dcnDao.update(dcn);
	}
	@Override
	@Transactional
	public int delete(int int_iddcn) {
		return dcnDao.delete(int_iddcn);
	}
	@Override
	@Transactional
	public List<Dcn> find(Dcn dcn) {
		return dcnDao.find(dcn);
	}
	@Override
	@Transactional
	public Dcn find(int int_iddcn) {
		return dcnDao.find(int_iddcn);
	}
}