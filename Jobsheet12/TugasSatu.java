import java.util.Scanner;

public class TugasSatu {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Masukkan nilai untuk n :");
        int n = sc.nextInt();
        iniProgram(n);
        System.out.print("Masukkan nilai untuk m : ");
        int m =sc.nextInt();
        iniProgramJuga(m);
        
    }
    static int iniProgram (int n){
        if (n == 0) {
            System.out.println("0");
            return (1);
        }else{
            System.out.print(n+" ");
            return (n * iniProgram(n - 1));
        }
    }
    static int iniProgramJuga (int m){
        int ini = 1;
        for (int i = m;i >= 1;i--){
            ini = ini *i;
            System.out.print(i+" ");
        }
        System.out.println(0);
        return(m);
    }

}