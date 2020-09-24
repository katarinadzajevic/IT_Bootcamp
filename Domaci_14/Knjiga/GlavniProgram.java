package knjiga;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GlavniProgram {
    public static void main(String[] args) {
        //U programu iskoristi sva polja iz svih kreiranih klasa gde ce se kreirati 3 knjige, a knjige biti poredjane po godini izdanja.

        Autor a1 = new Autor("Milos", "Milovanovic", 1954);
        Autor a2 = new Autor("Aleksandar", "Boskovic", 1932);
        Autor a3 = new Autor("Milena", "Novakovic", 1934);

        Knjiga k1 = new Knjiga("Moc zapazanja", a1, 256, 1987);
        System.out.println(k1.toString());
        Knjiga k2 = new Knjiga("Pazi kojeg vuka hranis", a2, 202, 1964);
        System.out.println(k2.toString());
        Knjiga k3 = new Knjiga("Zdravlje i sreca", a3, 308, 1957);
        System.out.println(k3.toString());

        int godina1 = k1.getGodinaIzdanja();
        int godina2 = k2.getGodinaIzdanja();
        int godina3 = k3.getGodinaIzdanja();

        int niz[] = {godina1, godina2, godina3};
        Arrays.sort(niz);
        System.out.println("Knjige poredjane po godini izdanja: " + Arrays.toString(niz));
    }
}
