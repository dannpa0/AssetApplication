/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.dao;

import com.dannpa.asetapp.model.Aset;
import com.dannpa.asetapp.model.KondisiAset;
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
public class KondisiDAOImpl implements DAO<KondisiAset>{
    
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public KondisiAset get(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<KondisiAset> query = session.createQuery("from KondisiAset ka "
                + "LEFT JOIN FETCH ka.asets "
                + "where ka.id:=kondisiId", KondisiAset.class);
        query.setParameter("kondisiId", id);
        KondisiAset kondisiAset = query.getSingleResult();
        return kondisiAset;
    }

    @Override
    public List<KondisiAset> getAll() {
        Session session = sessionFactory.getCurrentSession();
        Query<KondisiAset> query = session.createQuery("from KondisiAset ka "
                + "LEFT JOIN FETCH ka.asets", KondisiAset.class);
        List<KondisiAset> listKondisiAset = query.getResultList();
        return listKondisiAset;
    }

    @Override
    public void save(KondisiAset kondisiAset) {
        Session session = sessionFactory.getCurrentSession();
        session.save(kondisiAset);
    }

    @Override
    public void update(KondisiAset kondisiAset) {
        Session session = sessionFactory.getCurrentSession();
        session.update(kondisiAset);
    }

    @Override
    public void delete(KondisiAset kondisiAset) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(kondisiAset);
    }

    
    
}
