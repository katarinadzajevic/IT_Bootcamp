package pozoriste;
//  Glumac je zaposleni koji ima i naziv uloge. Tekstualni oblik je uloga_ime[naziv_pozorista].

public class Glumac extends Zaposleni {

    private String nazivUloge;

    public Glumac(String imePrezime, Pozoriste p, String nazivUloge) {
        super(imePrezime, p);
        this.nazivUloge = nazivUloge;
    }

    public String toString() {
        return nazivUloge + "_" + super.getImePrezime() + "[" + super.getP().getNaziv() + "]";
    }

    public String getNazivUloge() {
        return nazivUloge;
    }


}
