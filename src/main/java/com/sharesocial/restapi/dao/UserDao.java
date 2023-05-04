package com.sharesocial.restapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sharesocial.restapi.model.User;

import java.util.List;

public interface UserDao extends JpaRepository<User,Integer> {}

//List<User> findByLocationId(int locationId);
//User findByUserName(String userName);
