/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.service;


import com.dannpa.asetapp.dao.DAO;

import com.dannpa.asetapp.model.Aset;
import com.dannpa.asetapp.model.KondisiAset;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author dannp
 */
@Service("KondisiAsetService")
@Transactional(readOnly = true)
public class KondisiAsetServiceImpl implements KondisiAsetService{
    
    @Autowired
    private DAO<KondisiAset> kondisiAsetDAO;

    @Override
    @Transactional
    public void insert(KondisiAset kondisiAset) {
        kondisiAsetDAO.save(kondisiAset);
    }

    @Override
    public List<KondisiAset> selectAll() {
        return kondisiAsetDAO.getAll();
    }

    @Override
    public KondisiAset selectById(int id) {
        return kondisiAsetDAO.get(id);
    }

    @Override
    public void delete(KondisiAset kondisiAset) {
        kondisiAsetDAO.delete(kondisiAset);
    }

    @Override
    public void update(KondisiAset kondisiAset) {
        kondisiAsetDAO.update(kondisiAset);
    }
    
}
