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
import com.dannpa.asetapp.model.KategoriTableModel;
import com.dannpa.asetapp.service.AsetService;
import com.dannpa.asetapp.service.JenisAsetService;
import com.dannpa.asetapp.service.KategoriAsetService;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author dannp
 */

public class KategoriController {
    
    ApplicationContext context;
    KategoriAsetService kategoriAsetService;
    
    public KategoriController(ApplicationContext context){
        this.context = context;
        kategoriAsetService = (KategoriAsetService)context.getBean("KategoriAsetService");
    }
    
    public void insert(KategoriAset aset){
        try{
            
            kategoriAsetService.insert(aset);
            JOptionPane.showMessageDialog(null, "Berhasil Menyimpan Data Aset",
                    "Success", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception exc){
            exc.printStackTrace();
            
        }
    }
    
    public KategoriAset selectById(int id){
        KategoriAset kategoriAset = null;
        try{
            kategoriAset = kategoriAsetService.selectById(id);
        }catch(Exception exc){
            exc.printStackTrace();
        }
        return kategoriAset;
    }
    
    public AbstractTableModel selectAll(){
        List<KategoriAset> listKategori = kategoriAsetService.selectAll();
        KategoriTableModel tableModel = new KategoriTableModel(listKategori);
        return tableModel;
    }

    public void deleteKategori(KategoriAset kategoriAset) {
        kategoriAsetService.delete(kategoriAset);
        
    }

    
}
