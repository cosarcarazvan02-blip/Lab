import java.util.Scanner;
import java.lang.Math.*;

class Main{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Introduceti un numar de la tastatura:");
        double x = scn.nextDouble();

        double a = Math.toRadians(x);
        System.out.println(Math.sin(a));

        double b = Math.toRadians(x);
        System.out.println(Math.cos(b));

        System.out.println(Math.sqrt(x));




    }

}
