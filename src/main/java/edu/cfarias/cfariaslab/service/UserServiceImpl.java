package edu.cfarias.cfariaslab.service;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import edu.cfarias.cfariaslab.domain.model.User;
import edu.cfarias.cfariaslab.domain.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {

	
	private final UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public User findById(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	public User create(User userToCreate) {
		if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
			throw new IllegalArgumentException("This user ID already exists.");
		}
		return userRepository.save(userToCreate);
	}
	
}
