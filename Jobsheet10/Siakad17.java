import java.util.Scanner;

public class Siakad17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahMahasiswa;
        int jumlahMatkul;

        System.out.print("Masukkan jumlah mata kuliah: ");
        jumlahMatkul =sc.nextInt();
        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa =sc.nextInt();

        int nilai [][] = new int[jumlahMahasiswa][jumlahMatkul];

        for (int i = 0;i < jumlahMahasiswa;i++){
            System.out.println("Masukkan nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;
            for (int j = 0;j < jumlahMatkul;j++){
                System.out.print("Nilai mata kuliah "+ (j+1)+" :");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai [i][j];
            }
            System.out.println("Inilah rata-rata nilai mahasiswa ke-"+(i + 1)+" :"+ totalPerSiswa/3);
        }
        System.out.println("Rata-rata nilai setiap Mata Kuliah:");
        
        for (int j = 0;j < jumlahMatkul;j++){
            double totalPerMatkul = 0;
            for (int i = 0;i < jumlahMahasiswa;i++){
                totalPerMatkul += nilai [i][j];
            }
            System.out.println("Mata kuliah "+ (j + 1) + " : "+totalPerMatkul/4);
        }
        sc.close();
    }
}
