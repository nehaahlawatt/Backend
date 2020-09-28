package com.budgetandcontrolsystem.login;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class UsersServiceImpl implements UsersService{

	@Autowired
	private UsersRepo usersRepo;

	@Override
	public UsersPojo addUsers(UsersPojo usersPojo) {
		// TODO Auto-generated method stub
		return usersRepo.save(usersPojo);
	}

	@Override
	public List<UsersPojo> getAllUsers() {
		return usersRepo.findAll();
	}

}
