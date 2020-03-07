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
public class UserTableModel extends AbstractTableModel{
    
    List<User> listUser;

    
    
    private final String header[] = {
        "Username",
        "Password",
        "Role"
    };

    public UserTableModel(List<User> listUser) {
        this.listUser = listUser;
    }

    
    @Override
    public int getRowCount() {
        return listUser.size();
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
        User user = listUser.get(rowIndex);
        switch (columnIndex){
            case 0:
                return user.getUsername();
            case 1:
                return user.getPassword();
            case 2:
                return user.getRole().getRoleName();
            default:
                return null;
            
        }
    }
    
    public List<User> getListUser() {
        return listUser;
    }

    public void setListUser(List<User> listUser) {
        this.listUser = listUser;
    }
    
}
