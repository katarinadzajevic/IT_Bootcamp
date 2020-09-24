package tehnicar;

public class Doktor extends Zaposleni{
    public String nazivFakulteta;

    public Doktor(String naziv, String JMBG, int godinaRodjenja,String nazivFakulteta) {
        super(naziv, JMBG, godinaRodjenja);
        this.nazivFakulteta = nazivFakulteta;
    }

    public String getNazivFakulteta() {
        return nazivFakulteta;
    }

    public void setNazivFakulteta(String nazivFakulteta) {
        this.nazivFakulteta = nazivFakulteta;
    }
    // Ispis: Doktor [Zaposleni] - Fakultet

    @Override
    public String toString() {
        return "Doktor ["+ super.toString()+"] - "+getNazivFakulteta();
    }
}
