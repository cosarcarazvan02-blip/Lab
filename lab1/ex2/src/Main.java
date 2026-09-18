import java.util.Scanner;
import java.util.Random;

class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Introduceti un numar:");
        int x = scn.nextInt();

        System.out.println("Introduceti al doilea numar:");
        int y = scn.nextInt();

        int suma = x + y;
        System.out.println("Suma numerelor este:" + suma);

        int produs = x * y;
        System.out.println("Produsul numerelor este:" + produs);

        int rest = x % y;
        System.out.println("Restul numerelor este:" + rest);

        int cat = x / y;
        System.out.println("Catul numerelor este:" + cat);


        System.out.println("Introduceti un numar:");
        int nr = scn.nextInt();

        Random rnd = new Random();
        int produs2 = nr * rnd.nextInt(1000);
        System.out.println("Produsul cu un numar random este:" + produs2);

    }
}
