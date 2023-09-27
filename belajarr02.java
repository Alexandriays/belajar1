package belajarpercabangan1nestedif;

import java.util.Scanner;
public class BelajarPercabangan1nestedif {

    public static void main(String[] args) {
       // deklarasi variabel dan scanner
       Scanner scan = new Scanner (System.in);
       String nama, kartu;
       int belanjaan, diskon, bayar;
       
       //input
       System.out.print("Nama pengguna : ");
       nama = scan.nextLine();
       System.out.print("Apakah memiliki kartu member : ");
       kartu = scan.nextLine();
       System.out.print("Total belanjaan : ");
       belanjaan = scan.nextInt();
       
       //proses
       if (kartu.equalsIgnoreCase("ya")){
           if (belanjaan > 500000){
               diskon = 50000;
           } else if (belanjaan > 100000){
               diskon = 15000;
           } else { 
               diskon = 0;
           }
           
       } else {
           if (belanjaan > 100000) {
               diskon = 5000; 
           } else {
               diskon = 0;
           }
       }
       // total pembayaran
       bayar = belanjaan - diskon;
       System.out.println("Total pembayaran : Rp " + bayar);
       
       //penutup
       System.out.println("Terima kasih telah berbelanja.");
    }
    
}
