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
public class LokasiTableModel extends AbstractTableModel{
    
    List<LokasiAset> listLokasiAset;
    
    private final String header[] = {
        "Kode Lokasi Aset",
        "Nama Lokasi Aset"
    };

    public LokasiTableModel(List<LokasiAset> listLokasiAset) {
        this.listLokasiAset = listLokasiAset;
    }

    
    @Override
    public int getRowCount() {
        return listLokasiAset.size();
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
        LokasiAset jenisAset = listLokasiAset.get(rowIndex);
        switch (columnIndex){
            case 0:
                return jenisAset.getKodeLokasiAset();
            case 1:
                return jenisAset.getNamaLokasiAset();
            default:
                return null;
            
        }
    }

    public List<LokasiAset> getListLokasiAset() {
        return listLokasiAset;
    }

    public void setListLokasiAset(List<LokasiAset> listLokasiAset) {
        this.listLokasiAset = listLokasiAset;
    }
    
    
    
}
