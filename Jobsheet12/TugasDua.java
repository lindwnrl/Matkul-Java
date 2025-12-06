import java.util.Scanner;

public class TugasDua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan berapa nilai n : ");
        int n =sc.nextInt();
        for (int i = 1;i < n;i++){
            System.out.print(i+" + ");
            if (i == (n-1)) {
                System.out.print(n+" = ");
            }
        }
        System.out.println(iniProgramJuga(n));
    }
    static int iniProgramJuga (int n){
        if (n == 0) {
            return (0);
        }else{
            return (n + iniProgramJuga(n - 1));
        }
    }
}
