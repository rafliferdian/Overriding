/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriding;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Scanner input
        Scanner input = new Scanner(System.in);
        
        // membuat objek print untuk class Induk
        Induk print = new Induk();
        
        // membuat objek dan memberi nilai sisi
        Anak1 bangun1 = new Anak1(5);
        
        // membuat objek dan memberi nilai jari-jari
        Anak2 bangun2 = new Anak2(14);
        
        System.out.println("--- KALKULATOR BANGUN RUANG SEDERHANA ---\n");
        
        //deklarasi
        int pilihan;
        
        do{ //perulangan
        System.out.print("1. Kubus \n2. Bola \nPilihan : ");
        //input pilihan user
        pilihan = input.nextInt();
        
        //Percabangan
        if (pilihan == 1){
            //deklarasi
            int lpv1;
            
            do{ //perulangan
                //pilihan perhitungan bangun ruang
                System.out.println("\nIngin menghitung apa?");
                System.out.print("1. Luas Permukaan \n2. Volume \nPilihan : ");
                //input pilihan user
                lpv1 = input.nextInt();
            
                //percabangan
                switch(lpv1){
                    //luas permukaan kubus
                    case 1:
                        //pemanggilan method luas dari class Induk
                        print.luas();
                        //pemanggilan method luas dari class Anak1
                        bangun1.luas();
                        break;
                
                    //volume kubus
                    case 2:
                        //pemanggilan method volume dari class Induk
                        print.volume();
                        //pemanggilan method volume dari class Anak1
                        bangun1.volume();
                        break;
                
                    default:
                        System.out.println("Pilihan tidak ditemukan");
                }
                
            }while(lpv1 > 2 || lpv1 == 0);  //jika tidak memilih 1 atau 2, akan terus terulang
        }
        
        else if(pilihan == 2){
            //deklarasi
            int lpv2;
            
            do{ //perulangan
                //pilihan perhitungan bangun ruang
                System.out.println("\nIngin menghitung apa?");
                System.out.print("1. Luas Permukaan \n2. Volume \nPilihan : ");
                //input pilihan user
                lpv2 = input.nextInt();
            
                //percabangan
                switch(lpv2){
                    //luas permukaan bola
                    case 1:
                        //pemanggilan method luas dari class Induk
                        print.luas();
                        //pemanggilan method luas dari class Anak2
                        bangun2.luas();
                        break;
            
                    //volume kbalok
                    case 2:
                        //pemanggilan method volume dari class Induk
                        print.volume();
                        //pemanggilan method volume dari class Anak2
                        bangun2.volume();
                        break;
                        
                    default:
                        System.out.println("Pilihan tidak ditemukan");
                }
                
            }while(lpv2 > 2 || lpv2 == 0);  //jika tidak memilih 1 atau 2, akan terus terulang
            
        }else
            System.out.println("Pilihan tidak ditemukan\n");
        
        }while(pilihan > 2 || pilihan == 0);    //jika memilih selain 1 dan 2, akan terus terulang
    }  
}
