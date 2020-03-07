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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author dannp
 */

@Entity
@Table(name= "kondisi_aset")
public class KondisiAset extends Object{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name = "kode_kondisi_aset")
    private String kodeKondisiAset;
    
    @Column(name = "nama_kondisi_aset")
    private String namaKondisiAset;
    
    @OneToMany(mappedBy = "kondisiAset",
            cascade = {CascadeType.DETACH , CascadeType.MERGE,
                            CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Aset> asets;

    public KondisiAset() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKodeKondisiAset() {
        return kodeKondisiAset;
    }

    public void setKodeKondisiAset(String kodeKondisiAset) {
        this.kodeKondisiAset = kodeKondisiAset;
    }

    

    public String getNamaKondisiAset() {
        return namaKondisiAset;
    }

    public void setNamaKondisiAset(String namaKondisiAset) {
        this.namaKondisiAset = namaKondisiAset;
    }

    public List<Aset> getAsets() {
        return asets;
    }

    public void setAsets(List<Aset> asets) {
        this.asets = asets;
    }
    
    @Override
    public String toString() {
        return "KondisiAset{" + "id=" + id + ", kodeKondisiAset=" + kodeKondisiAset + ", namaKondisiAset=" + namaKondisiAset +'}';
    }
    
}
