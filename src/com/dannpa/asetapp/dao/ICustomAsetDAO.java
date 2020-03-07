/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.dao;

import com.dannpa.asetapp.model.Aset;

/**
 *
 * @author dannp
 */
public interface ICustomAsetDAO {
    
    public Aset getAsetFromLocation(int locationId);
    
}
