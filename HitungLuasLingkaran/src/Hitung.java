/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows 8.1 Pro
 */
public class Hitung {
     public static void main(String[] args) {
          char lagi = 'y';

        System.out.println("");
        System.out.println("MENGHITUNG LUAS DAN KELILING LINGKARAN");
      
        while(lagi == 'y') {
            System.out.print("\nMasukkan nilai jari-jari lingkaran : ");
               try{
                String st = aa.bacaString();
                double jari2 = Double.valueOf(st).doubleValue();
                double keliling = 2 * Math.PI * jari2;
                double luas = Math.PI * Math.pow(jari2,2);
                System.out.println("\nKeliling lingkaran = " + keliling);
                System.out.println("Luas lingkaran = " + luas + '\n');
               }catch(NumberFormatException nfe) {
                System.err.println("\nWhoopss...");
                System.err.println("Nilai jari-jari harus berupa angka ..!\n");
               }

            System.out.print("Mau coba lagi (y/t)? ");
            String str = aa.bacaString();
            lagi = str.charAt(0);
            if(lagi == 'Y') lagi = 'y';
            if(lagi == 'y') continue;
            else {
              System.out.println("Terima Kasih ..\n");
              break;
            }
          }
    }
}

