package com.Chatbucket.dao;

import java.util.List;

import org.h2.engine.User;

import com.Chatbucket.model.Users;

public interface UsersDao {

	void registerUser(Users user);
	void updateUsers(Users users);
	
	List<Users> listUsers();

	public List<Users> findFriends(String name);
	
	int validateUser(String name, String password);
	void logout(String name);	
}
