/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author UseR
 */
public class BilanganGanjilGenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // proses perhitungan bilangan genap yang dimana menggunakan for dalam perulangannya
         System.out.println("Bilangan Genap dari 0 sampai 20:");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        //// proses perhitungan bilangan genap yang dimana menggunakan for dalam perulangannya
        System.out.println("\n\nBilangan Ganjil dari 0 sampai 20:");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}