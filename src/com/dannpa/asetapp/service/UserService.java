/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.service;

import com.dannpa.asetapp.model.User;
import java.util.List;

/**
 *
 * @author dannp
 */
public interface UserService {
    void insert(User aset);
    List<User> selectAll();
    User selectById(int id);
    void delete(User aset);
    void update(User aset);
    User verifyUser(String username, String password);
}
