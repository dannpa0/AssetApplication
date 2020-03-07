/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.controller;


import com.dannpa.asetapp.model.Aset;
import com.dannpa.asetapp.model.AsetTableModel;
import com.dannpa.asetapp.model.JenisAset;
import com.dannpa.asetapp.model.KategoriAset;
import com.dannpa.asetapp.model.KondisiAset;
import com.dannpa.asetapp.model.KondisiTableModel;
import com.dannpa.asetapp.service.AsetService;
import com.dannpa.asetapp.service.JenisAsetService;
import com.dannpa.asetapp.service.KategoriAsetService;
import com.dannpa.asetapp.service.KondisiAsetService;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author dannp
 */

public class KondisiController {
    
    ApplicationContext context;
    KondisiAsetService kondisiAsetService;
    
    public KondisiController(ApplicationContext context){
        this.context = context;
        kondisiAsetService = (KondisiAsetService)context.getBean("KondisiAsetService");
    }
    
    public void insert(KondisiAset aset){
        try{
            
            kondisiAsetService.insert(aset);
            JOptionPane.showMessageDialog(null, "Berhasil Menyimpan Data Aset",
                    "Success", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception exc){
            exc.printStackTrace();
            
        }
    }
    
    public KondisiAset selectById(int id){
        KondisiAset kondisiAset = null;
        try{
            kondisiAset = kondisiAsetService.selectById(id);
        }catch(Exception exc){
            exc.printStackTrace();
        }
        return kondisiAset;
    }
    public AbstractTableModel selectAll(){
        List<KondisiAset> listKondisi = kondisiAsetService.selectAll();
        KondisiTableModel tableModel = new KondisiTableModel(listKondisi);
        return tableModel;
    }

    public void deleteKondisi(KondisiAset kondisiAset) {
        kondisiAsetService.delete(kondisiAset);
    }
}
