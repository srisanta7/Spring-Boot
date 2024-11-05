package com.sspringboot.test.dao;

import org.springframework.data.repository.CrudRepository;

import com.sspringboot.test.entities.User;

public interface UserRepo extends CrudRepository<User, Integer>{

}
