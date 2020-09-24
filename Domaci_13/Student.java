public class Student {

    //  Kreirati sopstvenu klasu Studenti, koja ce imati sledece podatke:
    //  njihova imena i prezimena, broj indexa, smer, rezultate ispita izrazeni u procentima( 51% za polozen ispit).
    //  U svom programu koristii klasu i sve navedene parametre gde ce korisnik programa unositi
    //  parametre broj indexa i rezultati ispita. Unos samo broja indexa ispita treba da izbaci sve podatke o studentu.

    private String imePrezime;
    private String index;
    private String smer;
    private int rezultatIspita;

    public Student(String imePrezime, String index){

        this.imePrezime = imePrezime;
        this.index = index;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public String info() {
        return "Osoba sa brojem indexa " + this.index + " je: " + getImePrezime() + " " + getSmer() + " " + getRezultatIspita();
    }

    public String getSmer() {
        return smer;
    }

    public void setSmer(String smer) {
        this.smer = smer;
    }

    public int getRezultatIspita() {
        return rezultatIspita;
    }

    public void setRezultatIspita(int rezultatIspita) {
        this.rezultatIspita = rezultatIspita;
    }

    public String getIndex() {
        return index;
    }
}
