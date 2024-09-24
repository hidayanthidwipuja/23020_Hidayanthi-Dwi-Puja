/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan4;

/**
 *
 * @author UseR
 */
public class Kubus extends BangunRuang {
    private double sisi ;
    
    // Constructor untuk kubus
    public Kubus(double sisi) {
        this.sisi = sisi;
    }
    public Kubus(int sisi){
        this.sisi = sisi;
    }
    public int vlm(int sisi){
        return sisi*sisi*sisi;
    }
    public int luas(int sisi){
        return 6 * (sisi * sisi);
    }
    //overloading method untuk menghitung volume kubus
    @Override
    public double Volume() {
        return sisi * sisi * sisi;
    }
    
    // Override method untuk menghitung luas permukaan kubus
    @Override
    public double LuasPermukaan() {
        return 6 * (sisi * sisi);
    }
    
}