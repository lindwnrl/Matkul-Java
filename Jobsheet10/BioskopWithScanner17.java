import java.util.Scanner;

public class BioskopWithScanner17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama,next;
        int baris,kolom;
        String penonton [][] = new String[4][2];
        int pilihanMenu;

        while (true) {
        System.out.println("\n+======+ Selamat datang di bioskop +======+");
        System.out.println("- Menu 1 : Input data penonton ");
        System.out.println("- Menu 2 : Tampilan daftar penonton");
        System.out.println("- Menu 3 : Exit");
        System.out.print("Mana yang anda pilih : ");
        pilihanMenu = sc.nextInt();
        sc.nextLine();
        if (pilihanMenu == 1) {
            while (true) {
                System.out.print("Masukkan nama : ");
                nama = sc.nextLine();
                while (true) {
                    
                    System.out.print("Masukkan baris : ");
                    baris =sc.nextInt();
                     if (baris > 4 || baris < 1) {
                    System.out.println("Maaf tuan tapi kursi untuk row itu tidak tersedia");
                    }else if (baris < 4 || baris > 1) {
                        break;
                    }
                }
                    
                
                while (true) {
                    
                    System.out.print("Masukkan kolom : ");
                    kolom = sc.nextInt();
                    if (kolom > 2 || kolom < 1) {
                        System.out.println("Maaf tuan tapi kursi untuk row itu tidak tersedia");
                    }else if (kolom < 2 || kolom > 1) {
                        break;
                    }
                }
                        
                if (penonton [baris - 1] [kolom - 1] != null) {
                    System.out.println("Maaf tuan tapi kursi yang tuan maksud telah di penuh");
                    System.out.println("Silahkan cari kursi lagi");
                    sc.nextLine();
                    continue;
                }
                
                sc.nextLine();
                System.out.println("Apa ada lagi kak? : (y/n)");
                next = sc.nextLine();
                
    
                penonton [baris - 1][kolom - 1] = nama;
                if (next.equalsIgnoreCase("n")) {
                    break;
                }
                break;
            }
            }else if (pilihanMenu == 2) {
                System.out.println("Berikut adalah data penonton yang ada : ");
                for (int i = 0;i < 4;i++){
                    for (int j = 0;j < 2;j++){
                        if (penonton [i][j] == null) {
                            System.out.print(" *** ");
                        }else {
                            System.out.print("[" + penonton [i][j] + "] ");
                        }
                    }
                    System.out.println();
                }
                
            }else if (pilihanMenu == 3) {
                System.out.println("Baik,terima kasih telah berkunjung");
                break;
            }else {
                System.out.println("Menu invalid");
            }
            
        

        }
    }
}
