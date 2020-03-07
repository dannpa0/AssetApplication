/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.test;

import com.dannpa.asetapp.model.AlokasiAset;
import com.dannpa.asetapp.model.Aset;
import com.dannpa.asetapp.model.JenisAset;
import com.dannpa.asetapp.model.KategoriAset;
import com.dannpa.asetapp.model.KondisiAset;
import com.dannpa.asetapp.model.LokasiAset;
import com.dannpa.asetapp.model.PenyusutanAset;
import com.dannpa.asetapp.service.AlokasiAsetService;
import com.dannpa.asetapp.service.AsetService;
import com.dannpa.asetapp.service.JenisAsetService;
import com.dannpa.asetapp.service.KategoriAsetService;
import com.dannpa.asetapp.service.LokasiAsetService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author dannp
 */
public class TestSelectDB {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config-spring.xml");

        KategoriAsetService kategoriService = (KategoriAsetService) context.getBean("KategoriAsetService");
        AlokasiAsetService alokasiService = (AlokasiAsetService) context.getBean("AlokasiAsetService");
        AsetService asetService = (AsetService) context.getBean("AsetService");
//        AlokasiAsetService alokasiService = (AlokasiAsetService) context.getBean("AlokasiAsetService");
//        
//
//        LokasiAsetService lokasiService = (LokasiAsetService) context.getBean("LokasiAsetService");
//        List<AlokasiAset> listAlokasi = alokasiService.selectAll();

//        JenisAsetService jenisService = (JenisAsetService)context.getBean("JenisAsetService");
//        List<LokasiAset> listLokasiAset = lokasiService.selectAll();
//        List<JenisAset> listJenisAset = jenisService.selectAll();
//        System.out.println(listJenisAset.get(0).toString());
//        listLokasiAset.stream().forEach(aset -> System.out.println(aset.toString()));
//        List<KategoriAset> listKategoriAset = kategoriService.selectAll();
//        listKategoriAset.stream().forEach(kategori ->{
//            System.out.println(kategori.toString());
//        });
        List<Aset> listAset = asetService.selectAll();
//        int index = 0;
//        listAset.stream().forEach(aset -> {
//            System.out.print("the index = " +listAset.indexOf(aset)+"\t");
//            System.out.println(aset.getNamaAset());

//            index = index+1;
//            System.out.println("\t"+aset.getListAlokasiAset().get(aset.getListAlokasiAset().indexOf(aset)).getLokasi().getKodeLokasiAset());
//            System.out.println(aset.getKategoriAset().toString());
//            aset.getListAlokasiAset().stream().forEach(alokasi -> System.out.println(alokasi.toString()));
//        });
        int idxOfLokasi = 0;

        
        int idOfAset = -1;
        for (Aset aset : listAset) {

            List<AlokasiAset> listAlokasi = aset.getListAlokasiAset();

            if (idOfAset != aset.getId()) {
                if (aset.getListAlokasiAset().size() > 0) {
                    for (AlokasiAset aa : listAlokasi) {

                        System.out.println(aa.getAset().getId() 
                                + "\t" + aa.getAset().getNamaAset() 
                                + "\t" + aa.getLokasi().getNamaLokasiAset());

                    }
                }else{
                    System.out.println(aset.getId() + "\t" + aset.getNamaAset());
                }

                idOfAset = aset.getId();
            } else {
                idOfAset = aset.getId();
                continue;
            }

//            if (!namaAset.equals(aset.getNamaAset())) {
//                if (i == 1) {
//                    continue;
//                } else {
//                    
//                }
//                i = 1;
//                namaAset = aset.getNamaAset();
//            } else {
//                continue;
//            }
//            if (aset.getListAlokasiAset().size() == 0) {
//            }
//            System.out.println(aset.getId());
//            if(aset.getListAlokasiAset() != null && idxOfLokasi < aset.getListAlokasiAset().size()){
//                
//                idxOfLokasi++;
//            }else{
//                System.out.println(aset.getNamaAset());
////                idxOfLokasi = 0;
//            }
        }

//           List<AlokasiAset> listAlokasi = alokasiService.selectAll();
//           listAlokasi.stream().forEach(alokasi -> {
//               System.out.println(alokasi.toString());
//               System.out.println("\t"+alokasi.getAset().getNamaAset());
//               System.out.println("\t"+alokasi.getAset().getJenisAset().toString());
//               System.out.println("\t"+alokasi.getLokasi().getNamaLokasiAset());
//           });
//        System.out.println("get aset with id = 2");
//        Aset aset = asetService.selectById(6);
//        
//        
//        
//        System.out.println(aset.toString());
//        
//        System.out.println("delete aset with id = 2");
//        asetService.delete(aset);
//        
//        List<Aset> listAset = asetService.selectAll();
//        for(Aset a:listAset){
//            System.out.println(a.toString());
//        }
//        System.out.println("after delete aset");
//        System.out.println(aset.toString());
    }

}
