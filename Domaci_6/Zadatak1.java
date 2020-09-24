import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {
        //Napisati program koji ce uneseni broj u opsegu od 0 do n deliti sa 2 i 3.
        // Ukoliko je ceo broj, treba da izbaci rezultat a ukoliko ne treba da ispise odgovarajucu poruku.

        System.out.println("Unesi pozitivan broj:");
        Scanner sc = new Scanner(System.in);
        int broj = sc.nextInt();
        if (broj % 2 == 0 & broj % 3 == 0) {

            int rez = broj / 2;
            int rez2 = broj / 3;
            System.out.println(String.format("Uneseni broj podeljeno sa 2 iznosi %d, a podeljeno sa 3 iznosi %d.", rez, rez2));
        }
        else {

            System.out.println("Uneseni broj nije deljiv sa brojem dva i tri!");

        }

    }
}
