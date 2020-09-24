import java.util.Arrays;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        //Napisati program koji učita dva niza i kao rezultat kreira treći niz koji predstavlja presek učitanih nizova.
        //Ispisati rezultat u formatu ‘( element * element * element * ... element).’


        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[5];
        int[] array2 = new int[8];
        int counter = 0;

        System.out.println("Enter 5 members of the first array: ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = sc.nextInt();
        }
        System.out.println("Enter 8 members of the second array: ");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = sc.nextInt();
        }

        for (int i = 0; i < array1.length; i++) {

            for (int j = 0; j < array2.length; j++) {

                if (array1[i] == array2[j]) {
                    counter += 1;
                }
            }
        }
        int[] array3 = new int[counter];
        int num = 0;

        for (int i = 0; i < array1.length; i++) {

            for (int j = 0; j < array2.length; j++) {

                if (array1[i] == array2[j]) {
                    array3[num] = array1[i];
                    num++;
                }
            }
        }
        System.out.print("( ");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i]);
            if (i != array3.length - 1) {
                System.out.print(" * ");
            }
        }
        System.out.print(").");
    }
}
