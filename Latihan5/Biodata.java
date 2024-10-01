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
public class Biodata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Tampilkan Nama:");
        String nama = input.nextLine();
        
        System.out.print("Masukan Npm:");
        String npm = input.nextLine();
        
        System.out.print("Masukan Nilai kehadiran:");
        double nilaiKehadiran = input.nextDouble();
        
       System.out.print("Masukan Nilai Tugas:");
       double nilaiTugas = input.nextDouble();
       
        System.out.print("Masukkan Nilai UTS: ");
        double nilaiUTS = input.nextDouble();

        System.out.print("Masukkan Nilai UAS: ");
        double nilaiUAS = input.nextDouble();

        // Menghitung nilai akhir berdasarkan bobot yang diberikan
        double nilaiAkhir = (0.10 * nilaiKehadiran) + (0.20 * nilaiTugas) + (0.30 * nilaiUTS) + (0.40 * nilaiUAS);
        
        String grade, keterangan;

        if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
            grade = "A";
            keterangan = "ISTIMEWA";
        } else if (nilaiAkhir >= 67 && nilaiAkhir <= 75) {
            grade = "B";
            keterangan = "BAIK";
        } else if (nilaiAkhir >= 50 && nilaiAkhir <= 65) {
            grade = "C";
            keterangan = "CUKUP";
        } else if (nilaiAkhir >= 30 && nilaiAkhir <= 55) {
            grade = "D";
            keterangan = "KURANG";
        } else {
            grade = "E";
            keterangan = "KURANG SEKALI";
        }

        // Menampilkan hasil
        System.out.println("\n--- Hasil Akhir ---");
        System.out.println("NPM Mahasiswa : " + npm);
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Nilai Rata-rata : " + nilaiAkhir);
        System.out.println("Grade : " + grade);
        System.out.println("Keterangan : " + keterangan);

        // Menutup scanner
        input.close();
    }

}
