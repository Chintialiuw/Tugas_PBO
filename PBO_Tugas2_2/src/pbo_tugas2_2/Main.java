/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo_tugas2_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author DYNABOOK - Chintia Liu Wintin 2109106008
 */
public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        System.out.println("=================================================================");
        System.out.println("                             Nomor 2                             ");
        System.out.println("=================================================================");
        System.out.println("         Sistem Penilaian Akhir Program Studi Informatika        ");
        System.out.println("=================================================================");
        
        String mataKuliah, grade = null;
        int jumlahHadir, nilaiKehadiran = 0, nilaiUTS, nilaiUAS, UTS, UAS, nilaiAkhir;

        System.out.print("Nama Mata Kuliah      : ");
        mataKuliah = br.readLine();
        System.out.print("Jumlah Kehadiran      : ");
        jumlahHadir = Integer.parseInt(br.readLine());
        System.out.print("Nilai UTS             : ");
        nilaiUTS = Integer.parseInt(br.readLine());
        System.out.print("Nilai UAS             : ");
        nilaiUAS = Integer.parseInt(br.readLine());
        
        if(jumlahHadir < 3 && jumlahHadir >= 0){
            nilaiKehadiran = 0 * 20 / 100;
        }
        else if(jumlahHadir >= 3 && jumlahHadir <= 4){
            nilaiKehadiran = 60 * 20 / 100;
        }
        else if(jumlahHadir >= 5 && jumlahHadir <= 6){
            nilaiKehadiran = 80 * 20 / 100;
        }
        else if(jumlahHadir >= 7 && jumlahHadir <=8){
            nilaiKehadiran = 100 * 20 / 100;
        }
        else{
            System.err.println("\nJumlah Kehadiran Tidak Valid !");
            System.out.println("\n-----------------------------------------------------------------");
            System.exit(0);
        }
        
        UTS = nilaiUTS * 30 / 100;
        UAS = nilaiUAS * 50 / 100;
        
        nilaiAkhir = nilaiKehadiran + UTS + UAS;
        
        if(nilaiAkhir >= 85 && nilaiAkhir <= 100){
            grade = "A";
        }
        else if(nilaiAkhir >= 70 && nilaiAkhir <=84){
            grade = "B";
        }
        else if(nilaiAkhir >= 60 && nilaiAkhir <= 69){
            grade = "C";
        }
        else if(nilaiAkhir >= 50 && nilaiAkhir <= 59){
            grade = "D";
        }
        else if(nilaiAkhir < 50){
            grade = "E";
        }
        
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Penilaian Akhir dari mata kuliah " + mataKuliah);
        System.out.println("Nilai Kehadiran       : " + nilaiKehadiran);
        System.out.println("Nilai UTS             : " + UTS);
        System.out.println("Nilai UAS             : " + UAS);
        System.out.println("Nilai Akhir           : " + nilaiAkhir);
        System.out.println("Grade                 : " + grade);
        System.out.println("-----------------------------------------------------------------");
    }
}