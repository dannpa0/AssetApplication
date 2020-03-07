/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dannp
 */
public class ChoosableObservableActivity {
    
    String activity;
    List<Activity> activities = new ArrayList<>();
    
    public void addObserver(Activity activity){
        this.activities.add(activity);
    }
    
    public void removeObserver(Activity activity){
        this.activities.remove(activity);
    }
    
    public void setActivity(String activity){
        this.activity = activity;
        for(Activity act:activities){
            act.updateActivity(this.activity);
        }
    }
}
