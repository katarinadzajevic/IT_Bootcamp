import java.util.Arrays;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        //Učitati jedan broj i ispisati koliko on sadrži cifara koje su deljive sa 3.

//        Scanner sc = new Scanner(System.in);
//        int counter = 0;
//        System.out.println("Insert positive number: ");
//        int number = sc.nextInt();
//        int no = number;
//        while (number != 0) {
//            int digit = number % 10;
//            if (digit % 3 == 0)
//                counter += 1;
//            number = number / 10;
//
//        }
//        System.out.println(String.format("Number %d contains %d digits divisible with number 3.", no, counter));

        //Drugi nacin sa Stringom

//        Scanner s = new Scanner(System.in);
//        System.out.println("Insert positive number");
//        String number1 = s.nextLine();
//        int no1 = 0;
//
//        char[] array = number1.toCharArray();
//
//        for (int i = 0; i < array.length; i++) {
//            int digit = Integer.parseInt(String.valueOf(array[i]));
//            if (digit % 3 == 0)
//                no1 += 1;
//
//        }
//        System.out.println(String.format("Number %s contains %d digits divisible with number 3.", number1, no1));


        //Modifikovati program tako da se postupak pod a) ponavlja i to tako da pre svakog unosa korisnik vidi
        //pitanje da li želi da unese još jedan broj. Ako je odgovor 'da' treba izbrojati cifre deljive sa 3, a ukoliko je 'ne'
        //treba završiti program.


//        Scanner scanner = new Scanner(System.in);
//        String answer;
//        int counter1;
//
//        while (true) {
//            counter1 = 0;
//            System.out.println("Insert positive number");
//            String number1 = scanner.nextLine();
//            char[] array = number1.toCharArray();
//
//            for (int i = 0; i < array.length; i++) {
//            int digit = Integer.parseInt(String.valueOf(array[i]));
//            if (digit % 3 == 0)
//                counter1 += 1;
//
//        }
//
//            System.out.println(String.format("Number %s contains %d digits divisible with number 3.", number1, counter1));
//            System.out.println("Do you want to continiue?");
//            answer = scanner.nextLine();
//            if (answer.equals("yes")) {
//                continue;
//            } else if (answer.equals("no")) {
//                System.out.println("Goodbye");
//                break;
//            }
//        }


//        //Omogućiti da unos reči 'da' i 'ne' ne bude caseSensitive.

//        String a = "yes";
//        String b = "no";
//        Scanner scanner1 = new Scanner(System.in);
//        String answer2;
//        int counter2;
//
//        while (true) {
//            counter2 = 0;
//            System.out.println("Insert positive number");
//            String number1 = scanner1.nextLine();
//            char[] array = number1.toCharArray();
//
//            for (int i = 0; i < array.length; i++) {
//                int digit = Integer.parseInt(String.valueOf(array[i]));
//                if (digit % 3 == 0)
//                    counter2 += 1;
//            }
//            System.out.println(String.format("Number %s contains %d digits divisible with number 3.", number1, counter2));
//            System.out.println("Do you want to continiue?");
//            answer2 = scanner1.nextLine().toLowerCase();
//
//            if (answer2.equals(a)) {
//                continue;
//            }
//            else if (answer2.equals(b)) {
//                System.out.println("Goodbye");
//                break;
//            }
//        }

    }
}
