package planinarskoDrustvo;

//  Planinar je osoba koja poseduje broj planinarske dozvole, broj planinarske dozvole mora da ima tacno 7 karaktera. Broj
//  planinarske dozvole se postavlja prilikom kreiranja i moze se samo dohvatiti. Ukoliko se stavi nedozvoljena vrednost, postaviti
//  broj planinarske dozvole na "0000000".

//Klasa Planinar poseduje staticku metodu kreiraj(Osoba o, String brojDozvole) koja prima kao argument objekat tipa Osoba
//a vraca objekat tipa Planinar. Metoda kreiraj za poslatu osobu kreira planinara i vraca objekat, to jest uzima informacije iz
//objekta tipa Osoba i kreira objekat tipa Planinar. (Prisetiti se sa predavanja klase Banka i otvaranja racuna);

public class Planinar extends Osoba {


    private String brDozvole;

    public Planinar(String ime, String prezime, int godRodj, String jmbg, String brDozvole) {
        super(ime, prezime, godRodj, jmbg);
        if (brDozvole.length() != 7) {
            this.brDozvole = "0000000";
        } else {
            this.brDozvole = brDozvole;
        }
    }

    public String getBrDozvole() {
        return brDozvole;
    }
    //Klasa Planinar poseduje staticku metodu kreiraj(Osoba o, String brojDozvole) koja prima kao argument objekat tipa Osoba
    //a vraca objekat tipa Planinar. Metoda kreiraj za poslatu osobu kreira planinara i vraca objekat, to jest uzima informacije iz
    //objekta tipa Osoba i kreira objekat tipa Planinar.

    public static Planinar kreiraj(Osoba o, String brDozvole) {
        if (brDozvole.length() != 7) {
            brDozvole = "0000000";
        }
        Planinar p = new Planinar(o.getIme(), o.getPrezime(), o.getGodRodj(), o.getJmbg(), brDozvole);
        return p;
    }

    //Planinar moze da se ispise u sledecem obliku:
    //  [Ime Prezime]{GodinaRodjenja}<JMBG> - BrojDozvole

    public String toString() {
        return super.toString() + " - " + this.getBrDozvole();
    }

}
