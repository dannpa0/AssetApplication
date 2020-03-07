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
public class NewsAgency{
    String news;
    List<Channel> channels = new ArrayList<>();
    
    public void addObserver(Channel channel){
        System.out.println("add an observer");
        this.channels.add(channel);
    }
    
    public void removeObserver(Channel channel){
        this.channels.remove(channel);
    }
    
    public void setNews(String news){
        this.news = news;
        for(Channel channel:channels){
            channel.update(this.news);
        }
    }

    
}
