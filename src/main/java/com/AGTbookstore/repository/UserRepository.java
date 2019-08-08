package com.AGTbookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AGTbookstore.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmailAndPass(String email, String pass);

}
