public class Bioskop17 {

    public static void main(String[] args) {
        String penonton [][] =new String[4][2];
        penonton [0][0] ="Adel";
        penonton [0][1] ="Atif";
        penonton [1][0] ="Alasta";
        penonton [1][1] ="Useid";
        penonton [2][0] ="Nurus";
        penonton [2][1] ="Raden";
        penonton [3][0] ="Gw";
        penonton [3][1] ="Kaped";
        
        System.out.printf("%s \t %s \n",penonton [0][0],penonton[0][1]);
        System.out.printf("%s \t %s \n",penonton [1][0],penonton[1][1]);
        System.out.printf("%s \t %s \n",penonton [2][0],penonton[2][1]);
        System.out.printf("%s \t %s \n",penonton [3][0],penonton[3][1]);
        
        for (int i = 0;i < penonton.length ;i++){
            System.out.println("Panjang baris ke-" + (i+1) +" :" +String.join(", ", penonton[i]));
        }
        System.out.println(penonton.length);
        for (String [] barisPenonton : penonton){
            System.out.println("Panjang baris : "+barisPenonton.length);
        }
        System.out.println("Penonton pada baris ke-3 : ");
        for (int i = 0;i < penonton[2].length;i++){
            System.out.println(penonton[2][i]);
        }
        System.out.println("Penonton pada baris ke-3 : ");
         for (String i : penonton[2]){
            System.out.println((i));
        }
    }
}