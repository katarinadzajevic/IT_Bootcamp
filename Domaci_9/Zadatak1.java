import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        //Napisati program koji od korisnika traži da unese neki datum i da ispiše koji je to po redu dan u godini.
        // Za izračunavanje definisati i koristiti niz.

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite dan u mesecu: ");
        int dan = sc.nextInt();
        System.out.println("Unesite mesec: ");
        int mesec = sc.nextInt();

        int redniBroj = 0;
        int[] niz = {31,28,31,30,31,30,31,31,30,31,30,31};

        for (int i = 0; i < mesec-1; i++) {
            redniBroj += niz[i];


        }
        System.out.println("Uneti datum je " + (redniBroj + dan) + ". dan u godini.");

    }
}
