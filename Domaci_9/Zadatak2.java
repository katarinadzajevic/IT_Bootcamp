import java.util.Arrays;
import java.util.Scanner;

public class Zadatak2 {
    //Napisati program koji traži od korisnika da unese deset celih brojeva (brojevi trebaju da se učitavaju kao niz),
    // zatim da odstampa taj niz i njegov najveći član.
    //Kao deo za istrazivanje, u istom zadatku mozete uraditi sortiranje brojeva od najmanjeg
    // do najveceg i tako sortirane ih istampate.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] niz = new int[10];

        for (int i = 0; i < niz.length; i++) {
            System.out.println("Unesi clanove niza: ");
            niz[i] = sc.nextInt();

        }
        System.out.print("Elemeti niza su: " + Arrays.toString(niz) + " \n");

        int max = niz[0];
        for (int n = 0; n < niz.length; n++) {
            if (max < niz[n]) {
                max = niz[n];
            }
        }
        System.out.println("Najveci broj u nizu je: " + max);

        //sortiranje niza


        int min;
        int broj;
        boolean a = true;

        while (a) {
            a = false;
            for (int i = 0; i < niz.length - 1; i++) {

                if (niz[i] > niz[i + 1]) {
                    broj = niz[i];
                    min = niz[i + 1];
                    niz[i + 1] = broj;
                    niz[i] = min;
                    a = true;
                }


            }

        }


        System.out.println("Sortiran niz: " + Arrays.toString(niz));

    }


}





