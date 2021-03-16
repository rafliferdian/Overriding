/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriding;

/**
 *
 * @author WINDOWS 10
 */
public class Anak1 extends Induk{
    //deklarasi variable
    double sisi;
    
    //menerapkan parameter
    public Anak1(double sisi){
        this.sisi = sisi;
    }
    
    //method overriding luas
    @Override
    double luas(){
          
        System.out.println("Sebuah kubus memiliki sisi "+sisi);
        System.out.println("Rumus   : 6 * sisi * sisi");
        //menghitung luas permukaan kubus
        double luas = 6 * sisi * sisi;
        System.out.println("Luas Permukaan Kubus = "+luas);
        return luas;
    }
    //method overriding volume
    @Override
    double volume(){
           
        System.out.println("Sebuah kubus memiliki sisi "+sisi);
        System.out.println("Rumus   : sisi * sisi * sisi");
        //menghitung volume kubus
        double volume = sisi * sisi * sisi;
        System.out.println("Volume Kubus = "+volume);
        return volume;
    }
}
