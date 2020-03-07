/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.springframework.context.annotation.Primary;

/**
 *
 * @author dannp
 */
@Entity
@Table(name= "lokasi_aset")
public class LokasiAset extends Object{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name= "kode_lokasi_aset")
    private String kodeLokasiAset;
    
    @Column(name= "nama_lokasi_aset")
    private String namaLokasiAset;
    
    @OneToMany(fetch = FetchType.LAZY,
            mappedBy = "lokasi",
            cascade= {CascadeType.PERSIST, CascadeType.MERGE,
                CascadeType.DETACH, CascadeType.REFRESH})
    private List<AlokasiAset> listAlokasiAset;

    public LokasiAset(){};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKodeLokasiAset() {
        return kodeLokasiAset;
    }

    public void setKodeLokasiAset(String kodeLokasiAset) {
        this.kodeLokasiAset = kodeLokasiAset;
    }

    public String getNamaLokasiAset() {
        return namaLokasiAset;
    }

    public void setNamaLokasiAset(String namaLokasiAset) {
        this.namaLokasiAset = namaLokasiAset;
    }

    public List<AlokasiAset> getlistAlokasiAset() {
        return listAlokasiAset;
    }

    public void setlistAlokasiAset(List<AlokasiAset> listAset) {
        this.listAlokasiAset = listAset;
    }

    @Override
    public String toString() {
        return "LokasiAset{" + "id=" + id + ", kodeLokasiAset=" + kodeLokasiAset + ", namaLokasiAset=" + namaLokasiAset +  '}';
    }
    
    

}
