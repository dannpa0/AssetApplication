/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.dao;

import java.util.List;
import com.dannpa.asetapp.model.LokasiAset;
import com.dannpa.asetapp.model.User;

/**
 *
 * @author dannp
 */
public interface UserDAO {
    User verifyUser(String name, String password);
}
