/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.dao;


import com.dannpa.asetapp.model.LokasiAset;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 *
 * @author dannp
 */
@Repository
public class LokasiDAOImpl implements DAO<LokasiAset>{
    
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public LokasiAset get(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<LokasiAset> query = session.createQuery("from LokasiAset la "
                + "LEFT JOIN FETCH la.listAlokasiAset laa "
                + "LEFT JOIN FETCH laa.aset where la.id=:lokasiId", LokasiAset.class);
        query.setParameter("lokasiId", id);
        LokasiAset lokasiAset = query.getSingleResult();
        return lokasiAset;
    }

    @Override
    public List<LokasiAset> getAll() {
        Session session = sessionFactory.getCurrentSession();
        Query<LokasiAset> query = session.createQuery("from LokasiAset la", LokasiAset.class);
        List<LokasiAset> listLokasiAset = query.getResultList();
        return listLokasiAset;
    }

    @Override
    public void save(LokasiAset lokasiAset) {
        Session session = sessionFactory.getCurrentSession();
        session.save(lokasiAset);
    }

    @Override
    public void update(LokasiAset lokasiAset) {
        Session session = sessionFactory.getCurrentSession();
        session.update(lokasiAset);
    }

    @Override
    public void delete(LokasiAset lokasiAset) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(lokasiAset);
    }

    
    
}
