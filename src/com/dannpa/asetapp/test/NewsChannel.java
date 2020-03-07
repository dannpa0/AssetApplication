/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.test;

/**
 *
 * @author dannp
 */
public class NewsChannel implements Channel{
    private String channelName;
    private String news;

    public NewsChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void update(Object news) {
        System.out.println("set news in channel "+channelName);
        this.setNews((String) news);
    }

    public String getNews() {
        return news;
    }
    
    public void setNews(String news) {
        this.news = news;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }
    
    
    
    public static void main(String[] args){
        NewsAgency observables = new NewsAgency();
        NewsChannel observer = new NewsChannel("channel1");
        NewsChannel observer2 = new NewsChannel("channel2");
        
        observables.addObserver(observer);
        observables.addObserver(observer2);
        
        observables.setNews("HELLO");
        System.out.println(observables.news+"\t observer"+observer.getNews());
        System.out.println(observables.news+"\t observer2"+observer2.getNews());
//        observer.getNews();
//        observer2.getNews();
        
//        System.out.println(observer.getNews());
        
        
    }
    
    
    
}
