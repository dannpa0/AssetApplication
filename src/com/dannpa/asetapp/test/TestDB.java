/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.test;

import com.dannpa.asetapp.controller.AlokasiController;
import com.dannpa.asetapp.controller.AsetController;
import com.dannpa.asetapp.controller.JenisController;
import com.dannpa.asetapp.controller.KategoriController;
import com.dannpa.asetapp.controller.KondisiController;
import com.dannpa.asetapp.controller.LokasiController;
import com.dannpa.asetapp.controller.PenyusutanController;
import com.dannpa.asetapp.dao.AsetDAOImpl;
import com.dannpa.asetapp.dao.JenisDAOImpl;
import com.dannpa.asetapp.model.AlokasiAset;
import com.dannpa.asetapp.model.Aset;
import com.dannpa.asetapp.model.JenisAset;
import com.dannpa.asetapp.model.KategoriAset;
import com.dannpa.asetapp.model.KondisiAset;
import com.dannpa.asetapp.model.LokasiAset;
import com.dannpa.asetapp.model.PenyusutanAset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Calendar;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author dannp
 */
public class TestDB {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config-spring.xml");

        AlokasiController alokasiController = new AlokasiController(context);
        AsetController asetController = new AsetController(context);
        JenisController jenisController = new JenisController(context);
        KategoriController kategoriController = new KategoriController(context);
        KondisiController kondisiController = new KondisiController(context);
        LokasiController lokasiController = new LokasiController(context);
        PenyusutanController penyusutanController = new PenyusutanController(context);
//            context.getBean("JenisAsetService");

        // jenis aset
        JenisAset jenisAset = new JenisAset();
        jenisAset.setKodeJenisAset("BR");
        jenisAset.setNamaJenisAset("BERGERAK");
//            
//            JenisDAOImpl impl = new JenisDAOImpl();
//            impl.insert(jenisAset);
        // kategori aset
        

        // lokasi aset
        LokasiAset lokasiAset = lokasiController.selectById(1);
        System.out.println(lokasiAset.getlistAlokasiAset().get(0).getAset().toString());
//        lokasiAset.setKodeLokasiAset("K7A");
//        lokasiAset.setNamaLokasiAset("KELAS 7A");
//        LokasiAset lokasiAset = lokasiController.selectById(1);
        // kondisi aset
//        KondisiAset kondisiAset = new KondisiAset();
//        kondisiAset.setKodeKondisiAset("N");
//        kondisiAset.setNamaKondisiAset("BARU");
//            
        

//        LokasiAset lokasiAset = lokasiController.selectById(1);
        
        

        Calendar c = Calendar.getInstance();
        long tanggal = c.getTimeInMillis();
        
//        AlokasiAset alokasi = new AlokasiAset();
//        alokasi.setLokasi(lokasiAset);
//        alokasi.setJumlahAlokasiAset(20);

//        Aset aset = asetController.selectById(12);
        
//        AlokasiAset alokasiAset = new AlokasiAset();
//        alokasiAset.setAset(aset);
//        alokasiAset.setLokasi(lokasiAset);
//        alokasiAset.setJumlahAlokasiAset(10);
//        aset.setKategoriAset(kategoriAset);
//        aset.setKondisiAset(kondisiAset);
//        Aset wea = aset;
        
//        System.out.println(aset.toString());
//        KategoriAset kategoriAset = kategoriController.selectById(2);
//        System.out.println(kategoriAset.getAsets().toString());
        
//        aset.setKategoriAset(kategoriAset);
//        System.out.println(kategoriAset.toString());
        
//        kategoriAset.add(aset);
        
        
//        Aset aset = new Aset();
//        aset.setKodeAset("NUI0001");
//        aset.setNamaAset("KURSI BIRU");
//        aset.setJenisAset(jenisAset);
//        aset.setKategoriAset(kategoriAset);
//        aset.setTglTerimaAset(tanggal);
//        aset.setPemakaian(5);
//        aset.setNilaiAset(100000);
//        aset.setJumlahAset(20);
//        aset.addAlokasiAset(alokasiAset);
//        aset.setKondisiAset(kondisiAset);
//            aset.setNilaiAset(100000);
        
//        aset.addLokasi(lokasiAset, 10);
//            aset.setKondisiAset(kondisiAset);

        
        // alokasi aset
        
//            aset.setKode("123456");
//            aset.setNamaAset("The Nama");
//            aset.setJenisAset("jenis aset");
//            aset.setKategoriAset("kategori");
//            aset.setTanggalTerima(1234124);
//            aset.setPemakaian("5");
//            aset.setNilaiAset(2000);
//            aset.setLokasiAset("lokasi");
//            aset.setJumlah(40);
//            aset.setKondisi("Baik");
        if (lokasiAset != null) {

            try {
//                alokasiController.insert(alokasiAset);
//                asetController.updateAset(aset);
//                    controller.insertAset(aset);
//                alokasiController.insert(alokasi);
//                    jenisController.insertAset(jenisAset);
//                kategoriController.insert(kategoriAset);
//                controller.insertAset(aset);
//                lokasiController.insert(lokasiAset);

                System.out.println("Insert Lokasi Aset Success!!!");
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            System.out.println("null");
        }

    }

}
