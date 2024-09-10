/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2;

/**
 *
 * @author UseR
 */
public class BingoBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Membuat instance dari kelas SongPrinter
        Bingo pembuatLagu = new Bingo();

        // Bagian pertama (B-I-N-G-O tanpa tepukan)
        pembuatLagu.singBingo(0);

        // Bagian kedua (tepukan dimulai dari B)
        for (int i = 1; i <= 5; i++) {
            pembuatLagu.singBingo(i);
        }
    }
}

