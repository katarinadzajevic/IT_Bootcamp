package ocena;

public class Ocena {

    //Napraviti klasu Ocena. Potrebno je da sadrzi broj poena koje je neko imao na ispitu i metodu koja vraca koja ocena je u pitanju.
    // Sadrzi naziv predmeta, i rok u kom je odrzan. Klasa ocena treba da ima i metodu kojoj se prosledjuje niz ocena
    // koja racuna i vraca prosek. Prethodnu klasu testirati.

    private int brPoena;
    private String nazivPredmeta;
    private String ispitniRok;

    public int getBrPoena() {
        return brPoena;
    }

    public void setBrPoena(int brPoena) {
        this.brPoena = brPoena;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public String getIspitniRok() {
        return ispitniRok;
    }

    public void setIspitniRok(String ispitniRok) {
        this.ispitniRok = ispitniRok;
    }

    public Ocena(String nazivPredmeta, String ispitniRok, int brPoena) {
        this.nazivPredmeta = nazivPredmeta;
        this.ispitniRok = ispitniRok;
        this.brPoena = brPoena;

    }

    public int getOcena() {

        int ocena = 0;
        if (brPoena >= 0 && brPoena <= 50) {
            System.out.println("Ispit " + nazivPredmeta + " nije polozen!");

        } else if (brPoena >= 51 && brPoena <= 60)
            ocena = 6;
        else if (brPoena >= 61 && brPoena <= 70)
            ocena = 7;
        else if (brPoena >= 71 && brPoena <= 80)
            ocena = 8;
        else if (brPoena >= 81 && brPoena <= 90)
            ocena = 9;
        else if (brPoena >= 91 && brPoena <= 100)
            ocena = 10;
        else {
            System.out.println("Pogresan unos!");
        }
        return ocena;
    }


}
