/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.observable;

import com.dannpa.asetapp.model.JenisAset;
import java.util.Observable;

/**
 *
 * @author dannp
 */
public class AllAsetObservable extends Observable{
    
    public AllAsetObservable() {
        super();
    }
    
    public void changeData(Object data){
//        System.out.println("data changed");
        setChanged();
        notifyObservers(data);
    }
    
    
    
}
