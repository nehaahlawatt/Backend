package com.budgetandcontrolsystem.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UsersController {


	@Autowired
	private UsersService usersService;
	
	
	@PostMapping(value = "/usersDetails/add")
	public UsersPojo addstudent(@RequestBody UsersPojo usersPojo) {
		
		return usersService.addUsers(usersPojo);
	}
	
	@GetMapping(value = "/usersDetails/get")
	public List<UsersPojo> getALLStudent() {
		return usersService.getAllUsers();

	}
	
}
