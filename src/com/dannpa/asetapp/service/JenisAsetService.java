/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.service;

import com.dannpa.asetapp.model.Aset;
import com.dannpa.asetapp.model.JenisAset;
import java.util.List;
/**
 *
 * @author dannp
 */
public interface JenisAsetService {
    
    void insert(JenisAset aset);
    List<JenisAset> selectAll();
    void delete(JenisAset aset);
    void update(JenisAset aset);
    
}
