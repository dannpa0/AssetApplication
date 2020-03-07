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
public class RoleTableModel extends AbstractTableModel{
    
    List<Role> listRole;

    
    
    private final String header[] = {
        "ID",
        "RoleName",
    };

    public RoleTableModel(List<Role> listRole) {
        this.listRole = listRole;
    }

    
    @Override
    public int getRowCount() {
        return listRole.size();
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
        Role role = listRole.get(rowIndex);
        switch (columnIndex){
            case 0:
                return role.getId();
            case 1:
                return role.getRoleName();
            default:
                return null;
            
        }
    }
    
    public List<Role> getListRole() {
        return listRole;
    }

    public void setListRole(List<Role> listRole) {
        this.listRole = listRole;
    }
    
}
