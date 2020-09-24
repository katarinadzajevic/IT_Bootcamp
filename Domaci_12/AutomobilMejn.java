package klase;

import java.util.Scanner;

public class AutomobilMejn {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Automobil a1 = new Automobil( "Audi", "A3", 12345, 6);
        a1.setVlasnik("Pera Peric");
        System.out.println(a1.getMarka());
        System.out.println(a1.getModel());
        System.out.println(a1.getSerijskiBroj());
        System.out.println(a1.getVlasnik());
        System.out.println("Stepen prenosa: " + a1.getStepenPrenosa());
        a1.setStepenPrenosa(3);
        System.out.println("Novi stepen prenosa je: " + a1.getStepenPrenosa());

        Automobil a2 = new Automobil("Alfa", "GT", 6789, 2);
        a2.setVlasnik("Mika Mikic");
        System.out.println(a2.getMarka());
        System.out.println(a2.getModel());
        System.out.println(a2.getSerijskiBroj());
        System.out.println(a2.getVlasnik());
        System.out.println("Stepen prenosa: " + a2.getStepenPrenosa());
        a2.setStepenPrenosa(1);
        System.out.println("Novi stepen prenosa je: " + a2.getStepenPrenosa());


    }
}
