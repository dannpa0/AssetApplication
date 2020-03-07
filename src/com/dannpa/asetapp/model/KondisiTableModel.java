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
public class KondisiTableModel extends AbstractTableModel{
    
    List<KondisiAset> listKondisiAset;
    
    private final String header[] = {
        "Kode Kondisi Aset",
        "Nama Kondisi Aset"
    };

    public KondisiTableModel(List<KondisiAset> listKondisiAset) {
        this.listKondisiAset = listKondisiAset;
    }

    
    @Override
    public int getRowCount() {
        return listKondisiAset.size();
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
        KondisiAset kondisiAset = listKondisiAset.get(rowIndex);
        switch (columnIndex){
            case 0:
                return kondisiAset.getKodeKondisiAset();
            case 1:
                return kondisiAset.getNamaKondisiAset();
            default:
                return null;
            
        }
    }

    public List<KondisiAset> getListKondisiAset() {
        return listKondisiAset;
    }

    public void setListKondisiAset(List<KondisiAset> listKondisiAset) {
        this.listKondisiAset = listKondisiAset;
    }
    
}
