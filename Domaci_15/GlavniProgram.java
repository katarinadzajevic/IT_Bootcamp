package ocena;

import java.util.Arrays;

public class GlavniProgram {


    //  Napraviti klasu Ocena. Potrebno je da sadrzi broj poena koje je neko imao na ispitu i metodu koja vraca koja ocena je u pitanju.
    //  Sadrzi naziv predmeta, i rok u kom je odrzan. Klasa ocena treba da ima i metodu kojoj se prosledjuje niz ocena
    //  koja racuna i vraca prosek. Prethodnu klasu testirati.
    public static void main(String[] args) {

        Student s = new Student();

        Ocena o = new Ocena("Opsta ekonomija", "oktobarski", 67);
        Ocena o2 = new Ocena("Racunovodstvo", "oktobarski", 95);
        Ocena o3 = new Ocena("Statistika", "oktobarski", 50);

        s.dodajOcenu(o);
        s.dodajOcenu(o2);
        s.dodajOcenu(o3);

        System.out.println("Prosek:" + s.prosekOcena());


       Student s1 = new Student();

       Ocena ocena1 = new Ocena("Java advanced", "junski", 0);
       Ocena ocena2 = new Ocena("Java GUI", "oktobarski", -1);
       Ocena ocena3 = new Ocena("MySql", "januarski", 100);

       s1.dodajOcenu(ocena1);
       s1.dodajOcenu(ocena2);
       s1.dodajOcenu(ocena3);

        System.out.println("Prosek: " + s1.prosekOcena());
    }


}
