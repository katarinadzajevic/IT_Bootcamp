package pozoriste;

//  Zaposleni u pozoristu je opisan imenom (i prezimenom, jedno polje) i pozoristem u kojem je zaposlen.
//   Svi podaci mogu da se dohvate. Moze da se sastavi tekstualni opis u obliku ime[naziv_pozorista].

public class Zaposleni {

    private String imePrezime;
    private Pozoriste p;

    public Zaposleni(String imePrezime, Pozoriste p) {
        this.imePrezime = imePrezime;
        this.p = p;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public Pozoriste getP() {
        return p;
    }

    public String toString(){
        return imePrezime + "[" + p.getNaziv() + "]";
    }
}
