package edu.cfarias.cfariaslab.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import edu.cfarias.cfariaslab.domain.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	boolean existsByAccountNumber(String accountNumber);

}
