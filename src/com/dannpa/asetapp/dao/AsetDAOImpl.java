/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.dao;

import com.dannpa.asetapp.model.Aset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 *
 * @author dannp
 */
@Repository
public class AsetDAOImpl implements DAO<Aset>,ICustomAsetDAO {

    @Autowired
    SessionFactory sessionFactory;

    List<Aset> listAset = new ArrayList<>();

    @Override
    public void save(Aset aset) {

        try {
            Session session = sessionFactory.openSession();

            session.saveOrUpdate(aset);
//            session.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    @Transactional
    public List<Aset> getAll() {

        Session session = sessionFactory.getCurrentSession();

        Query<Aset> query = session.createQuery("from Aset a "
                + "LEFT JOIN FETCH a.kondisiAset ka "
                + "LEFT JOIN FETCH a.penyusutanAset pa "
                + "LEFT JOIN FETCH a.jenisAset ja "
                + "LEFT JOIN FETCH a.listAlokasiAset laa "
                + "LEFT JOIN FETCH laa.lokasi "
                + "LEFT JOIN FETCH a.kategoriAset kta ", Aset.class);
        listAset = query.getResultList();

        return listAset;
    }

    @Override
    public Aset get(int id) {
        try {
            Session session = sessionFactory.getCurrentSession();

            Query<Aset> query = session.createQuery("from Aset a "
                    + "LEFT JOIN FETCH a.kondisiAset ka "
                    + "LEFT JOIN FETCH a.penyusutanAset pa "
                    + "LEFT JOIN FETCH a.jenisAset ja "
                    + "LEFT JOIN FETCH a.kategoriAset kta "
                    + "LEFT JOIN FETCH a.listAlokasiAset laa "
                    + "LEFT JOIN FETCH laa.lokasi "
                    + "WHERE a.id =:asetId", Aset.class);

            query.setParameter("asetId", id);
            Aset aset = query.getSingleResult();

            return aset;
        } catch (Exception e) {
            // logging
            e.printStackTrace();
            return null;

        }
    }

    @Override
    public void update(Aset aset) {
        try {
            Session session = sessionFactory.getCurrentSession();

            session.update(aset);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Aset aset) {
        try {
            Session session = sessionFactory.getCurrentSession();

//            session.merge(aset);
//            session.joinTransaction();
//            session.merge(aset);
//            Aset a = get(aset.getId());
//            session.joinTransaction();
//            Query theQuery = session.createQuery("delete from Aset a where a.id=:asetId");
//            theQuery.setParameter("asetId", aset.getId());
            session.delete(aset);

//            theQuery.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Aset getAsetFromLocation(int locationId) {
        Session session = sessionFactory.getCurrentSession();
        Query<Aset> query = session.createQuery("from Aset a "
                + "LEFT JOIN FETCH a.kondisiAset ka "
                + "LEFT JOIN FETCH a.penyusutanAset pa "
                + "LEFT JOIN FETCH a.jenisAset ja "
                + "LEFT JOIN FETCH a.kategoriAset kta "
                + "LEFT JOIN FETCH a.listAlokasiAset laa "
                + "LEFT JOIN FETCH laa.lokasi "
                + "WHERE laa.id =:locationId", Aset.class);

        query.setParameter("locationId", locationId);
        Aset aset = query.getSingleResult();
        return aset;

    }

}
