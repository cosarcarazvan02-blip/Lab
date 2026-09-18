import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        while (true) {
            System.out.println("Introduceti un cnp de 6 cifre :");
            int x = scn.nextInt();

            int anul = x / 10000;
            int luna = (x / 100) % 100;
            int ziua = x % 100;

            if (luna >= 1 && luna <= 12 && ziua >= 1 && ziua <= 31) {
                System.out.println("Data nasterii este: " + anul + "." + luna + "." + ziua);
                break;
            } else {
                System.out.println("Date invalida! Verifica luna, anul si ziua. Incearca din nou!\n");
            }
        }
    }
}

