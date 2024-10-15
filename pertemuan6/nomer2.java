/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan6;
import java.util.Scanner;

/**
 *
 * @author UseR
 */
public class nomer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Membuat objek scanner untuk menerima input dari user
        Scanner scanner = new Scanner(System.in);

        // Meminta input nilai n dari user
        System.out.print("Masukkan nilai n (maksimal 5): ");
        int n = scanner.nextInt();

        // Memeriksa apakah n valid (harus <= 5)
        if (n <= 5 && n > 0) {
            System.out.println("Tabel Perkalian " + n + " x " + n + ":");
            
            // Loop untuk baris
            for (int i = 1; i <= n; i++) {
                // Loop untuk kolom
                for (int j = 1; j <= n; j++) {
                    // Menghitung hasil perkalian dan mencetaknya
                    System.out.print(i * j + "\t");  // \t untuk tabulasi (agar rapi)
                }
                System.out.println();  // Pindah ke baris baru
            }
        } else {
            System.out.println("Nilai n harus antara 1 dan 5.");
        }
    }
}