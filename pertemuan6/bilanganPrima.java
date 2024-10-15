/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author UseR
 */
public class bilanganPrima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Merupakan Bilangan Prima dari 0 sampai 20:");
        //merupakan perhitungan pada bilangan prima yang dimulai dari 2
        for (int j = 0; j <= 20; j++) {
            if (mtk(j)) {
                System.out.print(j + " ");
            }
        }
        // merupakan perhitungan bukan bilangan prima jadi akan menampilkan dimulai dari 0
        System.out.println("\n\nBilangan Bukan Prima dari 0 sampai 20:");
        for (int j = 0; j <= 20; j++) {
            if (!mtk(j)) {
                System.out.print(j + " ");
            }
        }
    }
    public static boolean mtk(int nomer) { //pembuktian bahwa 0 dan 1 bukan bilangan prima
        // Bilangan 0 dan 1 bukan bilangan prima
        if (nomer <= 1) {
            return false;
        }
        // Cek pembagi dari 2 sampai akar dari number
        for (int j = 2; j <= Math.sqrt(nomer); j++) {
            if (nomer % j == 0) {
                return false;
            }
        }
        return true;
    }
}