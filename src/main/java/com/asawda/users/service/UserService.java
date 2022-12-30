package com.asawda.users.service;

import com.asawda.users.model.Role;
import com.asawda.users.model.User;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
}
