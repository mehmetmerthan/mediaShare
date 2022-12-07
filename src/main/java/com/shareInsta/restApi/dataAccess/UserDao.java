package com.shareInsta.restApi.dataAccess;

import com.shareInsta.restApi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao extends JpaRepository<User,Integer> {}

//List<User> findByLocationId(int locationId);
//User findByUserName(String userName);
