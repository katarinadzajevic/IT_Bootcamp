import java.util.Scanner;

public class Zadatak2 {

    public static void main(String[] args) {
        /*  Napisati program koji unosi i sabrira dva broja dokle god zbir brojeva ide do broja 10 (ukljucujuci i 10), a
            mnozi dokle god je proizvod veci od (predhodno) maksimalnog zbira brojeva do broja n.
        */

        System.out.println("Unesi dva pozitivna broja:");
        Scanner sc = new Scanner(System.in);
        int prviBroj = sc.nextInt();
        int drugiBroj = sc.nextInt();
        int sum = prviBroj + drugiBroj;
        int mult = prviBroj * drugiBroj;

        if (sum <= 10) {
            System.out.println("Zbir unetih brojeva je: " + sum);
        } else {

            System.out.println("Proizvod unetih brojeva je: " + mult);
        }

    }
}
