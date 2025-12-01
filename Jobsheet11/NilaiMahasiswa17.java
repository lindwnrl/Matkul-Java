import java.util.Scanner;

public class NilaiMahasiswa17 {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        int n = sc.nextInt();

        int [] nilaiMahasiswa = new int[n];

        isianArray(nilaiMahasiswa, n);

        tampilArray(nilaiMahasiswa, n);

        hitungTotal(nilaiMahasiswa);
        
        int hasilTotal = hitungTotal(nilaiMahasiswa);
     System.out.println("Ini adalah hasil total nilai mahasiswa : "+ hasilTotal);
       
    }
    public static void isianArray (int [] nilaiMahasiswa, int n){
        Scanner sc =new Scanner(System.in);
        for (int i = 0 ; i < nilaiMahasiswa.length ;i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" :");
            nilaiMahasiswa [i] = sc.nextInt();
            sc.nextLine();
        }
        System.out.println();
    }
    public static void tampilArray (int [] nilaiMahasiswa,int n){
        System.out.println("Ini adalah tampilan semua nilai yang telah diinput");
        for (int i = 0 ; i < n;i++ ){
            System.out.println("Ini adalah nilai mahasiswa ke-"+(i+1)+ ": "+ nilaiMahasiswa[i]);
        }
        System.out.println();
    }
    public static int hitungTotal (int [] nilaiMahasiswa){
        int hasilTotal = 0;
        for (int i = 0; i < nilaiMahasiswa.length;i++){
            hasilTotal += nilaiMahasiswa[i];
        }
       
        return hasilTotal;
    }
}
