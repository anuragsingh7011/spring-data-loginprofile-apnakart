package com.apnakart.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apnakart.login.dao.UserDao;
import com.apnakart.login.entity.UserEntity;
import com.apnakart.login.pojo.UserPojo;

@Service
public class UserService {

	@Autowired
	UserDao userDao;

	public UserEntity doLogin(UserPojo userPojo) {
		System.out.println("UserService.doLogin()-----------start UserService" + userPojo.getEmail());

		UserEntity userEntity = new UserEntity();

		userEntity.setEmail(userPojo.getEmail());
		userEntity.setPassword(userPojo.getPassword());

//		int response = userDao.saveLogin(userEntity);
		System.out.println("UserService.doLogin()-----------start UserService");
		
		return userDao.saveLogin(userEntity);

	}
}
