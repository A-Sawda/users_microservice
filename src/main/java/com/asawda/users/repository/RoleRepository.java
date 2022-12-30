package com.asawda.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asawda.users.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

	Role findByRole(String role);
	
}
