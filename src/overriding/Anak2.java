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
public class Anak2 extends Induk{
    //deklarasi variable
    double jari;
     
    //menerapkan parameter
    public Anak2 (double jari){
        this.jari = jari;
    }
    
    //method overriding luas
    @Override
    double luas(){
         
        System.out.println("Sebuah bola memiliki jari-jari "+jari);
        System.out.println("Rumus   : 4 * Phi * r * r");
        //menghitung luas permukaan bola
        double luas = jari * jari * 4 * Math.PI;
        System.out.println("Luas Permukaan Bola = "+luas);
        return luas;
    }
    //method overriding volume
    @Override
    double volume(){
         
        System.out.println("Sebuah bola memiliki jari-jari "+jari);
        System.out.println("Rumus   : 4/3 * Phi * r * r * r");
        //menghitung volume bola
        double volume = jari * jari * jari * 4/3 * Math.PI;
        System.out.println("Volume Bola = "+volume);
        return volume;
    }
}
