import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        //Napisati program koji od korisnika trazi da unese cetiri cela broja od 0 do n a zatim da prva dva broja pomnozi a treci i cetvrti sabere.
        // Rezultat oba racunanja treba da se ispisuje zajedno sa informacijom da li je rezultat tih racunanja paran ili neparan broj.

        System.out.println("Unesi cetiri pozitivna broja: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int sum = a + b;
        int multp = c * d;

        if (a > 0 && b > 0 && c > 0 && d > 0) {

            if (sum % 2 == 0) {

                System.out.println(String.format("Zbir prva dva uneta broja je %d, i taj broj je paran broj.", sum));

            } else {

                System.out.println(String.format("Zbir prva dva uneta broja je %d, i taj broj je neparan broj.", sum));
            }
            if (multp % 2 == 0) {

                System.out.println(String.format("Proizvod druga dva uneta broja je %d, i taj broj je paran broj.", multp));

            } else {

                System.out.println(String.format("Proizvod druga dva uneta broja je %d, i taj broj je neparan broj.", multp));
            }
        } else {
            System.out.println("Uneli ste negativan broj");
        }

    }
}
