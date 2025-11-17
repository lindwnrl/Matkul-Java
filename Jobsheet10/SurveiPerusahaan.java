import java.util.Scanner;

public class SurveiPerusahaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int surveiData[][] = new int[10][6];
        

        System.out.println("Selamat datang di Survei Perusahaan");
        for (int i = 0;i < 10 ; i++){
            System.out.println("Masukkan hasil survei orang ke-"+(i+1));
            double totalPerResponden = 0;
            for (int j = 0;j < 6;j++){
                System.out.print((j + 1)+". "+"Masukkan hasil survei (dalam skala 1 - 5) : ");
                surveiData [i][j]= sc.nextInt();
                totalPerResponden += surveiData [i][j];

            }
            System.out.println("Inilah rata rata hasil survei dari responden ke-"+(i + 1)+" : "+totalPerResponden/10);
        }
        System.out.println("Inilah rata-rata hasil dari setiap pertanyaan :");

        for (int j = 0;j < 6 ; j++){
            double totalPerPertanyaan = 0;
            for (int i = 0;i < 10;i++){
                totalPerPertanyaan += surveiData [i][j];
            }
            System.out.println("Pertanyaan "+ (j + 1) + " : "+totalPerPertanyaan/6);
        }
    

        sc.close();
    }
}
