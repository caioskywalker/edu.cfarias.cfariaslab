package edu.cfarias.cfariaslab.service;

import edu.cfarias.cfariaslab.domain.model.User;

public interface UserService {
	
	User findById(Long id);
	User create(User userToCreate);

}
