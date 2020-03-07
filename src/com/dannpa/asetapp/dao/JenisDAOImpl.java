/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.dao;

import com.dannpa.asetapp.model.Aset;
import com.dannpa.asetapp.model.JenisAset;
import java.util.List;

import javax.transaction.Transactional;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author dannp
 */
@Repository
public class JenisDAOImpl implements DAO<JenisAset> {

    @Autowired
    private SessionFactory sessionFactory;

    
    @Override
    public void save(JenisAset jenisAset) {

        try {
            Session session = sessionFactory.getCurrentSession();

            session.save(jenisAset);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    @Transactional
    public List<JenisAset> getAll() {

        Session session = sessionFactory.getCurrentSession();
        Query<JenisAset> query = session.createQuery("from JenisAset ja", JenisAset.class);
        List<JenisAset> listJenisAset = query.list();
        return listJenisAset;
    }

    @Override
    public JenisAset get(int id) {
        try {
            Session session = sessionFactory.getCurrentSession();
            Query<JenisAset> query = session.createQuery("from JenisAset ka "
                    + "JOIN FETCH ka.asets "
                    + "where id:=jenisId", JenisAset.class);
            query.setParameter("jenisId", id);
            JenisAset jenisAset = query.getSingleResult();

            return jenisAset;
        } catch (Exception e) {
            // logging
            e.printStackTrace();
            return null;

        }
    }

    @Override
    public void update(JenisAset jenisAset) {
        try {
            Session session = sessionFactory.getCurrentSession();

            session.update(jenisAset);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(JenisAset jenisAset) {
        try {
            
            Session session = sessionFactory.getCurrentSession();
            session.delete(jenisAset);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
