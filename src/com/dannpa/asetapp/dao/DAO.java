/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author dannp
 * @param <T>
 */
public interface DAO<T extends Object> {
    
    T get(int id);
    List<T> getAll();
    void save(T t);
    void update(T t);
    void delete(T t);
    
}
