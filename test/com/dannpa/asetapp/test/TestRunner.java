/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author dannp
 */

public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestJenisAsetDAO.class);
        for(Failure failure: result.getFailures()){
            System.err.println(failure.toString());
        }
    }
    
}
