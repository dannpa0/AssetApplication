/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.controller;


import com.dannpa.asetapp.model.AlokasiAset;
import com.dannpa.asetapp.model.Aset;
import com.dannpa.asetapp.model.AsetTableModel;
import com.dannpa.asetapp.model.Role;
import com.dannpa.asetapp.model.RoleTableModel;
import com.dannpa.asetapp.service.AlokasiAsetService;
import com.dannpa.asetapp.service.AsetService;
import com.dannpa.asetapp.service.RoleService;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author dannp
 */

public class RoleController {
    
    ApplicationContext context;
    RoleService roleService;
    
    public RoleController(ApplicationContext context){
        this.context = context;
        roleService = (RoleService)context.getBean("RoleService");
    }
    
    public void insertRole(Role role){
        try{
            
            roleService.insert(role);
            JOptionPane.showMessageDialog(null, "Berhasil Menyimpan Data Role",
                    "Success", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception exc){
            exc.printStackTrace();
            
        }
    }
    
    public void updateAset(Role role){
        roleService.update(role);
    }
    
    public void deleteAset(Role role){
        roleService.delete(role);
    }
    
    public AbstractTableModel selectAll(){
        List<Role> listAset = roleService.selectAll();
        RoleTableModel tableModel = new RoleTableModel(listAset);
        return tableModel;
    }
    
//    public List<Aset> selectAllAset(){
//        // get the current hibernate session
//        Session currentSession = sessionFactory.getCurrentSession();
//
//        // create a query
//        Query<Customer> theQuery
//                = currentSession.createQuery("from Customer", Customer.class);
//
//        // execute query and get result list
//        List<Customer> customers = theQuery.getResultList();
//
//        // return the results		
//        return customers;
//    }
    
//   public Aset selectById(int id){
//        Aset aset = null;
//        try{
//            aset = asetService.selectById(id);
//        }catch(Exception exc){
//            exc.printStackTrace();
//        }
//        return aset;
}
