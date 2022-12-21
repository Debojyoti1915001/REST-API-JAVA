package com.debocodes.demo.service;

import java.util.List;

import com.debocodes.demo.entity.Users;

public interface UserService {
	public List<Users> getAllUsers();
	public Users getUserById(int userId);
	public Users addOrUpdateUser(Users user);
	public Users deleteUser(int userId) throws Exception;
}
