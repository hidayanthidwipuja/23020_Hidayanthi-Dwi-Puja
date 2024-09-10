/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author UseR
 */
public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika mtk = new Matematika ();
    // petambahan
        int hasilPertambahan = mtk.pertambahan(50, 50);
        System.out.println("Pertambahan: 50 + 50 = " + hasilPertambahan);

        int hasilPengurangan = mtk.pengurangan(70, 20);
        System.out.println("Pengurangan: 70 - 20 = " + hasilPengurangan);

        int hasilPerkalian = mtk.perkalian(20, 3);
        System.out.println("Perkalian: 20 * 3 = " + hasilPerkalian);

        int hasilPembagian = mtk.pembagian(21, 2);
        System.out.println("Pembagian:  21 / 2 = " + hasilPembagian);
    } 
}