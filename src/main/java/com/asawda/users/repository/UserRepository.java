package com.asawda.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asawda.users.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);

}
