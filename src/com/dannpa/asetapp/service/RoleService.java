/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.service;

import com.dannpa.asetapp.model.Role;
import java.util.List;

/**
 *
 * @author dannp
 */
public interface RoleService {
    void insert(Role role);
    List<Role> selectAll();
    Role selectById(int id);
    void delete(Role role);
    void update(Role role);
}
