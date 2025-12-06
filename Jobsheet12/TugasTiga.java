public class TugasTiga {
    public static void main(String[] args) {
        for (int bulan = 0 ;bulan < 12;bulan++){
            System.out.print((bulan+1)+"\t ");
        }
        System.out.println();
        System.out.print("0 \t ");
        int [] totalProduksi =new int[11];
        int [] totalBelumProduksi = new int [12];
        for (int i = 0;i <= 10;i++){
            totalProduksi [i] += sudahProduksi(i);
            System.out.print(sudahProduksi(i)+"\t ");
        }
        System.out.println();
        for (int j = 0;j <= 11 ;j++){
            totalBelumProduksi [j] += belumProduksi(j);
            System.out.print(belumProduksi(j)+"\t ");

        }
        System.out.println();
        int hasilSmua = 0;
        for (int hasil = 0;hasil < 11;hasil++){
            hasilSmua = totalProduksi[hasil]+totalBelumProduksi[hasil];
            System.out.print(hasilSmua+"\t ");
        }
        //Mohon maaf ibu Vivi saya kesulitan di bagian menentukan total dari produksi dan belumproduksi perbulannya
        //mohon arahan dan bimbingannya untuk kedepannya
    }
    static int sudahProduksi (int n){
        if (n <= 1) return n;
        return sudahProduksi(n - 1)+sudahProduksi(n - 2);
       
    }
    static int belumProduksi (int m){
        if (m <= 1) return m;
        return belumProduksi(m - 1)+belumProduksi(m - 2);
    }
}
