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
import com.dannpa.asetapp.model.LokasiAset;
import com.dannpa.asetapp.model.LokasiTableModel;
import com.dannpa.asetapp.service.AsetService;
import com.dannpa.asetapp.service.JenisAsetService;
import com.dannpa.asetapp.service.KategoriAsetService;
import com.dannpa.asetapp.service.LokasiAsetService;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author dannp
 */

public class LokasiController {
    
    ApplicationContext context;
    LokasiAsetService lokasiAsetService;
    
    public LokasiController(ApplicationContext context){
        this.context = context;
        lokasiAsetService = (LokasiAsetService)context.getBean("LokasiAsetService");
    }
    
    public void insert(LokasiAset lokasiAset){
        try{
            
            lokasiAsetService.insert(lokasiAset);
            JOptionPane.showMessageDialog(null, "Berhasil Menyimpan Data Aset",
                    "Success", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception exc){
            exc.printStackTrace();
            
        }
    }
    
    public LokasiAset selectById(int id){
        LokasiAset lokasiAset = null;
        try{
            lokasiAset = lokasiAsetService.selectById(id);
        }catch(Exception exc){
            exc.printStackTrace();
        }
        return lokasiAset;
    }
    public AbstractTableModel selectAll(){
        List<LokasiAset> listLokasi = lokasiAsetService.selectAll();
        LokasiTableModel tableModel = new LokasiTableModel(listLokasi);
        return tableModel;
    }

    public void deleteLokasi(LokasiAset lokasiAset) {
        lokasiAsetService.delete(lokasiAset);
        
    }
}
