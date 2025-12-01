import java.util.Scanner;

public class Kubus17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
        System.out.println("Selamat datang di fungsi menghitung kubus");
        System.out.print("Silahkan masukkan apa yang ingin dihitung : ");
        String aksi = sc.nextLine();

            if (aksi.equalsIgnoreCase("Volume")) {
                System.out.println("Selamat datang di fungsi hitung volume kubus");
                System.out.print("Silahkan masukkan panjang sisi : ");
                int sisi = sc.nextInt();
                int hasilVolume = sisi * sisi * sisi;
                System.out.println("Hasilnya adalah "+ hasilVolume);
                sc.nextLine();
            }else if (aksi.equalsIgnoreCase("Luar Permukaan")) {
                System.out.println("Selamat datang di fungsi hitung luar permukaan kubus");
                System.out.print("Silahkan masukkan panjang sisi : ");
                int sisi = sc.nextInt();
                int hasilLuarPermukaan = 6 * (sisi * sisi);
                System.out.println("Hasilnya adalah "+hasilLuarPermukaan);
                sc.nextLine();
            }else{
                System.out.println("Input invalid,kembali masukkan input yang bener!");
            }
        }
    }
}
