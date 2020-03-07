/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.test;

import java.util.Observable;

/**
 *
 * @author dannp
 */
public class ChoosableActivity extends Observable{
    
    
    String activity;
    
    public ChoosableActivity(){
        super();
    }
    
    public void update(Object data){
        setChanged();
        notifyObservers(data);
    }
    

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }
    
    

    
    
}
