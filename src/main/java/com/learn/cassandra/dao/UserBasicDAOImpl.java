package com.learn.cassandra.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.learn.cassandra.entity.UserBasic;
import com.learn.cassandra.util.MyCassandraTemplate;

public class UserBasicDAOImpl implements UserBasicDAO {

	@Autowired
	MyCassandraTemplate cassandraTemplate;
	
	@Override
	public UserBasic createUserBasic(UserBasic user) {
		return cassandraTemplate.create(user);
	}

	@Override
	public UserBasic getUserBasic(int id) {
		return cassandraTemplate.findById(id, UserBasic.class);
	}

	@Override
	public UserBasic updateUserBasic(UserBasic user) {
		return cassandraTemplate.update(user, UserBasic.class);
	}

	@Override
	public void deleteUserBasic(int id) {
		cassandraTemplate.deleteById(id, UserBasic.class);
	}

	@Override
	public List<UserBasic> getAllUserBasics() {
		return cassandraTemplate.findAll(UserBasic.class);
	}

}
