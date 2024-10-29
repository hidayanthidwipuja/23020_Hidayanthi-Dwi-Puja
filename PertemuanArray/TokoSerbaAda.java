/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanArray;

import java.util.ArrayList;

/**
 *
 * @author UseR
 */
public class TokoSerbaAda { //mendeklarasikan toko serba ada
     public ArrayList<Barang> daftarBarang = new ArrayList<>(); // menggunakan array
    
    public void tambahBarang(Barang barang) {
        daftarBarang.add(barang);
    }
    
    public void tampilkanStruk() { //mendeklarasikan tampilan menu awal
        System.out.println();
        System.out.println("TOKO SERBA ADA");
        System.out.println("********************");
        System.out.println("No  Kode Barang  Nama Barang  Harga  Jumlah Beli  Jumlah Bayar");
        
        int totalBayar = 0;
        for (int i = 0; i < daftarBarang.size(); i++) { //mendeklarasikan perhitungan pada proses pembelian
            Barang barang = daftarBarang.get(i);
            System.out.printf("%-4d%-13s%-13s%-7d%-12d%-12d%n", 
                    (i + 1), barang.getKode(), barang.getNama(), barang.getHarga(), barang.getJumlahBeli(), barang.getJumlahBayar());
            totalBayar += barang.getJumlahBayar();
        }
        // merupakan tampilan akhir pada program
        System.out.println("------------------------------------------------------------");
        System.out.printf("Total Bayar%39d%n", totalBayar);
    }
}

