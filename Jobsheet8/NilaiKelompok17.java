import java.util.Scanner;

public class NilaiKelompok17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai;
        float totalNilai = 0,rataNilai = 0;
        int i = 1;
        while (i <= 6) {
            System.out.println("Kelompok ke "+ i);

            for (int j = 1;j <= 5;j++){
                System.out.print("Nilai dari Kelompok Penilai ke "+ j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }
            rataNilai += totalNilai / 5;
            System.out.println("Kelompok ke "+i+": nilai rata-rata = "+rataNilai);
            i++;
        }
        sc.close();
    }
}
