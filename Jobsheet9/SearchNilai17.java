import java.util.Scanner;

public class SearchNilai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key;
        int hasil = 0;
        int mahasiswa;
        
        System.out.print("Masukkan jumlah mahasiswa yang akan diinput : ");
        mahasiswa = sc.nextInt();
        
        int nilai[] = new int[mahasiswa];
        for (int i = 0;i <mahasiswa;i++){
            System.out.print("Masukkan nilai mahasiswa : ");
            nilai[i]= sc.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari : ");
        key = sc.nextInt();

        for (int i = 0;i <nilai.length;i++){
            if (key == nilai [i]){
                hasil = i + 1;
                 System.out.println("Nilai "+key+" ketemu di mahasiswa ke-"+hasil);
                break;
            }else {
                System.out.println("Nilai yang dicari tidak ditemukan.");
                break;
            }
        }
        sc.close();
    }
}
