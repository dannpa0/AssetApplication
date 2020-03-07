/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.dao;

import com.dannpa.asetapp.model.Aset;
import com.dannpa.asetapp.model.PenyusutanAset;
import java.util.List;

import javax.transaction.Transactional;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author dannp
 */
@Repository
public class PenyusutanAsetDAOImpl implements DAO<PenyusutanAset>{
    
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public PenyusutanAset get(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<PenyusutanAset> query = session.createQuery("from PenyusutanAset pa "
                + "JOIN FETCH pa.asets where pa.id=:penyusutanId", PenyusutanAset.class);
        query.setParameter("penyusutanId", id);
        PenyusutanAset penyusutanAset = query.getSingleResult();
        return penyusutanAset;
    }

    @Override
    public List<PenyusutanAset> getAll() {
        Session session = sessionFactory.getCurrentSession();
        Query<PenyusutanAset> query = session.createQuery("from PenyusutanAset ka "
                + "JOIN FETCH ka.asets", PenyusutanAset.class);
        List<PenyusutanAset> listPenyusutanAset = query.getResultList();
        return listPenyusutanAset;
    }

    @Override
    public void save(PenyusutanAset penyusutanAset) {
        Session session = sessionFactory.getCurrentSession();
        session.save(penyusutanAset);
    }

    @Override
    public void update(PenyusutanAset penyusutanAset) {
        Session session = sessionFactory.getCurrentSession();
        session.update(penyusutanAset);
    }

    @Override
    public void delete(PenyusutanAset penyusutanAset) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(penyusutanAset);
    }

    
}
