/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.controller;

import com.dannpa.asetapp.model.Aset;
import com.dannpa.asetapp.model.AsetTableModel;
import com.dannpa.asetapp.model.JenisAset;
import com.dannpa.asetapp.service.AsetService;
import com.dannpa.asetapp.service.JenisAsetService;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import com.dannpa.asetapp.model.JenisTableModel;

/**
 *
 * @author dannp
 */
public class JenisController {

    ApplicationContext context;
    JenisAsetService jenisService;

    public JenisController(ApplicationContext context) {
        this.context = context;
        jenisService = (JenisAsetService) context.getBean("JenisAsetService");
    }

    public void insertAset(JenisAset aset) {
        try {

            jenisService.insert(aset);
            JOptionPane.showMessageDialog(null, "Berhasil Menyimpan Data Aset",
                    "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception exc) {
            exc.printStackTrace();

        }
    }

    public AbstractTableModel selectAll() {
        List<JenisAset> jenisAset = jenisService.selectAll();
        JenisTableModel tableModel = new JenisTableModel(jenisAset);
        return tableModel;
    }

    public void deleteJenis(JenisAset jenisAset) {

        int op = JOptionPane.showConfirmDialog(null,
                "Apakah anda ingin menghapus " + jenisAset.getNamaJenisAset() + "?",
                "Hapus Jenis Aset",
                JOptionPane.YES_NO_OPTION);

        if (op == 0) {
            try {

                jenisService.delete(jenisAset);
                JOptionPane.showMessageDialog(null, "Berhasil Menghapus Jenis Aset",
                        "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception exc) {
                exc.printStackTrace();

            }
        }else{
            
        }

    }
//    public AbstractTableModel selectAll(){
//        List<JenisAset> aset = jenisService.selectAll();
//        AsetTableModel tableModel = new AsetTableModel(aset);
//        return tableModel;
//    }
}
