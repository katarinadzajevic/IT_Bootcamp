package tehnicar;

public class Osoba {

    //  Osoba poseduje naziv, jmbg, godinu rodjenja. Naziv, jmbg i godina rodjenja se zadaju prilikom kreiranja.
    //  Naziv moze da se dohvati i postavi. JMBG i godina rodjenja mogu samo da se dohvate.


    public static final int JMBG_LENGTH = 13;
    private String naziv;
    private String JMBG;
    private int godinaRodjenja;

    public Osoba(String naziv, String JMBG, int godinaRodjenja) {
        this.naziv = naziv;
        if (JMBG.length() == JMBG_LENGTH) {
            this.JMBG = JMBG;
        }
        this.godinaRodjenja = godinaRodjenja;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getJMBG() {
        return JMBG;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    // Ispis: O: Naziv : JMBG @ godRodjenja
    @Override
    public String toString() {
        return "O: "+getNaziv()+":"+getJMBG()+"@"+getGodinaRodjenja(); // StringBuilder -> Procitati -> Za domaci iskoristiti u ovom zadatku
//
//        StringBuilder sb = new StringBuilder();
//        sb = sb.append("Osoba").append(getNaziv());
//        sb.append();
    }
}
