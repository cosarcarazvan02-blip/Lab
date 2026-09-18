import java.util.Scanner;
import java.util.Random;

class Main{
    public static void main(String args[]){
        Random r = new Random();
        int r1 = r.nextInt(100);

        Scanner scn = new Scanner(System.in);
        int vieti = 5;

        while(vieti > 0) {
            System.out.println("Introduceti un numar:");
            int x = scn.nextInt();

            if (x == r1) {
                System.out.println("Ai ghicit!");
                break;
            } else if (x < r1) {
                System.out.println("Prea mic!");
            } else {
                System.out.println("Prea mare!");
            }

            vieti = vieti - 1;

            if (vieti == 0) {
                System.out.println("Ai ramas fara incercari! Numarul era: " + r1);
            }
        }
    }
}
