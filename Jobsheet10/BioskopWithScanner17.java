import java.util.Scanner;

import javax.print.DocFlavor.STRING;
import javax.swing.plaf.synth.SynthIcon;

public class BioskopWithScanner17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama,next;
        int baris,kolom;
        String penonton [][] = new String[4][2];

        while (true) {
            System.out.print("Masukkan nama : ");
            nama = sc.nextLine();
            System.out.print("Masukkan baris : ");
            baris =sc.nextInt();
            System.out.print("Masukkan kolom : ");
            kolom = sc.nextInt();
            sc.nextLine();
            System.out.println("Apa ada lagi kak? : (y/n)");
            next = sc.nextLine();

            penonton [baris - 1][kolom - 1] = nama;
            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
        // System.out.println("Berikut adalah data penonton yang ada : ");
        // for (int i = 0 i <)
    }
}
