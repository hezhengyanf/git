package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import dao.YuanDaoMapper;
import entity.Yuan;
import service.YuanService;
@Service("yuanService")
@Transactional
public class YuanServiceImpl implements YuanService {
	@Autowired
private YuanDaoMapper y;
	public YuanServiceImpl() {
	super();
	// TODO Auto-generated constructor stub
}

	public YuanServiceImpl(YuanDaoMapper y) {
	super();
	this.y = y;
}

	@Override
	public int Del1(int id) {
		// TODO Auto-generated method stub
		return y.Del(id);
	}

	@Override
	public int set1(Yuan yuan) {
		// TODO Auto-generated method stub
		return y.set(yuan);
	}

	@Override
	public List<Yuan> Cha1() {
		// TODO Auto-generated method stub
		return y.Cha();
	}
    @Transactional(propagation=Propagation.SUPPORTS)
	@Override
	public List<Yuan> getMo1(String word, String yuangongname) {
		// TODO Auto-generated method stub
		return y.getMo(word, yuangongname);
	}

}
