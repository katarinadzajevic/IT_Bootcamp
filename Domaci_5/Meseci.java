package drugoPredavanje;

import java.util.Scanner;

public class Meseci {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            System.out.println("Unesi mesec:");
            String mesec = sc.nextLine().toLowerCase();

            switch (mesec) {

                case "januar":
                case "mart":
                case "maj":
                case "jul":
                case "avgust":
                case "oktobar":
                case "decembar":
                    System.out.println("Mesec " + mesec + " ima 31 dan.");
                    break;
                case "februar":
                    System.out.println("Mesec " + mesec + " ima 28 dana");
                    break;
                case "april":
                case "jun":
                case "septembar":
                case "novembar":
                    System.out.println("Mesec " + mesec + " ima 30 dana");
                    break;
                default:
                    System.out.println("Pogresan unos");
                    break;

            }

        }


    }
}
