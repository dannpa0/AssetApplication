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
public class KategoriTableModel extends AbstractTableModel{
    
    List<KategoriAset> listKategoriAset;

    
    
    private final String header[] = {
        "Kode Kategori Aset",
        "Nama Kategori Aset"
    };

    public KategoriTableModel(List<KategoriAset> listKategoriAset) {
        this.listKategoriAset = listKategoriAset;
    }

    
    @Override
    public int getRowCount() {
        return listKategoriAset.size();
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
        KategoriAset kategoriAset = listKategoriAset.get(rowIndex);
        switch (columnIndex){
            case 0:
                return kategoriAset.getKodeKategoriAset();
            case 1:
                return kategoriAset.getNamaKategoriAset();
            default:
                return null;
            
        }
    }
    
    public List<KategoriAset> getListKategoriAset() {
        return listKategoriAset;
    }

    public void setListKategoriAset(List<KategoriAset> listKategoriAset) {
        this.listKategoriAset = listKategoriAset;
    }
    
}
