/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanArray;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author UseR
 */
public class Barang { //mendeklarasikan kode, nama, harga, dan jumlah beli
    public String kode;
    public String nama;
    public int harga;
    public int jumlahBeli;
    
    public Barang(String kode, int jumlahBeli) {
        this.kode = kode;
        this.jumlahBeli = jumlahBeli;
        setNamaHarga();
    }
    
    public void setNamaHarga() {
        switch (kode) { //mendeklarasikan kode a001 menyatakan bahwa itu buku, satu harganya bernilai 3000
            case "a001":
                this.nama = "Buku";
                this.harga = 3000;
                break;
            case "a002": //mendeklarasikan kode a002 menyatakan bahwa itu buku, satu harganya bernilai 4000
                this.nama = "Pensil";
                this.harga = 4000;
                break;
            case "a003": //mendeklarasikan kode a003 menyatakan bahwa itu buku, satu harganya bernilai 5000
                this.nama = "Pulpen";
                this.harga = 5000;
                break;
            default:
                this.nama = "Tidak Dikenal";
                this.harga = 0;
                break;
        }
    }
    
    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public int getJumlahBeli() {
        return jumlahBeli;
    }

    public int getJumlahBayar() {
        return harga * jumlahBeli;
    }
}