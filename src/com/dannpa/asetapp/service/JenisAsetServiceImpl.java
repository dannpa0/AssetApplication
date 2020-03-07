/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.service;


import com.dannpa.asetapp.dao.DAO;
import com.dannpa.asetapp.model.JenisAset;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author dannp
 */
@Service("JenisAsetService")
@Transactional
public class JenisAsetServiceImpl implements JenisAsetService{
    
    @Autowired
    @Qualifier("jenisAsetDAO")
    private DAO<JenisAset> jenisDAO;

    @Override
    public void insert(JenisAset jenisAset) {
        jenisDAO.save(jenisAset);
    }

    @Override
    public List<JenisAset> selectAll() {
        return jenisDAO.getAll();
    }

    @Override
    public void delete(JenisAset aset) {
        jenisDAO.delete(aset);
    }

    @Override
    public void update(JenisAset aset) {
        jenisDAO.update(aset);
    }
    
}
