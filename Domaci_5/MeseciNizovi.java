import java.util.Scanner;

public class MeseciNizovi {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String[] meseci = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Unesi mesec: ");
            String s = sc.nextLine().toLowerCase();
            meseci[i] = s;
        }
        for (String n: meseci) {

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
                    System.out.println("Mesec " + n + " ima 28 dana");
                    break;
                case "april":
                case "jun":
                case "septembar":
                case "novembar":
                    System.out.println("Mesec " + n + " ima 30 dana");
                    break;
                default:
                    System.out.println("Pogresan unos");
                    break;

            }

        }



    }
}
