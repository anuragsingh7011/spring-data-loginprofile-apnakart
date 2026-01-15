package com.apnakart.login.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.apnakart.login.entity.UserEntity;

@Repository
public class UserDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public UserEntity saveLogin(UserEntity userEntity) {
		System.out.println("UserDao.saveLogin():::::::::: start");
		Session session=sessionFactory.openSession();
		Transaction tnx=session.beginTransaction();
		Integer response=(Integer) session.save(userEntity);
		
		tnx.commit();
		System.out.println("UserDao.saveLogin():::::::::: end");
		return userEntity;
	
	}
}
