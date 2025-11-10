import java.util.Scanner;

public class NgitungNilai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mahasiswa,total = 0,tertinggi = 0,terendah = 100,i = 0;
        double rataRata = 0;

        
        System.out.print("Masukkan berapa jumlah mahasiswa yang akan diinput : ");
        mahasiswa = sc.nextInt();
        int nilai [] = new int[mahasiswa];
        
        for ( i = 0;i < nilai.length;i++){
            System.out.print("Masukkan nilai mahasiswa : ");
            nilai [i] = sc.nextInt();
        }
        for ( i = 0;i < nilai.length;i++ ){
            System.out.println("Nilai akhir mahasiswa ke-"+(i + 1)+" adalah : "+nilai [i]);
            
            if (nilai [i] > tertinggi) {
                tertinggi = nilai [i];
            }else if (nilai [i] < terendah) {
                terendah = nilai [i];
            }
        }
        for (i = 0 ;i < nilai.length;i++){
        total += nilai [i];
        }
        rataRata += (total / mahasiswa);
        System.out.println("Rata rata mahasiswa yang telah diinput adalah : " + rataRata);
        System.out.println("Nilai tertinggi mahasiswa adalah : " + tertinggi);
        System.out.println("Nilai terendah mahasiswa adalah : " + terendah);
    
        
    }
}
