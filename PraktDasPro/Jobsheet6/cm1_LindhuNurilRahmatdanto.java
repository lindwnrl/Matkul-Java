import java.util.Scanner;

public class cm1_LindhuNurilRahmatdanto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama;
        String nim;
        int nilaiUts1;
        int nilaiUts2;
        int nilaiUas1;
        int nilaiUas2;
        int nilaiTugas1;
        int nilaiTugas2;
        String nilaiHuruf1="";
        String nilaiHuruf2="";
        String status1;
        String status2;
        String statusSemester;
        double rataRata = 0;
        System.out.println("==== Input data mahasiswa ====");
        System.out.print("Nama: ");
        nama = sc.nextLine();
        System.out.print("NIM: ");
        nim = sc.nextLine();
        System.out.println();
        System.out.println("---- Mata kuliah 1: Algoritma dan Pemrograman ----");
        System.out.print("Nilai Uts :");
        nilaiUts1 = sc.nextInt();
        System.out.print("Nilai Uas :");
        nilaiUas1 =sc.nextInt();
        System.out.print("Nilai Tugas :");
        nilaiTugas1 =sc.nextInt();
        System.out.println();
        System.out.println("---- Mata Kuliah 2: Struktur data ----");
        System.out.print("Nilai Uts : ");
        nilaiUts2 =sc.nextInt();
        System.out.print("Nilai Uas :");
        nilaiUas2 =sc.nextInt();
        System.out.print("Nilai Tugas :");
        nilaiTugas2 =sc.nextInt();
        System.out.println();
        
        double nilaiAkhir1 = (nilaiUts1 * 0.3) + (nilaiUas1 * 0.4) + (nilaiTugas1 * 0.3);
        double nilaiAkhir2 = (nilaiUts2 * 0.3) + (nilaiUas2 * 0.4) + (nilaiTugas2 * 0.3);
        if ( nilaiAkhir1 > 80 && nilaiAkhir1 <= 100 ) {
            nilaiHuruf1 = "A";
        }else if (nilaiAkhir1 > 73 && nilaiAkhir1 <= 80) {
            nilaiHuruf1 ="B+";
        }else if (nilaiAkhir1 > 65 && nilaiAkhir1 <= 73) {
            nilaiHuruf1 ="B";
        }else if (nilaiAkhir1 > 60 && nilaiAkhir1 <= 65) {
            nilaiHuruf1 ="C+";
        }else if (nilaiAkhir1 > 50 && nilaiAkhir1 <= 60) {
            nilaiHuruf1 ="C";
        }else if (nilaiAkhir1 > 39 && nilaiAkhir1 <= 50) {
            nilaiHuruf1 ="D";
        }
        else if (nilaiAkhir1 <= 39){
            nilaiHuruf1 ="E";
        }
        if ( nilaiAkhir2 > 80 && nilaiAkhir2 <= 100 ) {
            nilaiHuruf2= "A";
        }else if (nilaiAkhir2 > 73 && nilaiAkhir2 <= 80) {
            nilaiHuruf2 ="B+";
        }else if (nilaiAkhir2 > 65 && nilaiAkhir2 <= 73) {
            nilaiHuruf2 ="B";
        }else if (nilaiAkhir2 > 60 && nilaiAkhir2 <= 65) {
            nilaiHuruf2="C+";
        }else if (nilaiAkhir2 > 50 && nilaiAkhir2 <= 60) {
            nilaiHuruf2 ="C";
        }else if (nilaiAkhir2 > 39 && nilaiAkhir2 <= 50) {
            nilaiHuruf2 ="D";
        }
        else if (nilaiAkhir2 <= 39){
            nilaiHuruf2 ="E";
        }

       if (nilaiAkhir1 > 60) {
             status1 = "Lulus";
       }else{
             status1 ="Tidak lulus";
       }
       if (nilaiAkhir2 > 60) {
            status2 = "Lulus";
       }else{
             status2 = "Tidak Lulus";
       }
       if (status1.equalsIgnoreCase("Lulus")&& status2.equalsIgnoreCase("Lulus")) {
            if (rataRata >= 70) {
                statusSemester = "Lulus";
            }else{
                statusSemester = "Tidak Lulus(Nilai di bawah rata rata standard)";
            }
       }else{
        statusSemester = "Tidak Lulus ";
       }
        
        System.out.println("==== Hasil Penilaian Akademik ====");
        System.out.println("Nama :" + nama);
        System.out.println("NIM :" + nim);
        System.out.println();
        System.out.println("Mata Kuliah \t\tUts\tUas\tTugas Nilai Akhir\tNilai Huruf\tStatus");
        System.out.println("Algoritma Pemrograman\t"+ nilaiUts1+"\t"+nilaiUas1+"\t"+nilaiTugas1+"\t"+nilaiAkhir1+"\t\t"+ nilaiHuruf1+"\t\t"+status1 );
        System.out.println("Struktur Data\t\t"+ nilaiUts2+"\t"+nilaiUas2+"\t"+nilaiTugas2+"\t"+nilaiAkhir2+"\t\t"+ nilaiHuruf2+"\t\t"+status2);

         rataRata = (nilaiAkhir1 + nilaiAkhir2) / 2;
         System.out.println("Rata-rata nilai akhir :" + rataRata);
         System.out.println("Status Semester :" + statusSemester);


         sc.close();
    }
}