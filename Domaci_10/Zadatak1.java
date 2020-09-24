import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {
        //Napisati program koji ima meni za samousluznu kasu u prodavnici. Meni za potrosace sadrzi sledece opcije:
        //0 - Izlaz iz programa
        //1 - dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)
        //2 - naplata racuna
        boolean a = true;
        double sum = 0;
        while (a) {
            a = false;
            Scanner sc = new Scanner(System.in);
            System.out.println("Unesite jednu od ponudjenih opcija:\n1 - Dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)\n" +
                    "2 - Naplata racuna\n0 - Izlaz iz programa");
            int opcija = sc.nextInt();
            if (opcija != 0 && opcija != 1 && opcija != 2) {
                a = true;
            } else {

                switch (opcija) {
                    case 1:
                        sum = sum + cena();
                        a = true;
                        break;
                    case 2:
                        if (naplata(sum)) {
                            sum = 0;
                        }
                        a = true;
                        break;
                    case 0:
                        krajPrograma();
                        break;
                }
            }
        }
    }


    //Ukoliko korisnik unese opciju 0 program se zavrsava.

    public static void krajPrograma() {
        System.out.println("Hvala na poverenju! Prijatan dan!");
    }

    //Ukoliko korisnik unese opciju 1 program pita korisnika da unese cenu proizvoda i ta cena se dodaje na racun u prodavnici.

    public static double cena() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite cenu proizvoda: ");
        double cena = sc.nextDouble();
        if (cena <= 0) {
            System.out.println("Pogresan unos, cena mora biti veca od nule!");
        }
        return cena;
    }

    //Ukoliko korisnik unese opciju 2 program pita korisnika da unese kolicinu novca za naplatu racuna.
    //Ukoliko korisnik unese vrednost manju od vrednosti racuna, potrebno je da se ispise greska, bez umanjenja racuna i da se ponovo ispise meni.
    //	Ukoliko korisnik unese vrednost vecu ili jednaku od cene racuna ispisuje se kusur i racun se ponovo postavlja na nulu. Zatim se ponovo ispisuje meni.


    public static boolean naplata(double sum) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite vrednost racuna: ");
        double racun = sc.nextDouble();
        if (racun < sum) {
            System.out.println("Uneta vrednost je manja od vrednosti racuna!");
            return false;
        } else if (racun == sum) {
            System.out.println("Uspesno ste platili racun! Hvala na poverenju");
            return true;
        } else {
            double kusur = racun - sum;
            System.out.println("Vas kusur iznosi: " + kusur + ". Hvala na poverenju!");
            return true;
        }
    }
}
