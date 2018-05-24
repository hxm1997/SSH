package com.ssh.daoImpl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import com.ssh.Dao.UserDao;
import com.ssh.entity.User;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(User u) {
		// TODO Auto-generated method stub
		
		Session openSession = sessionFactory.openSession();
		openSession.beginTransaction();
		openSession.save(u);
		openSession.getTransaction().commit();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	

}
