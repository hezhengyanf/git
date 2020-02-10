package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import dao.BuDaoMapper;
import entity.Bu;
import service.BuService;
@Service("buService")
@Transactional
public class BuServiceImpl implements BuService{
	@Autowired
  private BuDaoMapper b;
 
	public BuServiceImpl(BuDaoMapper b) {
	super();
	this.b = b;
}

	public BuServiceImpl() {
	super();
	// TODO Auto-generated constructor stub
}
   
	
	@Transactional(propagation=Propagation.SUPPORTS)
	@Override
	public List<Bu> Cha1() {
		// TODO Auto-generated method stub
		return b.Cha();
	}
   
	@Override
	public Bu UpStudent1(int bumenTableid) {
		// TODO Auto-generated method stub
		return b.UpStudent(bumenTableid);
	}

}
