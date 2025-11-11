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

        System.out.printf("%s \t %s \n",penonton [0][0],penonton[0][1]);
        System.out.printf("%s \t %s \n",penonton [1][0],penonton[1][1]);
        System.out.printf("%s \t %s \n",penonton [2][0],penonton[2][1]);
        System.out.printf("%s \t %s \n",penonton [3][0],penonton[3][1]);
    }
}