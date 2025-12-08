import java.util.Scanner;

public class Cm2_LindhuNurilRahmatdanto {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        
        int n = 2;
        int m = 2;
        String [] jnsPrestasi =new String[n];
        String [][] tngktPrestasi =new String[n][m];
        int tingkat [] = {0,0,0};
    
        while (true) {
        System.out.println("=== Pencatatan Data Prestasi Mahasiswa ===");
        System.out.println("1. Tambah Data Prestasi");
        System.out.println("2. Tampilkan Semua Prestasi");
        System.out.println("3. Cari Prestasi Berdasarkan Jenis");
        System.out.println("4. Hitung Jumlah Prestasi Per Tingkat");
        System.out.println("5. Keluar ");
        System.out.print("Pilih menu : ");
        String aksi =sc.nextLine();
        if (aksi.equals("1")) {
            tambahData(jnsPrestasi, tngktPrestasi, tingkat);
            
        }else if (aksi.equals("2")) {
            tampilData(jnsPrestasi, tngktPrestasi);
            
        }else if (aksi.equals("3")) {
            cariPrestasi(jnsPrestasi, tngktPrestasi);
        }else if (aksi.equals("4")) {
            jmlhPrestasi(tingkat);
        }else if (aksi.equals("5")) {
            System.out.println("=== Thank You ===");
            break;
        }
        }
    }
    static void tambahData (String jnsPrestasi [],String [][] tngktPrestasi,int tingkat []){
        Scanner sc =new Scanner(System.in);
        System.out.println("=== Sistem Tambah Data ===");
        while (true) {
        System.out.print("Masukkan nama mahasiswa : ");
        String namaMahasiswa =sc.nextLine();
        System.out.print("Masukkan NIM Mahasiswa : ");
        String nimMahasiswa =sc.nextLine();
        for (int i =0;i < jnsPrestasi.length;i++){
            System.out.print("Masukkan jenis prestasi : ");
            jnsPrestasi [i] =sc.nextLine();
            for (int j =0;j < tngktPrestasi[i].length;j++){
            System.out.print("Masukkan tingkat prestasi : ");
            String pilihan=sc.nextLine();
            tngktPrestasi [i][j] =pilihan;
            
        
            if (pilihan.equalsIgnoreCase("Internasional")) {
                tingkat [0]++;
                break;
            }else if (pilihan.equalsIgnoreCase("Nasional")) {
                tingkat [1]++;
                break;
            }else if (pilihan.equalsIgnoreCase("Lokal")) {
                tingkat [2]++;
                break;
            }else{
            System.out.println("Harap masukin yang bener ");
        }
                
    }
}


while (true) {
    System.out.print("Masukkan Tahun Prestasi (2015 - 2025) : ");
    int tahunPrestasi =sc.nextInt();
    if (tahunPrestasi > 2015 && tahunPrestasi < 2025) {
        System.out.println("Data berhasil ditambahkan");
        break;
    }else{
        System.out.println("Harap masukin yang bener");
    }
}


return;
}
    }


    static void tampilData (String jnsPrestasi [],String [][] tngktPrestasi){
        System.out.println("=== Sistem Tampil Data ===");
        boolean kosong = true;
    for (int i = 0; i < jnsPrestasi.length; i++) {
        if (jnsPrestasi[i] != null) {
            kosong = false;
            break;
        }
    }
     if (kosong) {
        System.out.println("Belum ada data prestasi");
        return;
    }
       for (int i = 0; i < jnsPrestasi.length; i++) {

        if (jnsPrestasi[i] == null) {
            continue;
        }

        System.out.println("Jenis Prestasi: " + jnsPrestasi[i]);

        for (int j = 0; j < tngktPrestasi[i].length; j++) {
            if (tngktPrestasi[i][j] != null) {
                System.out.println("Tingkat: " + tngktPrestasi[i][j]);
            }
        }
     System.out.println();
    }
    }
    static void cariPrestasi (String jnsPrestasi [],String [][] tngktPrestasi){
        System.out.println("=== Sistem Cari Data ===");
        Scanner sc =new Scanner(System.in);
        System.out.print("Silahkan prestasi apa yang ingin anda cari : ");
        String prestasi =sc.nextLine();
        boolean ketemu =false;
        for (int i = 0;i < jnsPrestasi.length;i++){
            for (int j = 0;j < tngktPrestasi[i].length;j++){
            if (prestasi.equals(jnsPrestasi[i])) {
                System.out.println("Prestasi ini : |"+jnsPrestasi[i]+ "| ada dan ada di tingkat " + tngktPrestasi[i][j]);
                ketemu = true;
                break;
            }
            
        }
    }
    if (!ketemu) {
        System.out.println("Prestasi tidak ditemukan ");
        }
    }
    static void jmlhPrestasi (int []tingkat){
        System.out.println("=== Sistem Jumlah Prestasi ===");
        System.out.println("Internasional : "+tingkat [0]);
        System.out.println("Nasional : "+tingkat [1]);
        System.out.println("Lokal : "+tingkat [2]);
    }
}
    




