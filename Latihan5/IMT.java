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
public class IMT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Kategori;
        Scanner input = new Scanner(System.in);

        // Input berat badan dan tinggi badan
        System.out.print("Masukkan berat badan: ");
        double beratBadan = input.nextDouble();

        System.out.print("Masukkan tinggi badan: ");
        double tinggiBadan = input.nextDouble();

        // Hitung IMT
        double imt = beratBadan / tinggiBadan * tinggiBadan;

       
        if(imt >= 40){
            Kategori = "Sangat Gemuk";
        }else if(imt >= 30){
            Kategori = "Gemuk";
        }else if(imt >= 25){
            Kategori = "Berat Badan Lebih";
        }else if(imt >= 18.5){
            Kategori = "Berat Badan Ideal";
        }else{
            Kategori = "Barat Badan Kurang";
        }
        System.out.println("imt anda adalah: " + imt);
        // Menentukan kriteria berdasarkan IMT
        System.out.println("Kategori Anda adalah: "+ Kategori);
    
    }
    
}
