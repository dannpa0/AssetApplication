/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.dao;

import com.dannpa.asetapp.model.Aset;
import com.dannpa.asetapp.model.JenisAset;
import com.dannpa.asetapp.model.KategoriAset;
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
public class KategoriAsetDAOImpl implements DAO<KategoriAset> {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public KategoriAset get(int id) {
        Session session = sessionFactory.getCurrentSession();
        
        Query<KategoriAset> query = session.createQuery("from KategoriAset ka "
                + "LEFT JOIN FETCH ka.asets "
                + "where ka.id=:kategoriId", KategoriAset.class);
        query.setParameter("kategoriId", id);
        KategoriAset kategoriAset = query.getSingleResult();
        return kategoriAset;
    }

    @Override
    public List<KategoriAset> getAll() {
        Session session = sessionFactory.getCurrentSession();
        Query<KategoriAset> query = session.createQuery("SELECT DISTINCT ka from KategoriAset ka "
                + "LEFT JOIN FETCH ka.asets", KategoriAset.class);
        List<KategoriAset> listKategoriAset = query.getResultList();
        return listKategoriAset;
    }

    @Override
    public void save(KategoriAset kategoriAset) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(kategoriAset);
        session.flush();
    }

    @Override
    public void update(KategoriAset kategoriAset) {
        Session session = sessionFactory.getCurrentSession();
        session.update(kategoriAset);
    }

    @Override
    public void delete(KategoriAset kategoriAset) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(kategoriAset);
    }

}
