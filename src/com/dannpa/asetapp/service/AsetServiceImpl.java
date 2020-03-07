/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.service;


import com.dannpa.asetapp.dao.DAO;
import com.dannpa.asetapp.model.AlokasiAset;
import com.dannpa.asetapp.model.Aset;
import com.dannpa.asetapp.model.LokasiAset;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



/**
 *
 * @author dannp
 */
@Service("AsetService")
@Transactional
public class AsetServiceImpl implements AsetService{
    
    @Autowired
    @Qualifier("asetDAO")
    private DAO<Aset> asetDAO;
    
    
    
    @Override
    public void insert(Aset aset) {
        asetDAO.save(aset);
    }

    @Override
    public List<Aset> selectAll() {
        
        return asetDAO.getAll();
    }

    @Override
    public Aset selectById(int id) {
        return asetDAO.get(id);
    }

    @Override
    public void delete(Aset aset) {
        asetDAO.delete(aset);
    }

    @Override
    public void update(Aset aset) {
        asetDAO.update(aset);
    }
    
    
    
    
    
}
