package com.guilhermeoscp.socialnetworkposts.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guilhermeoscp.socialnetworkposts.domain.User;
import com.guilhermeoscp.socialnetworkposts.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
}
