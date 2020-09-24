package knjiga;

public class Knjiga {

    //Knjiga poseduje naziv, AUTORA (TIPA Autor),
    //broj strana, godinu izdanja.
    //Sva polja mogu da se dohvate,
    //a godina izdanja moze i da se postavi

    private String naziv;
    private Autor autor;
    private int brojStrana;
    private int godinaIzdanja;

    public Knjiga(String naziv, Autor autor, int brojStrana, int godinaIzdanja) {
        this.naziv = naziv;
        this.autor = autor;
        this.brojStrana = brojStrana;
        this.godinaIzdanja = godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public String getNaziv() {
        return naziv;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getBrojStrana() {
        return brojStrana;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }
    @Override
    public String toString(){
        return "Naziv knjige: " + this.naziv + "\nInformacije o  autoru: \n" + this.autor + "\nBroj strana knjige: " + this.brojStrana + "\nGodina izdanja: " + this.godinaIzdanja;
    };
}
