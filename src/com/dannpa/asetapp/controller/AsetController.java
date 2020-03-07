/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.controller;


import com.dannpa.asetapp.model.AlokasiAset;
import com.dannpa.asetapp.model.Aset;
import com.dannpa.asetapp.model.AsetTableModel;
import com.dannpa.asetapp.service.AlokasiAsetService;
import com.dannpa.asetapp.service.AsetService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author dannp
 */

public class AsetController {
    
    ApplicationContext context;
    AsetService asetService;
    
    public AsetController(ApplicationContext context){
        this.context = context;
        asetService = (AsetService)context.getBean("AsetService");
    }
    
    public void insertAset(Aset aset){
        try{
            
            asetService.insert(aset);
            JOptionPane.showMessageDialog(null, "Berhasil Menyimpan Data Aset",
                    "Success", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception exc){
            exc.printStackTrace();
            
        }
    }
    
    public void updateAset(Aset aset){
        asetService.update(aset);
    }
    
    public void deleteAset(Aset aset){
        asetService.delete(aset);
    }
    
    public AbstractTableModel selectAll() {
        List<Aset> listAset = asetService.selectAll();
//        List<Object> listOfObject = new ArrayList();
//        int idx = 0;
//        for(Aset aset: listAset){
//            if(aset.getListAlokasiAset().size() > 0){
//                Map map = new HashMap();
//                System.out.println("map "+ map.getClass().toString());
//                map.put(aset, aset.getListAlokasiAset().get(idx));
//                listOfObject.add(map);
//                idx++;
//                if(idx == aset.getListAlokasiAset().size()){
//                    idx = 0;
//                }
//            }else{
//                System.out.println("here");
//                listOfObject.add(aset);
//                idx = 0;
//            }
//        }
        AsetTableModel tableModel = new AsetTableModel(listAset);
        return tableModel;
    }
    
    
    
//    public AbstractTableModel selectAll(){
//        List<Aset> listAset = asetService.selectAll();
//        AsetTableModel tableModel = new AsetTableModel(listAset);
//        return tableModel;
//    }
    
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
