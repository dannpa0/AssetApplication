/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.service;


import com.dannpa.asetapp.dao.DAO;

import com.dannpa.asetapp.model.Aset;
import com.dannpa.asetapp.model.PenyusutanAset;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author dannp
 */
@Service("PenyusutanAsetService")
@Transactional
public class PenyusutanAsetServiceImpl implements PenyusutanAsetService{
    
    @Autowired
    private DAO<PenyusutanAset> penyusutanAsetDAO;

    @Override
    @Transactional
    public void insert(PenyusutanAset penyusutan) {
        penyusutanAsetDAO.save(penyusutan);
    }

    @Override
    public List<PenyusutanAset> selectAll() {
        return penyusutanAsetDAO.getAll();
    }

    @Override
    public PenyusutanAset selectById(int id) {
        return penyusutanAsetDAO.get(id);
    }
    
    
}
