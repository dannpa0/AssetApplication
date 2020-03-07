/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.controller;

import com.dannpa.asetapp.model.AsetTableModel;
import com.dannpa.asetapp.model.User;
import com.dannpa.asetapp.model.UserTableModel;
import com.dannpa.asetapp.service.UserService;
import java.awt.Component;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author dannp
 */
public class UserController {

    ApplicationContext context;

    UserService userService;
    private Component component;

    public UserController(ApplicationContext context) {
        this.context = context;
        userService = (UserService) context.getBean("UserService");
    }
    
    public void insert(User user){
        userService.insert(user);
    }
    
    public void deleteUser(User user){
        userService.delete(user);
    }

    public User selectById(int id) {
        User user = null;
        try {
            user = userService.selectById(id);
        } catch (Exception exc) {
            exc.printStackTrace();
        }
        return user;
    }
    
    public AbstractTableModel selectAll(){
        List<User> user = userService.selectAll();
        UserTableModel tableModel = new UserTableModel(user);
        return tableModel;
    }
    
//    public void setComponent(){
//        this.component = c;
//    }

    public User verifyUser(String username, String password) {
        try {
            userService.verifyUser(username, password);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null , "User Tidak Ditemukan", "Failed", JOptionPane.ERROR_MESSAGE);
        }
        return userService.verifyUser(username, password);
    }

}
