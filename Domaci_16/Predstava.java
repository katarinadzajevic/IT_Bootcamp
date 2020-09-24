package pozoriste;

//  Predstava je opisana nazivom, pozoristem u kojem se izvodi i sadrzi zaposlene koji ucestvuju u realizaciji predstave.
//   Zaposleni za realizaciju predstave mogu da se dodaju i izbace. Moze da se dohvati broj zaposlenih na predstavi.
//  Sastavlja se tekstualni opis predstave navodeci naziv predstave i naziv pozorista u kojem se predstava odrzava razdvojene zarezom,
//   a potom zaposlene koji ucestvuju u realizaciji predstave (svakog zaposlenog u zasebnom redu).

import java.util.ArrayList;

public class Predstava {

    public String nazivPredstave;
    private Pozoriste pozoriste;

    public Predstava(String nazivPredstave, Pozoriste pozoriste) {
        this.nazivPredstave = nazivPredstave;
        this.pozoriste = pozoriste;
    }

    public String getNazivPredstave() {
        return nazivPredstave;
    }

    public Pozoriste getPozoriste() {
        return pozoriste;
    }

    ArrayList<Zaposleni> zaposleni = new ArrayList();


    public void dodajZaposlenog(Zaposleni z) {

        zaposleni.add(z);
    }

    public void izbaciZaposlenog(Zaposleni z) {

        zaposleni.remove(z);
    }

    public int getBrZaposlenih() {

        int sum = 0;
        for (int i = 0; i < zaposleni.size(); i++) {
            sum += i;
        }
        return sum;
    }

    public String ispisZaposlenih() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < zaposleni.size(); i++) {
            sb.append(zaposleni.get(i).getImePrezime() + "\n");
        }
        return sb.toString();
    }

    //  navesti naziv predstave i naziv pozorista u kojem se predstava odrzava razdvojene zarezom,
    //  a potom zaposlene koji ucestvuju u realizaciji predstave (svakog zaposlenog u zasebnom redu).

    public String toString() {
        return nazivPredstave + ", " + pozoriste.getNaziv() + "\n" + ispisZaposlenih();

    }


}
