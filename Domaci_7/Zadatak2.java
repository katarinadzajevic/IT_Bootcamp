import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        //Napisati program koji ubacuje unetu kolicinu lopti u korpu za kupovinu.
        // Prilikom unosa broja lopti, u korpu se mora ubaciti minimum jedna lopta,a
        // maksimalan broj lopti koji moze da stane u korpu je 33.

        System.out.println("Ovo je korpa za lopte. U korpu morate da ubacite barem jednu loptu, a maksimalan broj lopti koje mozete da ubacite je 33.");

        Scanner sc = new Scanner(System.in);
        int brojLopti;
        int sum = 0;

        System.out.println("Ubaci lopte u korpu: ");
        brojLopti = sc.nextInt();

        while (brojLopti > 0 && brojLopti <= 33) {
            sum += brojLopti;
            if (sum == 33) {
                break;
            } else if (sum > 33) {
                System.out.println("Maksimalan broj lopti u korpi je 33!");
                sum = sum - brojLopti;
                break;
            } else {
                System.out.println("Ubaci lopte u korpu: ");
                brojLopti = sc.nextInt();
            }
        }

        System.out.println("Broj lopti u korpi je: " + sum + ".");
    }
}
