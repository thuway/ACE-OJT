package com.mfi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.mfi.model.User;
import com.mfi.repository.UserRepository;

@Service
public class UserService  {
	@Autowired
	UserRepository repo;
	
	
	@Bean
	public BCryptPasswordEncoder getbCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	public void save(User user) {
		user.setPassword(getbCryptPasswordEncoder().encode(user.getPassword()));
		user.setEnabled(true);
		repo.save(user);
	}
	public void update(User user) {
		repo.save(user);
	}
	
	public List<User> selectAll(){
		return repo.findAll();
	}
	public List<User> findbyName(String name){
		return repo.findbyName(name);
	}
	
	public User selectOne(Integer id) {
		return repo.findbyCode(id);
	}
	
	public User findByEmail(String email) {
		return repo.findByEmail(email);
	}
	
	public User findUserByPass(String pass) {
		return repo.findUserByPass(pass);
		
	}
}
