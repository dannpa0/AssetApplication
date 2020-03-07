/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.service;

import com.dannpa.asetapp.model.Aset;
import com.dannpa.asetapp.model.KategoriAset;
import java.util.List;
/**
 *
 * @author dannp
 */
public interface KategoriAsetService {
    
    void insert(KategoriAset kategoriAset);
    List<KategoriAset> selectAll();
    KategoriAset selectById(int id);
    void delete(KategoriAset kategoriAset);
    void update(KategoriAset kategoriAset);
    
}
