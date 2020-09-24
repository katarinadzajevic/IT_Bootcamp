import java.util.Arrays;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        //Zadat je nenegativan broj. Sabirati njegove cifre sve dok rezultat ne bude samo jedna cifra. Ispisati je.

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert positive number: ");
        int n = sc.nextInt();
        int sum=0;

        while (n > 0 || sum > 9)
        {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        System.out.println("One digit sum is: " + sum);

    }
}
