/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuannn3;

/**
 *
 * @author UseR
 */
public class MatematikaInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        iniMatematika mtk = new iniMatematika();
        //Matematika memanggil method method dari kelas matematika (melalui pewarisan)
        
        mtk.pertambahan(10, 10);
        
        mtk.pengurangan(10, 5);
       
        mtk.perkalian(10, 3);
        
        mtk.pembagian(21, 2);
        
        mtk.modulus(9, 2);
}
}
