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
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author dannp
 */

public class AlokasiController {
    
    ApplicationContext context;
    AlokasiAsetService alokasiAsetService;
    AsetService asetService;
    
    public AlokasiController(ApplicationContext context){
        this.context = context;
        alokasiAsetService = (AlokasiAsetService)context.getBean("AlokasiAsetService");
        asetService = (AsetService)context.getBean("AsetService");
    }
    
    public void insert(AlokasiAset alokasiAset){
        try{
            
            alokasiAsetService.insert(alokasiAset);
            JOptionPane.showMessageDialog(null, "Berhasil Menyimpan Data Aset",
                    "Success", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception exc){
            exc.printStackTrace();
            
        }
    }
    
    public void getById(int id){
        try{
            alokasiAsetService.selectById(id);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public AbstractTableModel selectAll(){
        List<Aset> aset = asetService.selectAll();
        AsetTableModel tableModel = new AsetTableModel(aset);
        return tableModel;
    }
    
//   public AlokasiAset selectById(int id){
//        AlokasiAset aset = null;
//        try{
//            aset = alokasiAsetService.selectById(id);
//        }catch(Exception exc){
//            exc.printStackTrace();
//        }
//        return aset;
//    }
}
