import java.util.Scanner;

public class KafeEnak17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahPesanan,total = 0;
        String makananAtauMinuman [] = {"Nasi goreng","Bakso","Teh es","Sate","Wedang jahe"};
        int harga [] = {10000,15000,3000,12000,4000};
        String yangMauDibeli;
        
        System.out.print("Mau pesan berapa menu kak? : ");
        jumlahPesanan = sc.nextInt();
        sc.nextLine();
        System.out.print("Pesen apa aja kak? : ");
        yangMauDibeli = sc.nextLine().trim();
        for (int j = 0; j < makananAtauMinuman.length;j++){
            if (yangMauDibeli.equalsIgnoreCase(makananAtauMinuman [j])) {
                System.out.println("Harga : " + harga [j]);
                total += harga [j];
            }
        }
        for (int i = 1 ; i < jumlahPesanan;i++){
            System.out.print("Ada lagi kak? : ");
            yangMauDibeli = sc.nextLine();
            for (int j = 0; j < makananAtauMinuman.length;j++ ){
                if (yangMauDibeli.equalsIgnoreCase(makananAtauMinuman [j])) { 
                System.out.println("Harga : "+harga [j]);
                total += harga [j];
                }
            }
        }
        System.out.println("Baik,totalnya segini ya kak : "+ total);
        sc.close();
       
    }
}
