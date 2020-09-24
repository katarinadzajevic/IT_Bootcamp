package tehnicar;

public class Main {
    public static void main(String[] args) {
      /*
        # Osoba
        Osoba poseduje naziv, jmbg, godinu rodjenja. Naziv, jmbg i godina rodjenja se zadaju prilikom kreiranja.
        Naziv moze da se dohvati i postavi. JMBG i godina rodjenja mogu samo da se dohvate.

        Ispis: O: Naziv : JMBG @ godRodjenja

        # Zaposleni
        Zaposleni je `Osoba` koja poseduje i stepen strucne spreme
        Stepen strucne spreme moze da se dohvati i postavi

        Ispis: Zaposleni [OSOBA] : SSS

        # Pacijent
        Pacijent je `Osoba` koja poseduje broj knjizice (LIB). Broj knjizice se zadaje prilikom kreiranja i moze da se dohvati i postavi

        Ispis: [OSOBA] - LIB

        # Doktor
        Doktor je `Zaposleni` koji ima naziv fakulteta. Naziv fakulteta se zadaje prilikom kreiranja i moze da se dohvati i postavi

        Ispis: Doktor [Zaposleni] - Fakultet

        # Tehnicar
        Tehnicar je `Zaposleni` koji ima referencu na doktora za kojeg radi. Referenca na doktora za ojeg radi moze da se dohvati i postavi

         Ispis: Tehnicar [Zaposleni] radi za `Doktor`

         */


        Osoba o1 = new Osoba("Uros Milovanovic","2811995715648",1995);
        System.out.println(o1);
        Zaposleni z1 = new Zaposleni("Petar Petrovic","1234567891230",1997);
        z1.setSSS("6 stepen strucne spreme");
        System.out.println(z1);

        Pacijent p1 = new Pacijent("N G","1234567891230",1989,"45687951111");
        System.out.println(p1);

        //Doktor d1 = new Doktor("Cika Doca","1234567891230",1970,"Medicinski");
        //d1.setSSS("6 SSS");
        //System.out.println(d1);
        Tehnicar t1 = new Tehnicar("Miloje","1234567891230",1988);
        //t1.setRefDoktora(d1);
        System.out.println(t1);

    }
}
