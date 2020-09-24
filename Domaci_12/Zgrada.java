import java.util.Arrays;

public class Zgrada {

    //2. Napraviti sopstvenu klasu Zgrada.
    //Zgrada ima adresu na kojoj se nalazi, spratnost, broj stanova, prezimena stanara.
    //Sve tipove metoda u ovoj klasi treba iskoristiti u glavnom programu gde cete kreirati dve zgrade. Sva polja mogu da se dohvate i postave.

    private String adresa;
    private int spratnost;
    private int brojStanova;
    private String[] prezimeStanara;

    public String getAdresa() {
        return adresa;
    }

    public int getSpratnost() {
        return spratnost;
    }

    public int getBrojStanova() {
        return brojStanova;
    }

    public String getPrezimeStanara() {
        return Arrays.toString(prezimeStanara);
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void setSpratnost(int spratnost) {
        this.spratnost = spratnost;
    }

    public void setBrojStanova(int brojStanova) {
        this.brojStanova = brojStanova;

    }

    public void setPrezimeStanara(String[] prezimeStanara) {
        this.prezimeStanara = prezimeStanara;

    }
}


