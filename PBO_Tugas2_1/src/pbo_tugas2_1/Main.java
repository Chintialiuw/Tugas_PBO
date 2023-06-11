/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo_tugas2_1;

/**
 *
 * @author DYNABOOK - Chintia Liu Wintin 2109106008
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("=================================================================");
        System.out.println("                             Nomor 1                             ");
        System.out.println("=================================================================");
        
        String[] kata = {"JavaScript", "adalah", "bahasa", "pemrograman", "tingkat", "tinggi", "dan", "dinamis"};
        
        System.out.println("Soal");
        for (String word : kata) {
            System.out.print(word + " ");
        }
        
        System.out.println("\n-----------------------------------------------------------------");
        System.out.println("Ketentuan 1");
        System.out.println(kata[0] + " " + kata[1] + " " + kata[2] + " " + kata[3]);
        
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Ketentuan 2");
        System.out.println(kata[0].toLowerCase() + " " + kata[1] + " " + kata[2] + " " + kata[3]);
        
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Ketentuan 3");
        System.out.println(kata[0].toUpperCase() + " " + kata[1].toUpperCase() + " " + kata[2].toUpperCase() + " " + kata[3].toUpperCase());
        
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Ketentuan 4");
        System.out.println(kata[3]);
        
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Ketentuan 5");
        System.out.println(kata[4] + " " + kata[5] + " " + kata[6] + " " + kata[7]);
        
        System.out.println("-----------------------------------------------------------------");
    }
    
}
