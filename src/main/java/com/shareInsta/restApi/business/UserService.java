package com.shareInsta.restApi.business;

//import com.shareInsta.restApi.dataAccess.LocationDao;
import com.shareInsta.restApi.dataAccess.UserDao;
import com.shareInsta.restApi.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

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
