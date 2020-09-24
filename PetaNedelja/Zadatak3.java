import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        //Za zadati ceo broj odrediti da li je on stepen broja 3.

        int[] array = new int[20];
        int sum = 1;

        for (int i = 0; i < array.length; i++) {
            sum *= 3;
            array[i] = sum;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert positive number: ");
        int num = sc.nextInt();
        boolean degree = true;

        for (int n : array) {
            if (num == n) {
                System.out.println("Number " + num + " is degree od number 3");
                degree = true;
                break;
            } else {
                degree = false;
            }
        }
        if (!degree) {
            System.out.println("Number " + num + " is not degree od number 3");
        }
    }
}
