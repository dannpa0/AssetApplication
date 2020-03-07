/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.service;

import com.dannpa.asetapp.model.Aset;
import com.dannpa.asetapp.model.LokasiAset;
import java.util.List;
/**
 *
 * @author dannp
 */
public interface LokasiAsetService {
    
    void insert(LokasiAset lokasiAset);
    List<LokasiAset> selectAll();
    LokasiAset selectById(int id);
    void delete(LokasiAset lokasiAset);
    void update(LokasiAset lokasiAset);
    
}
