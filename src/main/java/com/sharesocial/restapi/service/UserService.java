package com.sharesocial.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.sharesocial.restapi.dao.UserDao;
import com.sharesocial.restapi.model.User;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    UserDao userDao;
    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public User createUser(User user){
       return userDao.save(user);
   }

   public List<User> getUser(){
       return userDao.findAll();
   }
   public void deleteUser(Integer userId){
       userDao.deleteById(userId);
   }
    public User updateUser(Integer userId,User newUser) {
        User user = userDao.findById(userId).get();
        user.setUserName(newUser.getUserName());
            return userDao.save(user);
    }
}
