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

import java.util.List;
import java.util.Scanner;

public class Zadatak1 {


    public int brojKarata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Upisite br karata koje ste sakupili u igri: ");
        int br = sc.nextInt();
        while (br <= 0 || br > 52) {
            System.out.println("Broj mora biti veci od nule, a manji od broja 53, pokusajte ponovo:");
            br = sc.nextInt();
        }
        return br;
    }
    public void sakupljeneKarte(int[] n, List<Integer> spilKarata) {
        Scanner sc = new Scanner(System.in);
        int br;
        for (int i = 0; i < n.length; i++) {
            System.out.println("Unesite karte koje ste sakupili:");
            br = sc.nextInt();
            while (br <= 1 || br > 14) {
                System.out.println("Broj mora biti veci od jedinice, a manji od broja 15, pokusajte ponovo!");
                br = sc.nextInt();
            }
            if (spilKarata.contains(br)) {
                n[i] = br;
                spilKarata.remove(new Integer(br));
            } else {
                System.out.println("Pogresan unos, pokusajte ponovo:");
                i = i - 1;

            }
        }
    }

    public int brStihova(int[] niz) {
    	int desetka = 0;
        int kec = 0;
        int zandar = 0;
        int dama = 0;
        int kralj = 0;

        for (int i = 0; i < niz.length; i++) {
            switch (niz[i]) {
            	case 10:
            	desetka += 1;
            	break;
                case 11:
                    kec += 1;
                    break;
                case 12:
                    zandar += 1;
                    break;
                case 13:
                    dama += 1;
                    break;
                case 14:
                    kralj += 1;
                    break;
            }
        }
        return kec + zandar + dama + kralj;
    }

    public String pobednik(int[] n, int[] c) {
        int prviNiz = brStihova(n);
        int drugiNiz = brStihova(c);
        if (prviNiz > drugiNiz)
            return "Prvi igrac je pobedio!";
        else
            return "Drugi igrac je pobedio!";

    }

}
