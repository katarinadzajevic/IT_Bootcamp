package klase;

public class Automobil {
    ///* Napisati klasu Automobil. Automobil ima
    //marku (polje tipa String) koje moze da se dohvati, ali ne i postavi
    //model (polje tipa String) koje moze da se dohvati ali ne i postavi
    //serijski broj (polje tipa int) koje moze da se dohvati ali ne i postavi
    //Automobil moze da ima vlasnika, i vlasnik moze da se dohvati i postavi u svakom trenutku
    //Napisati glavni program koji kreira dva automobila.
    //U glavnom programu iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Automobil.
    //1. Dopuniti zadatak Automobil tako sto se automobil kreira sa stepenom prenosa. Stepen prenosa moze da se smanji i poveca.
    //*//

    private String marka;
    private String model;
    private int serijskiBroj;
    private String vlasnik;
    private int stepenPrenosa;

    public Automobil(String marka, String model, int serijskiBroj, int stepenPrenosa) {
        this.marka = marka;
        this.model = model;
        this.serijskiBroj = serijskiBroj;
        this.stepenPrenosa = stepenPrenosa;

    }

    public void setVlasnik(String vlasnik) {
        this.vlasnik = vlasnik;
    }

    public String getVlasnik() {
        return vlasnik;
    }

    public int getSerijskiBroj() {
        return serijskiBroj;
    }

    public String getModel() {
        return model;
    }

    public String getMarka() {
        return marka;
    }

    public int getStepenPrenosa() {
        return stepenPrenosa;
    }

    public void setStepenPrenosa(int stepenPrenosa) {
        this.stepenPrenosa = stepenPrenosa;
    }
}
