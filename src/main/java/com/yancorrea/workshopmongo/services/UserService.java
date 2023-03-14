package com.yancorrea.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yancorrea.workshopmongo.domain.User;
import com.yancorrea.workshopmongo.repository.UserRepository;

@Service 
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User>findAll(){
		return repo.findAll();
	}

}
