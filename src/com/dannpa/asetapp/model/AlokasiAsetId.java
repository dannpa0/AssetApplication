/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author dannp
 */
@Embeddable
public class AlokasiAsetId implements Serializable {

    @Column(name = "aset_id")
    private int aset;

    @Column(name = "lokasi_id")
    private int lokasi;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.aset;
        hash = 53 * hash + this.lokasi;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AlokasiAsetId other = (AlokasiAsetId) obj;
        return true;
    }

}
