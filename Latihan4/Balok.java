/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan4;

/**
 *
 * @author UseR
 */
public class Balok extends BangunRuang{
    private double panjang, lebar, tinggi;
    
    // Constructor untuk balok
    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    // Override method untuk menghitung volume balok
    @Override
    public double Volume() {
        return panjang * lebar * tinggi;
    }
    
    // Override method untuk menghitung luas permukaan balok
    @Override
    public double LuasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}
