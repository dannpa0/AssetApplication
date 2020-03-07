/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.service;


import com.dannpa.asetapp.dao.DAO;

import com.dannpa.asetapp.model.AlokasiAset;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author dannp
 */
@Service("AlokasiAsetService")
@Transactional
public class AlokasiAsetServiceImpl implements AlokasiAsetService{
    
    @Autowired
    private DAO<AlokasiAset> alokasiAsetDAO;

    @Override
    public void insert(AlokasiAset alokasiAset) {
        alokasiAsetDAO.save(alokasiAset);
    }

    @Override
    @Transactional
    public List<AlokasiAset> selectAll() {
        return alokasiAsetDAO.getAll();
    }

    @Override
    public AlokasiAset selectById(int id) {
        return alokasiAsetDAO.get(id);
    }
    
}
