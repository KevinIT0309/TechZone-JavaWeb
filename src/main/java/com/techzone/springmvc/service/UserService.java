package com.techzone.springmvc.service;

import java.util.List;

import com.techzone.springmvc.entity.User;

public interface UserService {
	
	void save(User user);
	
	void saveWithRole(User user , int [] roles);
	
	void updateUser(String oldUsdername ,User user);
	
	void updateUserWithRole(String oldUsdername, User user , int [] roles);
	
	User findByUsername(String username);
	
	User getUser(int theId);
	
	List<User> getUsers();
	
	void deleteUser(User theUser);

}
