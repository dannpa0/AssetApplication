/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.test;

import com.dannpa.asetapp.dao.DAO;
import com.dannpa.asetapp.model.JenisAset;
import java.util.List;
import javax.transaction.Transactional;
import org.junit.Assert;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author dannp
 */

@ContextConfiguration(locations = "classpath:config-spring.xml")
@RunWith(JUnit4ClassRunner.class)
@Transactional
//@Rollback(true)
public class TestJenisAsetDAO {
    
    @Autowired
    private DAO<JenisAset> jenisAsetDao;
    
    @Test
    public void testSaveJenisAset(){
//        JenisAset jenisAset = new JenisAset();
//        jenisAset.setKodeJenisAset("TP");
//        jenisAset.setNamaJenisAset("TETAP");
        
        

//        jenisAsetDao.save(jenisAset);
        
        
        

//        JenisAset asetTetap = listJenisAset.stream()
//                .filter(aset -> "TP".equals(aset.getKodeJenisAset()))
//                .findFirst()
//                .orElse(null);
        
        Assert.assertEquals("ASSDFAS","ASDFWW");
    }
}
