/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.service;

import com.dannpa.asetapp.model.Aset;
import java.util.List;
/**
 *
 * @author dannp
 */
public interface AsetService {
    
    void insert(Aset aset);
    List<Aset> selectAll();
    Aset selectById(int id);
    void delete(Aset aset);
    void update(Aset aset);
    
}
