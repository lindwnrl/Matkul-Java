

import java.util.Scanner;

public class Kafe17 {
    public static void Menu (String namaPelanggan,boolean isMember,String kodePromo){
        
        System.out.println("Selamat datang "+ namaPelanggan + " !");
        if (isMember) {
            System.out.println("Anda adalah member,dapatkan diskon 10% untuk setiap pembelian!");
        }
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Selamat anda mendapatkan diskon sebesar 50%");
        }else if (kodePromo.equals("DISKON30")) {
            System.out.println("Selamat anda mendapatkan diskon sebesar 30%");
        }else {
            System.out.println("Kode promo invalid");
        }
        System.out.println("=== Menu Resto Kafe ===");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("========================");
        
    }
    public static int hitungTotalHarga17(int pilihanMenu,int banyakItem,String kodePromo){
        int [] hargaItems = {15000,20000,22000,12000,10000,18000};

        int hargaTotal = hargaItems [pilihanMenu - 1] *banyakItem;
        if (kodePromo.equals("DISKON50")) {
            hargaTotal -= hargaTotal * 50 /100;
        }else if (kodePromo.equals("DISKON30")) {
            hargaTotal -= hargaTotal * 30 /100;
        }
        return hargaTotal;
    }
    public static void main(String[] args) {
        Menu("Budi",true,"DISKON30");
        Scanner sc = new Scanner(System.in);
        int totalHargaFinal = 0;
        while (true) {
      
        System.out.print("Masukkan nomor menu yang ingin anda pesan :");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan :");
        int banyakItem = sc.nextInt();
        sc.nextLine();
        
        int totalHarga = hitungTotalHarga17(pilihanMenu, banyakItem,"DISKON30");
        
         totalHargaFinal += totalHarga;
         System.out.print("Apa ada yang lain : (y/n) :");
         String opsi = sc.nextLine();
         
         if (opsi.equalsIgnoreCase("n")) {
            break;
         }
        
        
    }
    System.out.println("Berikut adalah total harga yang harus anda bayar : "+totalHargaFinal);
            sc.close();
        }

        
}
    
