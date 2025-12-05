import java.util.Scanner;

public class Percobaan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bilangan yang ingin dihitung : ");
        int Bilangan =sc.nextInt();
        System.out.print("Berapa pangkatnya : ");
        int pangkatnya =sc.nextInt();
        System.out.println(hitungPangkat(Bilangan, pangkatnya));
    }
    static int hitungPangkat(int x,int y){
        int hasil = 0;
        if (y == 0) {  
            System.out.print("1 = "); 
            return (1);
        }else  {
            System.out.print(x +" X ");
            return (x * hitungPangkat(x, y - 1));
        }
    }
}
