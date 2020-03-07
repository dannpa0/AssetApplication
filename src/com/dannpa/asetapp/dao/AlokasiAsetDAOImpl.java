/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.dao;

import com.dannpa.asetapp.model.AlokasiAset;

import java.util.List;

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
public class AlokasiAsetDAOImpl implements DAO<AlokasiAset> {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public AlokasiAset get(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<AlokasiAset> query = session.createQuery("from AlokasiAset aa "
                + "LEFT JOIN FETCH aa.aset "
                + "LEFT JOIN FETCH aa.lokasi "
                + "where id:=alokasiId", AlokasiAset.class);
        
        query.setParameter("alokasiId", id);
        AlokasiAset alokasiAset = query.getSingleResult();
        return alokasiAset;
    }

    @Override
    public List<AlokasiAset> getAll() {

        Session session = sessionFactory.getCurrentSession();
        String queryBuilder = new StringBuilder("select aa from AlokasiAset aa ")
                .append("LEFT JOIN FETCH aa.aset a ")
                .append("LEFT JOIN FETCH aa.lokasi ")
                .append("LEFT JOIN FETCH a.jenisAset ")
                .append("LEFT JOIN FETCH a.kondisiAset ")
                .append("LEFT JOIN FETCH a.kategoriAset ")
                .append("LEFT JOIN FETCH a.penyusutanAset ")
                .toString();
        Query<AlokasiAset> query = session.createQuery(queryBuilder, AlokasiAset.class);
        List<AlokasiAset> listAlokasiAset = query.getResultList();
        return listAlokasiAset;

    }
    
    
    
//    public List<AlokasiAset> getAllAsetWithPenyusutan(){
//        Session session = sessionFactory.getCurrentSession();
//        
//    }

    @Override
    public void save(AlokasiAset alokasiAset) {
        Session session = sessionFactory.getCurrentSession();
        session.save(alokasiAset);
    }

    @Override
    public void update(AlokasiAset alokasiAset) {
        Session session = sessionFactory.getCurrentSession();
        session.update(alokasiAset);
    }

    @Override
    public void delete(AlokasiAset alokasiAset) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(alokasiAset);
    }
}
