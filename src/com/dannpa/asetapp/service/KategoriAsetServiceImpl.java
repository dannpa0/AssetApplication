/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.service;


import com.dannpa.asetapp.dao.DAO;

import com.dannpa.asetapp.model.Aset;
import com.dannpa.asetapp.model.KategoriAset;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author dannp
 */
@Service("KategoriAsetService")
@Transactional(readOnly = true)
public class KategoriAsetServiceImpl implements KategoriAsetService{
    
    @Autowired
    private DAO<KategoriAset> kategoriAsetDAO;

    @Override
    @Transactional
    public void insert(KategoriAset kategoriAset) {
        kategoriAsetDAO.save(kategoriAset);
    }

    @Override
    public List<KategoriAset> selectAll() {
        return kategoriAsetDAO.getAll();
    }

    @Override
    public KategoriAset selectById(int id) {
        return kategoriAsetDAO.get(id);
    }

    @Override
    public void delete(KategoriAset kategoriAset) {
        kategoriAsetDAO.delete(kategoriAset);
    }

    @Override
    public void update(KategoriAset kategoriAset) {
        kategoriAsetDAO.update(kategoriAset);
    }
    
}
