/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.model;

import java.io.Serializable;
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
import javax.transaction.Transactional;

/**
 *
 * @author dannp
 */
@Entity
@Table(name = "jenis_aset")
@Transactional
public class JenisAset extends Object {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name = "kode_jenis_aset")
    private String kodeJenisAset;
    
    @Column(name = "nama_jenis_aset")
    private String namaJenisAset;
    
    @OneToMany(mappedBy = "jenisAset",
            cascade = {CascadeType.DETACH , CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Aset> asets;

    public JenisAset() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKodeJenisAset() {
        return kodeJenisAset;
    }

    public void setKodeJenisAset(String kodeJenisAset) {
        this.kodeJenisAset = kodeJenisAset;
    }

    public String getNamaJenisAset() {
        return namaJenisAset;
    }

    public void setNamaJenisAset(String namaJenisAset) {
        this.namaJenisAset = namaJenisAset;
    }

    public List<Aset> getAsets() {
        return asets;
    }

    public void setAsets(List<Aset> asets) {
        this.asets = asets;
    }

    @Override
    public String toString() {
        return "JenisAset{" + "id=" + id + ", kodeJenisAset=" + kodeJenisAset + ", namaJenisAset=" + namaJenisAset + '}';
    }
    
    
    
}
