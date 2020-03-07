/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dannp
 */
public class JenisTableModel extends AbstractTableModel{
    
    List<JenisAset> listJenisAset;
    
    private final String header[] = {
        "Kode Jenis Aset",
        "Nama Jenis Aset"
    };

    public JenisTableModel(List<JenisAset> jenisAset) {
        this.listJenisAset = jenisAset;
    }

    
    @Override
    public int getRowCount() {
        return listJenisAset.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public String getColumnName(int column) {
        return header[column];
    }
    
    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        JenisAset jenisAset = listJenisAset.get(rowIndex);
        switch (columnIndex){
            case 0:
                return jenisAset.getKodeJenisAset();
            case 1:
                return jenisAset.getNamaJenisAset();
            default:
                return null;
            
        }
    }

    public List<JenisAset> getListJenisAset() {
        return listJenisAset;
    }

    public void setListJenisAset(List<JenisAset> listJenisAset) {
        this.listJenisAset = listJenisAset;
    }
    
    
    
}
