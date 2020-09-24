package drugoPredavanje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MeseciListe {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        List<String> meseci = new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            System.out.println("Unesi mesec:");
            meseci.add(sc.nextLine().toLowerCase());
        }


        for (String n : meseci) {

            switch (n) {

                case "januar":
                case "mart":
                case "maj":
                case "jul":
                case "avgust":
                case "oktobar":
                case "decembar":
                    System.out.println("Mesec " + n + " ima 31 dan.");
                    break;
                case "februar":
                    System.out.println("Mesec " + n + " ima 28 dana.");
                    break;
                case "april":
                case "jun":
                case "septembar":
                case "novembar":
                    System.out.println("Mesec " + n + " ima 30 dana.");
                    break;
                default:
                    System.out.println("Pogresan unos.");
                    break;

            }

        }
    }


}

