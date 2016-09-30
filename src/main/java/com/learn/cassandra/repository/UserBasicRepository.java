package com.learn.cassandra.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.repository.CassandraRepository;

import com.learn.cassandra.entity.UserBasic;

public interface UserBasicRepository extends CassandraRepository<UserBasic> {
	//Don't be smart now and thank spring-data for functions it provide :p
}
