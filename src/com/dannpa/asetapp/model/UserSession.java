/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.model;

/**
 *
 * @author dannp
 */
public class UserSession {
    
    private static UserSession instance;
    
    private static User user;
    
    private UserSession(User user){
        this.user = user;
    }
    
    public static UserSession getInstance(User user){
        if(instance == null){
            instance = new UserSession(user);
        }
        return instance;
    }

    public static User getUser() {
        return user;
    }

    public static void clearUserSession(){
        user = null;
        instance = null;
    }

    @Override
    public String toString() {
        return "UserSession{" + "user=" + user + '}';
    }
    
    
    
    
    
    
}
