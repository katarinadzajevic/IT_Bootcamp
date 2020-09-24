package tablic_domaci_18;
//  Zadatak predstavlja jedan deo kartaške igre Tablić.
//  - Napraviti metodu koja ce da u jedan niz ucita sve karte koje je jedan korisnik sakupio.
//    Karte učitavati kao cele brojeve - kec je broj 11, žandar 12, dama 13 i kralj 14.
//    Tražiti od korisnika da učita koliko karata ima, a nakon toga koje su to karte.
//    Voditi računa o tome da li su broj karata, kao i svaka karta korektne vrednosti.
//
//  - Napraviti metodu koja broji koliko ima štihova u nizu.
//      Podrazumevati da mala dvojka i dupla desetka nemaju specijalno znacenje.
//
//  - Napraviti metodu koja će za dva prosleđena niza vratiti informaciju o tome ko je pobednik
//      (ko ima više sakupljenih štihova).
//
//  - Napraviti glavni program koji prikazuje primenu svih prethodno napisanih metoda.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TablicMain {

    public static void main(String[] args) {

        List<Integer> spilKarata = new ArrayList<>();
        for (int i = 2; i < 15; i++) {
            for (int j = 1; j < 5; j++) {
                spilKarata.add(i);
            }
        }

        Zadatak1 z = new Zadatak1();
        int broj1 = z.brojKarata();
        int[] niz1 = new int[broj1];
        z.sakupljeneKarte(niz1, spilKarata);
        System.out.println("Imate sledece karte: " + Arrays.toString(niz1));
        System.out.println("Broj osvojenih poena: " + z.brStihova(niz1));

        Zadatak1 z1 = new Zadatak1();
        int broj2 = z1.brojKarata();
        int[] niz2 = new int[broj2];
        z1.sakupljeneKarte(niz2, spilKarata);
        System.out.println("Imate sledece karte: " + Arrays.toString(niz2));
        System.out.println("Broj osvojenih poena: " + z1.brStihova(niz2));
        System.out.println(z1.pobednik(niz1, niz2));
    }
}
