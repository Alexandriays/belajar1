package belajarpercabangan1ifelseif;

import java.util.Scanner;
public class BelajarPercabangan1ifelseif {

    public static void main(String[] args) {
        // deklarasi variable dan scanner
        Scanner scan = new Scanner (System.in);
        String nama, grade;
        int nilai;
        
        // awalan
        System.out.println("Pernyataan di bawah ini merupakan hasil mutlak.");
        
        // input
        System.out.print("Nama : ");
        nama = scan.nextLine();
        System.out.print("Nilai : ");
        nilai = scan.nextInt();
        
        // grade
        if (nilai >= 90 ){ 
            grade = "A";
        } else if (nilai >= 80) {
            grade = "B+";
        } else if (nilai >= 70) {
            grade = "B";
        } else if (nilai >= 60) {
            grade = "C";
        } else if (nilai >= 50) {
            grade = "D";
        } else { 
            grade = "E";
        }
        
        // hasil nilai
        System.out.println("Grade : " + grade);
        
        //penutup
        System.out.println("Terima kasih " + nama + " telah mengikuti ujian ini.");           
    }
    
}
