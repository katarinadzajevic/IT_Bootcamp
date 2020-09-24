import java.util.Arrays;
import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {

        //  A)Zadat je niz brojeva. Napisati program koji pomera sve nule na kraj niza, zadržavajući redosled nenultih
        //  elemenata.
        //  B) Zadatak odraditi tako da se ne alocira dodatni prostor za novi niz, već modifikovati postojeći.
        //  Primer: Ulazni niz -> 1 0 2 25 0 6, Izlaz -> 1 2 25 6 0 0

        Scanner sc = new Scanner(System.in);
        int[] array = new int[8];
        int j = 0;

        System.out.println("Enter 8 numbers in array: ");
        for (int i = 0; i < array.length; i++) {

            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {

            if (array[i] != 0) {
                array[j] = array[i];
                j++;
            }
        }
        while (j < array.length)
            array[j++] = 0;

        System.out.println(Arrays.toString(array));


    }
}
