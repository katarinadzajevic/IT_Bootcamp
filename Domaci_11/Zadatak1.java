import java.util.Arrays;
import java.util.Scanner;

public class Zadatak1 {
    //Napisati program koji će za uneti niz proveravati da li rastući ili nije rastući.
    //Kao dodatak zadatku, proveriti da li je niz rastući, opadajući ili ništa od toga.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi duzinu niza: ");
        int unos;
        while ((unos = sc.nextInt()) <= 0) {
            System.out.println("Broj mora biti veci od nule");
        }
       int[] niz = new int[unos];
        niz(niz);
        System.out.println("Clanovi niza su: " + Arrays.toString(niz));


        if (proveraNiza(niz) == true) {
            System.out.println("Niz je rastuci");
        }
        else if (proveraNiza(niz) == false){
            System.out.println("Niz nije rastuci");
        }

    }

    public static void niz(int[] niz) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi clanove niza:");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = sc.nextInt();
        }
    }




    public static boolean proveraNiza(int[] niz) {
        loop:
        for (int i = 0, j = 1; j < niz.length; i++, j++) {
            if (niz[i] == niz[j]) {
                continue loop;
            }
            else if (niz[i] + 1 != niz[j] && niz[i] != niz[j] - 1) {
                return false;
            }
        }
        return true;
    }
}
