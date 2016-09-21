package com.xiaoyu.service.imp;

import com.xiaoyu.dao.HelloDao;
import com.xiaoyu.dao.imp.HelloDaoImp;
import com.xiaoyu.model.Person;
import com.xiaoyu.service.HelloService;

public class HelloServiceImp implements HelloService {
	private HelloDao helloDao;

	@Override
	public boolean checkUser(Person p) {
		// TODO Auto-generated method stub
		if (helloDao.checkUser(p))
			return true;
		return false;
	}

	public HelloDao getHelloDao() {
		return helloDao;
	}

	public void setHelloDao(HelloDao helloDao) {
		this.helloDao = helloDao;
	}

}
