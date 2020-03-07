/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.service;

import com.dannpa.asetapp.dao.DAO;
import com.dannpa.asetapp.dao.RoleDAO;
import com.dannpa.asetapp.model.Role;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author dannp
 */
@Service("RoleService")
@Transactional
public class RoleServiceImpl implements RoleService{
    
    @Autowired
    private DAO<Role> roleDAO;

    @Override
    public void insert(Role role) {
        roleDAO.save(role);
    }

    @Override
    public List<Role> selectAll() {
        return roleDAO.getAll();
    }

    @Override
    public Role selectById(int id) {
        return roleDAO.get(id);
    }

    @Override
    public void delete(Role role) {
        roleDAO.delete(role);
    }

    @Override
    public void update(Role role) {
        roleDAO.update(role);
    }
    
}
