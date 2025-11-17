import java.util.Scanner;

public class NyariMenu17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu [] ={"Sate","Opor","Mie Ayam","Nasi Goreng","Ketoprak","Nasi Uduk","Bakso","Mie Goreng",
                        "Mie Nyemek Bangladesh","Seblak","Soto","Tahu Telur","Krecek","Gulai","Ayam Geprek"};
        String inputYangMauDicari;
        String hasilMenu = "";

        System.out.print("Menu apa yang anda cari tuan : ");
        inputYangMauDicari =sc.nextLine();
        boolean ketemu =false;
        for (int i = 0;i < menu.length;i++){
            if (inputYangMauDicari.equalsIgnoreCase(menu [i])) {
                System.out.println("Menu yang anda maksud ada di urutan ke- "+(i+1));
                ketemu = true;
            }
        } 
        if (!ketemu) {
            System.out.println("Mohon maaf atas ketidaknyamanan yang ada tapi menu "+inputYangMauDicari+" tidak disediakan di warteg ini");
        }
        
            
            
        sc.close();
            
            
            
    }
}
