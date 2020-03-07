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
import com.dannpa.asetapp.model.PenyusutanAset;
import com.dannpa.asetapp.service.AsetService;
import com.dannpa.asetapp.service.JenisAsetService;
import com.dannpa.asetapp.service.KategoriAsetService;
import com.dannpa.asetapp.service.LokasiAsetService;
import com.dannpa.asetapp.service.PenyusutanAsetService;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author dannp
 */

public class PenyusutanController {
    
    ApplicationContext context;
    PenyusutanAsetService penyusutanAsetService;
    
    public PenyusutanController(ApplicationContext context){
        this.context = context;
        penyusutanAsetService = (PenyusutanAsetService)context.getBean("PenyusutanAsetService");
    }
    
    public void insert(PenyusutanAset penyusutanAset){
        try{
            
            penyusutanAsetService.insert(penyusutanAset);
            JOptionPane.showMessageDialog(null, "Berhasil Menyimpan Data Aset",
                    "Success", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception exc){
            exc.printStackTrace();
            
        }
    }
    
    public PenyusutanAset selectById(int id){
        PenyusutanAset penyusutanAset = null;
        try{
            penyusutanAset = penyusutanAsetService.selectById(id);
        }catch(Exception exc){
            exc.printStackTrace();
        }
        return penyusutanAset;
    }
//    public AbstractTableModel selectAll(){
//        List<JenisAset> aset = jenisService.selectAll();
//        AsetTableModel tableModel = new AsetTableModel(aset);
//        return tableModel;
//    }
}
