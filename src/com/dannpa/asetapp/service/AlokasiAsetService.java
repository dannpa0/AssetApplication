/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.service;

import com.dannpa.asetapp.model.AlokasiAset;
import com.dannpa.asetapp.model.Aset;
import java.util.List;
/**
 *
 * @author dannp
 */
public interface AlokasiAsetService {
    
    void insert(AlokasiAset aset);
    List<AlokasiAset> selectAll();
    public AlokasiAset selectById(int id);
    
    
}
