package com.anton.sring.spring_boot.service;

import com.anton.sring.spring_boot.models.User;

import java.util.List;

public interface UserService {
    public List<User> index();
    public User show (Long id);
    public boolean save (User user);
    public void update (User user);
    public void delete (User user);
    //public User showUserByUsername(String username);
    public User getUserByEmail(String email);
}
