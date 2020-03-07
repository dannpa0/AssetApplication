/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

/**
 *
 * @author dannp
 */
@Entity
@Table(name = "alokasi_aset")
public class AlokasiAset extends Object implements Serializable {
    
    
    @Id
    @ManyToOne(fetch = FetchType.LAZY,
            cascade= CascadeType.ALL)
    @JoinColumn(name = "aset_id")
    private Aset aset;
    
    @Id
    @ManyToOne(fetch = FetchType.LAZY,
            cascade= {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "lokasi_id")
    private LokasiAset lokasi;
    
    @Column(name = "jumlah_alokasi_aset")
    private int jumlahAlokasiAset;

    public AlokasiAset() {
    }

    public Aset getAset() {
        return aset;
    }

    public void setAset(Aset aset) {
        this.aset = aset;
    }

    public LokasiAset getLokasi() {
        return lokasi;
    }

    public void setLokasi(LokasiAset lokasiAset) {
        this.lokasi = lokasiAset;
    }

    public int getJumlahAlokasiAset() {
        return jumlahAlokasiAset;
    }

    public void setJumlahAlokasiAset(int jumlahAlokasiAset) {
        this.jumlahAlokasiAset = jumlahAlokasiAset;
    }

    @Override
    public String toString() {
        return "AlokasiAset{ jumlahAlokasiAset=" + jumlahAlokasiAset + '}';
    }

    
    
    
    
}
