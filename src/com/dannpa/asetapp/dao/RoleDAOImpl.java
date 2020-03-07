/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.dao;


import com.dannpa.asetapp.model.LokasiAset;
import com.dannpa.asetapp.model.Role;
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
public class RoleDAOImpl implements DAO<Role>{
    
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Role get(int id) {
        try {
            Session session = sessionFactory.getCurrentSession();
            Query<Role> query = session.createQuery("from Role r "
                    + "where id:=userId", Role.class);
            query.setParameter("roleId", id);
            Role role = query.getSingleResult();
            return role;
            
        } catch (Exception e) {
            // logging
            e.printStackTrace();
            return null;

        }
    }

    @Override
    public List<Role> getAll() {
        Session currentSession = sessionFactory.getCurrentSession();
        Query<Role> query = currentSession.createQuery("from Role", Role.class);
        List<Role> listRole = query.list();
        return listRole;
    }

    @Override
    public void save(Role role) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.save(role);
    }

    @Override
    public void update(Role role) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.update(role);
    }

    @Override
    public void delete(Role role) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.delete(role);
    }

   

    
    
}
