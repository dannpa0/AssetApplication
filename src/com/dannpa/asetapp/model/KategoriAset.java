/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.model;

import java.util.ArrayList;
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
@Table(name = "kategori_aset")
public class KategoriAset extends Object {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "kode_kategori_aset")
    private String kodeKategoriAset;

    @Column(name = "nama_kategori_aset")
    private String namaKategoriAset;

    @OneToMany(mappedBy = "kategoriAset",
            cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Aset> asets = new ArrayList<>();

    public KategoriAset() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKodeKategoriAset() {
        return kodeKategoriAset;
    }

    public void setKodeKategoriAset(String kodeKategoriAset) {
        this.kodeKategoriAset = kodeKategoriAset;
    }

    public String getNamaKategoriAset() {
        return namaKategoriAset;
    }

    public void setNamaKategoriAset(String namaKategoriAset) {
        this.namaKategoriAset = namaKategoriAset;
    }

    public List<Aset> getAsets() {
        return asets;
    }

    public void setAsets(List<Aset> asets) {
        this.asets = asets;
    }

    public void add(Aset aset) {
        
        System.out.println("kategoriAset" +aset.toString());
        if (aset == null) {
            asets = new ArrayList<>();
        }

        asets.add(aset);

        aset.setKategoriAset(this);
    }

    @Override
    public String toString() {
        return "KategoriAset{" + "id=" + id + ", kodeKategoriAset=" + kodeKategoriAset + ", namaKategoriAset=" + namaKategoriAset + '}';
    }

}
