package Jobsheet7;
import java.util.Scanner;
public class SiakadFor17 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double nilai,tertinggi = 100,terendah = 0;
    int mahasiswaLulus = 0,mahasiswaGaLulus = 0;
    
    for (int i = 1;i <= 10;i++){
        System.out.print("Masukkan nilai mahasiswa ke- "+ i + ": ");
        nilai = sc.nextDouble();
        if (nilai > tertinggi) {
            tertinggi = nilai;
        }
        if (nilai < terendah) {
            terendah = nilai;
        }
        if (nilai > 60) {
            mahasiswaLulus += 1;
        }else if (nilai < 60) {
            mahasiswaGaLulus +=1;
        }
    }
    System.out.println("Nilai tertinggi: "+ tertinggi);
    System.out.println("Nilai terendah: "+ terendah);
    System.out.println("Mahasiswa yang lulus sebanyak :" + mahasiswaLulus);
    System.out.println("Mahasiswa yang tidak lulus sebanyak :" + mahasiswaGaLulus);
    sc.close();
    }
}