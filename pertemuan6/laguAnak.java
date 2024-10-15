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
public class laguAnak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Membuat objek scanner untuk menerima input dari user
        Scanner scanner = new Scanner(System.in);

        // Meminta input jumlah anak ayam (N) dari user
        System.out.print("Masukkan jumlah anak ayam: ");
        int n = scanner.nextInt();
            System.out.println("Tekotek Kotek Kotek");
            // Loop untuk menampilkan lirik lagu
            for (int i = n; i > 0; i--) {
                if (i == 1) {
                    // Baris terakhir jika anak ayam tinggal 1
                    System.out.println("Anak ayam turun " + i + ", mati satu tinggal induknya.");
                } else {
                    // Lirik untuk anak ayam yang lebih dari 1
                    System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1) + ".");
                }
            }
    }
}