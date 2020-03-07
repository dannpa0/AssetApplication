/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author dannp
 */
@Entity
@Table(name= "penyusutan_aset")
public class PenyusutanAset extends Object{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name = "umur_ekonomis")
    private int umurEkonomis;
    
    @Column(name = "penyusutan")
    private double jumlahPenyusutan;
    
    @OneToOne(mappedBy="penyusutanAset", cascade=CascadeType.ALL)
    private Aset aset;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUmurEkonomis() {
        return umurEkonomis;
    }

    public void setUmurEkonomis(int umurEkonomis) {
        this.umurEkonomis = umurEkonomis;
    }

    public double getJumlahPenyusutan() {
        return jumlahPenyusutan;
    }

    public void setJumlahPenyusutan(double jumlahPenyusutan) {
        this.jumlahPenyusutan = jumlahPenyusutan;
    }

    public Aset getAset() {
        return aset;
    }

    public void setAset(Aset aset) {
        this.aset = aset;
    }
    
    

    @Override
    public String toString() {
        return "PenyusutanAset{" + "id=" + id + ", umurEkonomis=" + umurEkonomis + ", jumlahPenyusutan=" + jumlahPenyusutan +  '}';
    }
    
    
}
