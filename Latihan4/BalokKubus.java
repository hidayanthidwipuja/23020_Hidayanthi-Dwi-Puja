/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Latihan4;

/**
 *
 * @author UseR
 */
public class BalokKubus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Membuat objek balok
        Balok balok = new Balok(7, 5, 2);
        System.out.println("Volume Balok: " + balok.Volume());
        System.out.println("Luas Permukaan Balok: " + balok.LuasPermukaan());
        
        // Membuat objek kubus
        Kubus kbs = new Kubus(8);
        System.out.println("Volume Kubus: " + kbs.Volume());
        System.out.println("Luas Permukaan Kubus: " + kbs.LuasPermukaan());
        
        Kubus kbs2 = new Kubus(10);
        System.out.println("Sisi Kubus:" + kbs2.vlm(10));
        System.out.println("Luas permukaan Kubus:" + kbs2.luas(10));
    }
        
}