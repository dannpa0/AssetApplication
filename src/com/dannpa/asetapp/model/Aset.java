/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author dannp
 */

@Entity
@Table(name= "aset")
public class Aset extends Object implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name = "kode_aset")
    private String kodeAset;
    
    @Column(name = "nama_aset")
    private String namaAset;
    
    @Column(name = "tanggal_terima_aset")
    private long tglTerimaAset;
    
    @Column(name = "pemakaian")
    private int pemakaian;
    
    @Column(name = "nilai_aset")
    private double nilaiAset;
    
    @Column(name = "jumlah_aset")
    private int jumlahAset;
    
    @ManyToOne(fetch = FetchType.LAZY,
            cascade= {CascadeType.DETACH , CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "jenis_aset_id") 
    private JenisAset jenisAset;
    
    @ManyToOne(fetch = FetchType.LAZY,
            cascade= {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "kategori_aset_id")
    private KategoriAset kategoriAset;
    
    @ManyToOne(fetch = FetchType.LAZY,
            cascade= {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "kondisi_aset_id")
    private KondisiAset kondisiAset;
    
    @OneToMany(fetch = FetchType.LAZY,
            mappedBy = "aset",
            cascade = CascadeType.REMOVE)
    private List<AlokasiAset> listAlokasiAset;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "penyusutan_aset_id")
    private PenyusutanAset penyusutanAset;
    
    
    public Aset(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKodeAset() {
        return kodeAset;
    }

    public void setKodeAset(String kodeAset) {
        this.kodeAset = kodeAset;
    }

    public String getNamaAset() {
        return namaAset;
    }

    public void setNamaAset(String namaAset) {
        this.namaAset = namaAset;
    }

    public long getTglTerimaAset() {
        return tglTerimaAset;
    }

    public void setTglTerimaAset(long tglTerimaAset) {
        this.tglTerimaAset = tglTerimaAset;
    }

    public int getPemakaian() {
        return pemakaian;
    }

    public void setPemakaian(int pemakaian) {
        this.pemakaian = pemakaian;
    }

    public double getNilaiAset() {
        return nilaiAset;
    }

    public void setNilaiAset(double nilaiAset) {
        this.nilaiAset = nilaiAset;
    }

    public int getJumlahAset() {
        return jumlahAset;
    }

    public void setJumlahAset(int jumlahAset) {
        this.jumlahAset = jumlahAset;
    }

    public JenisAset getJenisAset() {
        return jenisAset;
    }

    public void setJenisAset(JenisAset jenisAset) {
        this.jenisAset = jenisAset;
    }

    public KategoriAset getKategoriAset() {
        return kategoriAset;
    }

    public void setKategoriAset(KategoriAset kategoriAset) {
        this.kategoriAset = kategoriAset;
    }

    public KondisiAset getKondisiAset() {
        return kondisiAset;
    }

    public void setKondisiAset(KondisiAset kondisiAset) {
        this.kondisiAset = kondisiAset;
    }

    public List<AlokasiAset> getListAlokasiAset() {
        return listAlokasiAset;
    }

    public void setListAlokasiAset(List<AlokasiAset> listAlokasiAset) {
        this.listAlokasiAset = listAlokasiAset;
    }

    public PenyusutanAset getPenyusutanAset() {
        return penyusutanAset;
    }

    public void setPenyusutanAset(PenyusutanAset penyusutanAset) {
        this.penyusutanAset = penyusutanAset;
    }
    
    
    public void addAlokasiAset(AlokasiAset alokasiAset){
        if(listAlokasiAset == null){
            listAlokasiAset = new ArrayList<>();
        }
        alokasiAset.setAset(this);
        listAlokasiAset.add(alokasiAset);
       
    }
    
//    @Override
//    public String toString() {
//        return "Aset{" + "id=" + id + ", kodeAset=" + kodeAset + ", namaAset=" + namaAset + ", tglTerimaAset=" + tglTerimaAset + ", pemakaian=" + pemakaian 
//                + ", nilaiAset=" + nilaiAset + ", jumlahAset=" + jumlahAset + '}';
//    }

    @Override
    public String toString() {
        return "Aset{" + "id=" + id + ", kodeAset=" + kodeAset + ", namaAset=" + namaAset + ", tglTerimaAset=" + tglTerimaAset + ", pemakaian=" + pemakaian + ", nilaiAset=" + nilaiAset + ", jumlahAset=" + jumlahAset +   '}';
    }
    
   
}
