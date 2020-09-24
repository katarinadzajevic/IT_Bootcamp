package pozoriste;

//  Reditelj je zaposleni koji je prepoznatljiv po svom nadimku. Tekstualni oblik je nadimak_ime[naziv_pozorista].

public class Reditelj extends Zaposleni{

    public String nadimak;

    public Reditelj(String imePrezime, Pozoriste p, String nadimak) {
        super(imePrezime, p);
        this.nadimak = nadimak;
    }

    public String toString(){

        return nadimak+"_"+super.getImePrezime()+"[" + super.getP().getNaziv() + "]";
    }

    public String getNadimak() {
        return nadimak;
    }
}
