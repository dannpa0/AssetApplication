/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dannp
 */
public class AsetTableModel extends AbstractTableModel {

    List<Aset> listAset;
    

    private final String header[] = {"Kode Aset",
        "Nama Aset",
        "Jenis Aset",
        "Kategori Aset",
        "Tanggal Terima Aset",
        "Pemakaian",
        "Nilai Aset",
        "Lokasi Aset",
        "Jumlah Aset",
        "Kondisi Aset"
    };

    public AsetTableModel(List<Aset> listAset) {
        this.listAset = listAset;
        for(Aset aset:listAset){
            
        }

    }

    @Override
    public int getRowCount() {
        return listAset.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public String getColumnName(int column) {
        return header[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Object aset = listAset.get(rowIndex);
//        List<AlokasiAset> listAlokasiAset = aset.getListAlokasiAset();
        System.out.println(aset.getClass().toString());
        if (aset.getClass().equals(Aset.class)) {
//            System.out.println("here");
            switch (columnIndex) {
                case 0:
                    // kode aset
                    return ((Aset) aset).getKodeAset();
                case 1:
                    System.out.println(((Aset) aset).getNamaAset());
                    // nama aset
                    return ((Aset) aset).getNamaAset();
                case 2:
                    // jenis aset
                    String jenis = null;
                    try {
                        jenis = ((Aset) aset).getJenisAset().getNamaJenisAset();

                    } catch (NullPointerException ex) {
                        jenis = "";
                    }
                    return jenis;
                case 3:
                    // kategori aset
                    String kategori = null;
                    try {
                        kategori = ((Aset) aset).getKategoriAset().getNamaKategoriAset();
                    } catch (NullPointerException ex) {
                        kategori = "";
                    }
                    return kategori;
//                return (aset.getKategoriAset().getNamaKategoriAset()!=null?aset.getKategoriAset().getNamaKategoriAset():"");
                case 4:
                    // tanggal terima aset
                    Calendar cal = Calendar.getInstance();
                    cal.setTimeInMillis(((Aset) aset).getTglTerimaAset());
                    Date date = cal.getTime();
                    SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
                    String dateFormat = format.format(date);
                    return dateFormat;
                case 5:
                    // pemakaian
                    return ((Aset) aset).getPemakaian();
                case 6:
                    // nilai aset
                    return ((Aset) aset).getNilaiAset();
                case 7:
                    // lokasi aset
//                String lokasi = null;
//                try {
//                    lokasi = aset.getListAlokasiAset().get(0).getLokasi().getKodeLokasiAset();
//
//                } catch (Exception ex) {
//                    lokasi = "";
//                }
                    return "";
//                return (aset.getListAlokasiAset().get(rowIndex).getLokasi()!=null?aset.getListAlokasiAset().get(rowIndex).getLokasi():"");
                case 8:
                    // jumlah aset
                    return ((Aset) aset).getJumlahAset();
                case 9:
                    // kondisi aset
                    String kondisi = null;
                    try {
                        kondisi = ((Aset) aset).getKondisiAset().getNamaKondisiAset();
                    } catch (NullPointerException ex) {
                        kondisi = "";
                    }
                    return kondisi;

                default:
                    return null;
            }
        } else if (aset.getClass().equals(HashMap.class)) {
            
            Set set = ((Map)aset).entrySet();
            switch (columnIndex) {
                case 0:
                    // kode aset
                    return ((Aset) ((Map.Entry)set.iterator().next()).getKey()).getId();
                case 1:
                    // nama aset
                    return ((Aset) ((Map.Entry)set.iterator().next()).getKey()).getNamaAset();
                case 2:
                    // jenis aset
                    String jenis = null;
                    try {
                        jenis = ((Aset) ((Map.Entry)set.iterator().next()).getKey()).getJenisAset().getNamaJenisAset();

                    } catch (NullPointerException ex) {
                        jenis = "";
                    }
                    return jenis;
                case 3:
                    // kategori aset
                    String kategori = null;
                    try {
                        kategori = ((Aset) ((Map.Entry)set.iterator().next()).getKey()).getKategoriAset().getNamaKategoriAset();
                    } catch (NullPointerException ex) {
                        kategori = "";
                    }
                    return kategori;
//                return (aset.getKategoriAset().getNamaKategoriAset()!=null?aset.getKategoriAset().getNamaKategoriAset():"");
                case 4:
                    // tanggal terima aset
                    Calendar cal = Calendar.getInstance();
                    cal.setTimeInMillis(((Aset) ((Map.Entry)set.iterator().next()).getKey()).getTglTerimaAset());
                    Date date = cal.getTime();
                    SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
                    String dateFormat = format.format(date);
                    return dateFormat;
                case 5:
                    // pemakaian
                    return ((Aset) ((Map.Entry)set.iterator().next()).getKey()).getPemakaian();
                case 6:
                    // nilai aset
                    return ((Aset) ((Map.Entry)set.iterator().next()).getKey()).getNilaiAset();
                case 7:
                    // lokasi aset
                    
                    AlokasiAset la = (AlokasiAset) ((Map.Entry)set.iterator().next()).getValue();
                    return la.getLokasi().getNamaLokasiAset();
//                return (aset.getListAlokasiAset().get(rowIndex).getLokasi()!=null?aset.getListAlokasiAset().get(rowIndex).getLokasi():"");
                case 8:
                    // jumlah aset
                    return ((Aset) ((Map.Entry)set.iterator().next()).getKey()).getJumlahAset();
                case 9:
                    // kondisi aset
                    String kondisi = null;
                    try {
                        kondisi = ((Aset) ((Map.Entry)set.iterator().next()).getKey()).getKondisiAset().getNamaKondisiAset();
                    } catch (NullPointerException ex) {
                        kondisi = "";
                    }
                    return kondisi;

                default:
                    return null;
            }
        }else{
            return null;    
        }
    }

    public List<Aset> getListAset() {
        return listAset;
    }

    public void setListAset(List<Aset> listAset) {
        this.listAset = listAset;
    }
}
