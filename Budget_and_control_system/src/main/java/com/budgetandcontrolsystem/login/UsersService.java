package com.budgetandcontrolsystem.login;

import java.util.List;

public interface UsersService {

	UsersPojo addUsers(UsersPojo usersPojo);

	List<UsersPojo> getAllUsers();
}
