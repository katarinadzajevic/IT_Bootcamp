package pozoriste;

//  Pozoriste ima jedinstveni celobrojni identifikacioni broj i naziv koji mogu da se dohvate. Moze
//   da se sastavi tekstualni opis u obliku naziv[id].
//

public class Pozoriste {

    private String naziv;
    private static int ID = 1;
    private int idPozorista;

    public Pozoriste(String naziv) {
        this.naziv = naziv;
        this.idPozorista = ID++;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getIdPozorista() {
        return idPozorista;
    }
    @Override
    public String toString(){

        return naziv + "[" + idPozorista + "].";

    }


}
