package com.rest.userswag.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.userswag.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
