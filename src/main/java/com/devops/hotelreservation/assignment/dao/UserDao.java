package com.devops.hotelreservation.assignment.dao;

import com.devops.hotelreservation.assignment.entity.User;

//DAO Pattern for User
public interface UserDao {

    public User findUserByEmail(String email);

    public User findUserByUsername(String username);
    
    public void saveUser(User user);
        
}
