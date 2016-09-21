package com.xiaoyu.dao.imp;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.xiaoyu.dao.HelloDao;
import com.xiaoyu.model.Person;

public class HelloDaoImp extends HibernateDaoSupport implements HelloDao {
	private SessionFactory sessionFactory;

	@Override
	public boolean checkUser(Person p) {
		try {
			List<?> l = getHibernateTemplate().find("from Person p where p.username=?", p.getUsername());
			if (l.size() > 0) {
				return true;
			}
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return false;
	}

}
