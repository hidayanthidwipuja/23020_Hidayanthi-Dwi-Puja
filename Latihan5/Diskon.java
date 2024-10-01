/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Latihan5;
import java.util.Scanner;

/**
 *
 * @author UseR
 */ 
public class Diskon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Membuat objek scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan total pembelian
        System.out.print("Masukkan total pembelian Rp. = ");
        double totalPembelian = input.nextDouble();

        // Variabel untuk menyimpan potongan dan jumlah yang harus dibayar
        double potongan;
        double jumlahBayar;

        // Menentukan potongan berdasarkan total pembelian
        if (totalPembelian < 50000) {
            potongan = totalPembelian * 0.05;  // Potongan 5%
        } else {
            potongan = totalPembelian * 0.20;  // Potongan 20%
        }

        // Menghitung jumlah yang harus dibayarkan
        jumlahBayar = totalPembelian - potongan;

        // Menampilkan hasil
        System.out.println("Besarnya potongan Rp. " + potongan);
        System.out.println("Jumlah yang harus dibayarkan Rp. " + jumlahBayar);

        // Menutup scanner
        input.close();
    }
    
}
