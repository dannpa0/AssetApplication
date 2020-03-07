/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.service;

import com.dannpa.asetapp.dao.DAO;
import com.dannpa.asetapp.dao.UserDAO;
import com.dannpa.asetapp.model.User;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author dannp
 */
@Service("UserService")
@Transactional
public class UserServiceImpl implements UserService{
    
    @Autowired
    DAO<User> userDAO;
    
    @Autowired
    UserDAO iUserDAO;

    @Override
    public void insert(User user) {
        userDAO.save(user);
    }

    @Override
    public List<User> selectAll() {
        return userDAO.getAll();
    }

    @Override
    public User selectById(int id) {
        return userDAO.get(id);
    }

    @Override
    public void delete(User user) {
        userDAO.delete(user);
    }

    @Override
    public void update(User user) {
        userDAO.update(user);
    }

    @Override
    public User verifyUser(String username, String password) {
        return iUserDAO.verifyUser(username, password);
    }
    
}
