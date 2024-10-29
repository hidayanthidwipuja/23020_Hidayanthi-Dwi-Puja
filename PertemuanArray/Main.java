/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PertemuanArray;

import java.util.Scanner;

/**
 *
 * @author UseR
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        TokoSerbaAda toko = new TokoSerbaAda();
        
        System.out.println("TOKO SERBA ADA"); //merupakan tampilan dari TOKO SERBA ADA
        System.out.println("********************");
        
        System.out.print("Masukkan Item Barang: "); //mendeklarasikan proses masuknya barang
        int itemCount = input.nextInt();
        input.nextLine();  // Consume newline

        for (int i = 0; i < itemCount; i++) { //proses perhitungan data masuk
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan Kode        : ");
            String kode = input.nextLine();
            
            System.out.print("Masukkan jumlah Beli : "); //proses perhitungan data yg dibeli user
            int jumlahBeli = input.nextInt();
            input.nextLine();  
            
            Barang barang = new Barang(kode, jumlahBeli);
            toko.tambahBarang(barang);
        }

        toko.tampilkanStruk();
        input.close();
    }   
}