import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        System.out.println("Introduceti un numar de 4 cifre:");
        int x = scn.nextInt();

        int ultima = x % 10;
        int trei = (x / 10) % 10;
        int doi = (x / 100) % 10;
        int prima = x / 1000;
        int suma = prima + doi + trei + ultima;

        int optiune;
        do{
            System.out.println("1.Afisare paritate ultima cifra");
            System.out.println("2.Afisare paritate prima cifra.");
            System.out.println("3.Afisare suma cifrelor");
            System.out.println("0.Iesire");

            optiune = scn.nextInt();

            switch(optiune){
                case 1:
                    if(ultima % 2 == 0){
                        System.out.println("Cifra para este:" + ultima);
                    }else{
                        System.out.println("Numarul nu este par!");
                    }
                    break;

                case 2:
                    if(prima % 2 == 0){
                        System.out.println("Cidra para este:" + prima);
                    }else{
                        System.out.println("Numarul nu este par!");
                    }
                    break;

                case 3:
                    System.out.println("Suma cifrelor este:" + suma);
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Optiune invalida!");
            }
        }while(optiune != 0);
    }
}
