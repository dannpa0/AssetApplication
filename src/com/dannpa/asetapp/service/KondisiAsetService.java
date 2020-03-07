/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.service;

import com.dannpa.asetapp.model.Aset;
import com.dannpa.asetapp.model.KondisiAset;
import java.util.List;
/**
 *
 * @author dannp
 */
public interface KondisiAsetService {
    
    void insert(KondisiAset aset);
    List<KondisiAset> selectAll();
    KondisiAset selectById(int id);
    void delete(KondisiAset kondisiAset);
    void update(KondisiAset kondisiAset);
    
}
