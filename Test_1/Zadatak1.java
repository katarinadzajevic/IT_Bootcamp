import java.util.Scanner;

public class Zadatak1 {

    /*  Zadatak 1:
        -Napisati program koji učitava jedan broj koji predstavlja koliko ljudi će nakon toga uneti podatke o broju dece koju imaju.
        -Nakon što se broj ljudi učita, učitavaju se podaci o broju dece.
	    -Nakon toga, ispisati koji procenat ljudi ima više od dvoje dece.

    	Na primer, ukoliko se unese broj 4, a zatim brojevi 1, 3, 2 i 4 program treba da ispiše poruku da 50% ljudi ima preko dvoje dece.
    */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ucitaj broj ljudi koji unosi podatke: ");
        int brojOsoba = sc.nextInt();
        int brojac = 0;

        for (int i = 0; i < brojOsoba; i++) {
            System.out.println("Unesi broj dece: ");
            double brojDece = sc.nextDouble();
            if(brojDece<0){
                System.out.println("Greska!");
                
            }
            else if (brojDece > 2) {
                brojac = brojac + 1;
            }
        }

        double procenat = 100.00 / brojOsoba;
        System.out.println(procenat*brojac + " % ljudi ima preko dvoje dece");

    }
}
