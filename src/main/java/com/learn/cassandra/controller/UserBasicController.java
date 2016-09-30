package com.learn.cassandra.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.learn.cassandra.entity.UserBasic;
import com.learn.cassandra.repository.UserBasicRepository;

@RestController
public class UserBasicController {

	@Autowired
	UserBasicRepository UBrepo;
	
	@RequestMapping(value = "/getAllUserBasics",method = RequestMethod.GET)
	@ResponseBody
	public List<UserBasic> getAllUserBasics(){
		List<UserBasic> result = new ArrayList<UserBasic>();
		UBrepo.findAll().forEach(e->result.add(e));
		return result;
	}
}
