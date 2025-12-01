import java.util.Scanner;

public class RekapPenjualanKafe17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Selamat datang di program RekapPenjualanKafe17 ");

        System.out.print("Silahkan tentukan banyak menu : ");
        int n = sc.nextInt();

        System.out.print("Silahkan tentukan jumlah hari rekapan : ");
        int m = sc.nextInt();

        String [] makanan = new String[n];
        int [][] hasilPenjualan = new int[n][m];

        inputData(makanan, hasilPenjualan, n, m);

        tampilData(makanan, hasilPenjualan, n, m);

        menuTerlaris(makanan, hasilPenjualan, n, m);

        penjualanRataRata(makanan, hasilPenjualan, 0, n, m);
    }

    static void inputData(String [] makanan,int [][] hasilPenjualan,int n,int m){
        Scanner sc = new Scanner(System.in);

        System.out.println("Selamat datang di fungsi input data");
        for (int i = 0;i < n;i++){
            System.out.print("Masukkan nama makanan ke-"+(i+1)+" :");
            makanan [i] = sc.nextLine();
            for (int j = 0;j < m;j++){
                System.out.print("Masukkan hasil penjualan hari ke-"+(j+1)+" :");
                hasilPenjualan[i][j] = sc.nextInt();
                sc.nextLine();
            }
        }
    }
    static void tampilData (String [] makanan,int [][] hasilPenjualan,int n,int m){
        for (int i = 0;i < n;i++){
            System.out.print("Nama makanan : "+makanan [i]+"\t | Hasil penjualan :");
            for (int j = 0;j < m ;j++){
                System.out.print(" "+hasilPenjualan [i][j]+"\t| ");
            
            }
            System.out.println();
        }
    }
    static void menuTerlaris (String [] makanan,int [][] hasilPenjualan,int n,int m){
        int totalTerlaris = 0;
        int indexMakanan = -1;

        for (int i = 0;i < n;i++){
            int total = 0;
            for (int j = 0;j < m;j++){
                total +=hasilPenjualan[i][j];
            }
            if (total > totalTerlaris) {
                totalTerlaris = total;
                indexMakanan = i;
            }
        }
        System.out.println("Ini adalah menu terlaris selama "+m +" hari");
        System.out.println("Nama menu : "+makanan[indexMakanan]);
        System.out.println("Total penjualan : "+ totalTerlaris);

    }
    static void penjualanRataRata (String [] makanan,int [][] hasilPenjualan,int total,int n,int m){
        for (int i = 0; i < n;i++){
            for (int j = 0 ;j < m;j++){
                total += hasilPenjualan[i][j];
            }
            double rataRata = total / m;
            System.out.println("Menu "+makanan[i]+" rata rata penjualannya adalah : "+rataRata);
        }
    }
}
