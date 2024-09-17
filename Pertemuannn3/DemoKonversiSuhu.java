/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuannn3;

/**
 *
 * @author UseR
 */
public class DemoKonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KonversiSuhu pertama = new KonversiSuhu();
        KonversiSuhu2 kedua = new KonversiSuhu2();
        
         double celcius = 25;
        System.out.println("Konversi Celcius ke Fahrenheit: " + pertama.celciusToFahrenheit(celcius));
        System.out.println("Konversi Celcius ke Reamur: " + kedua.celciusToReamur(celcius));

        // Menguji konversi Fahrenheit ke Reamur
        double fahrenheit = 77;
        System.out.println("Konversi Fahrenheit ke Reamur: " + kedua.fahrenheitToReamur(fahrenheit));
    }
    
}
