/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.dao;

import com.dannpa.asetapp.model.User;
import java.util.List;
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
public class UserDAOImpl implements DAO<User>, UserDAO{
    
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public User get(int id) {
        try {
            Session session = sessionFactory.getCurrentSession();
            Query<User> query = session.createQuery("from User u "
                    + "where id=:userId", User.class);
            query.setParameter("userId", id);
            User user = query.getSingleResult();
            return user;
            
        } catch (Exception e) {
            // logging
            e.printStackTrace();
            return null;

        }
    }

    @Override
    public List<User> getAll() {
        Session currentSession = sessionFactory.getCurrentSession();
        Query<User> query = currentSession.createQuery("from User", User.class);
        List<User> listUser = query.list();
        return listUser;
    }

    @Override
    public void save(User user) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.save(user);
    }

    @Override
    public void update(User user) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.update(user);
    }

    @Override
    public void delete(User user) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.delete(user);
    }

    @Override
    public User verifyUser(String name, String password) {
        Session currentSession = sessionFactory.getCurrentSession();
        Query<User> theQuery = currentSession.createQuery("from User where username =:name and password =:password", User.class);
        theQuery.setParameter("name", name);
        theQuery.setParameter("password", password);
        return theQuery.getSingleResult();
        
    }

   

    
    
}
