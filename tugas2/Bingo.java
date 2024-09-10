/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author UseR
 */
public class Bingo {
   // Method untuk menyanyikan bagian lagu Bingo dengan jumlah tepukan
    public void singBingo(int bertepukTangan) {
        String[] bingo = {"B", "I", "N", "G", "O"};

        // Tampilkan kalimat "There was a farmer..."
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o.");

        // Loop untuk 3 baris dengan nama Bingo
        for (int i = 0; i < 3; i++) {
            // Tampilkan tepukan dan huruf
            for (int j = 0; j < bingo.length; j++) {
                if (j < bertepukTangan) {
                    System.out.print("(bertepukTangan)");
                } else {
                    System.out.print(bingo[j]);
                }
                if (j != bingo.length - 1) {
                    System.out.print("-");
                }
            }
            System.out.println(); // baris baru setelah menampilkan B-I-N-G-O atau tepukan
        }

        // Tampilkan kalimat terakhir "And Bingo was his name-o."
        System.out.println("And Bingo was his name-o.");
        System.out.println(); // baris kosong untuk pemisah
    }
}