 import java.util.Scanner;

public class CafeSenja17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cabang,itemDibeli = 0,pelanggan ,itemTerjual = 0,totalPelanggan = 0,finalTotalPelanggan =0,finalTotalItem = 0;

        System.out.print("Jumlah cabang kafe : ");
        cabang =sc.nextInt();
        System.out.println("=---= Input jualan per cabang =---=");
        for (int i = 1;i<=cabang;i++){
            System.out.println("---- Cabang "+i+" ----");
            System.out.print("Jumlah pelanggan : ");
            pelanggan =sc.nextInt();
            totalPelanggan += pelanggan;
            finalTotalPelanggan +=totalPelanggan;

            for (int j = 1;j <= pelanggan;j++){;
            System.out.print("- Pelanggan "+j+" memesan berapa item? ");
            itemDibeli = sc.nextInt();
            itemTerjual += itemDibeli;
        }
        System.out.println("Cabang "+i+":");
        System.out.println("- Pelanggan : "+totalPelanggan);
        System.out.println("- Item terjual :"+itemTerjual);
        finalTotalItem += itemTerjual;
            totalPelanggan =0;
            itemTerjual = 0;
        }
        System.out.println("Total seluruh Cabang :");
        System.out.println("Pelanggan : "+ finalTotalPelanggan );
        System.out.println("Item terjual : "+finalTotalItem);
        sc.close();
    }
}
 
    

