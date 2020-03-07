/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.service;


import com.dannpa.asetapp.dao.DAO;

import com.dannpa.asetapp.model.Aset;
import com.dannpa.asetapp.model.LokasiAset;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author dannp
 */
@Service("LokasiAsetService")
@Transactional
public class LokasiAsetServiceImpl implements LokasiAsetService{
    
    @Autowired
    private DAO<LokasiAset> lokasiDAO;

    @Override
    @Transactional
    public void insert(LokasiAset aset) {
        lokasiDAO.save(aset);
    }

    @Override
    public List<LokasiAset> selectAll() {
        return lokasiDAO.getAll();
    }

    @Override
    public LokasiAset selectById(int id) {
        return lokasiDAO.get(id);
        
    }

    @Override
    public void delete(LokasiAset lokasiAset) {
        lokasiDAO.delete(lokasiAset);
    }

    @Override
    public void update(LokasiAset lokasiAset) {
        lokasiDAO.update(lokasiAset);
    }
    
}
