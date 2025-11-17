import java.util.Scanner;

public class ArrayRataNilai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0,rataRata,rataRataLulus,rataRataGaLulus,totalLulus = 0,totalGaLulus = 0;
        int mahasiswaLulus = 0,mahasiswaGaLulus = 0,n;
        System.out.println("Masukkan jumlah mahasiswa");
        n = sc.nextInt();
        int nilaiMahasiswa [] =new int[n];
        
        for (int i = 0;i < nilaiMahasiswa.length;i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" :");
            nilaiMahasiswa [i] =sc.nextInt();
        }
        for (int i = 0;i <nilaiMahasiswa.length;i++){
            if (nilaiMahasiswa [i] > 70) {
                System.out.println("Mahasiswa ke- "+(i+1)+" lulus!");
                mahasiswaLulus +=1;
                totalLulus += nilaiMahasiswa [i];
            }else{
                System.out.println("Mahasiswa ke- "+(i+1)+" tidak lulus!");
                mahasiswaGaLulus +=1;
                totalGaLulus += nilaiMahasiswa [i];
            }
        }
        for (int i = 0;i < nilaiMahasiswa.length;i++){
            total += nilaiMahasiswa[i];
        }
        rataRataLulus = totalLulus /mahasiswaLulus;
        rataRataGaLulus = totalGaLulus /mahasiswaGaLulus;
        rataRata = total /nilaiMahasiswa.length;
        System.out.println("Rata rata nilai = "+rataRata);
        System.out.println("Jumlah mahasiswa yang lulus adalah : "+mahasiswaLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus adalah : "+mahasiswaGaLulus);
        System.out.println("Rata rata nilai mahasiswa yang lulus adalah : "+rataRataLulus);
        System.out.println("Rata rata nilai mahasiswa yang tidak lulus adalah : "+rataRataGaLulus);
        sc.close();
    }
}
