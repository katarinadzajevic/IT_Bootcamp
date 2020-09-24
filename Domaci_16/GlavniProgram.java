package pozoriste;

//  Pozoriste ima jedinstveni celobrojni identifikacioni broj i naziv koji mogu da se dohvate. Moze
//   da se sastavi tekstualni opis u obliku naziv[id].
//
//  Zaposleni u pozoristu je opisan imenom (i prezimenom, jedno polje) i pozoristem u kojem je zaposlen.
//   Svi podaci mogu da se dohvate. Moze da se sastavi tekstualni opis u obliku ime[naziv_pozorista].
//
//  Glumac je zaposleni koji ima i naziv uloge. Tekstualni oblik je uloga_ime[naziv_pozorista].
//
//  Reditelj je zaposleni koji je prepoznatljiv po svom nadimku. Tekstualni oblik je nadimak_ime[naziv_pozorista].
//
//  Predstava je opisana nazivom, pozoristem u kojem se izvodi i sadrzi zaposlene koji ucestvuju u realizaciji predstave.
//   Zaposleni za realizaciju predstave mogu da se dodaju i izbace. Moze da se dohvati broj zaposlenih na predstavi.
//  Sastavlja se tekstualni opis predstave navodeci naziv predstave i naziv pozorista u kojem se predstava odrzava razdvojene zarezom,
//   a potom zaposlene koji ucestvuju u realizaciji predstave (svakog zaposlenog u zasebnom redu).

public class GlavniProgram {
    public static void main(String[] args) {

        Pozoriste p = new Pozoriste("Branislav Nusic");
        System.out.println("Naziv pozorista: " + p.getNaziv());
        System.out.println("ID pozorista: " + p.getIdPozorista());
        System.out.println("Tekstualni ispis: " + p.toString());

        Zaposleni z = new Zaposleni("Miloje Milojevic", p);
        System.out.println("Ime i prezime zaposlenog: " + z.getImePrezime());
        System.out.println("Pozoriste u kojem je zaposlen: " + z.getP().getNaziv());
        System.out.println("Tekstualni opis zaposlenog: " + z.toString());

        Glumac g = new Glumac("Dejan Milojevic", p, "glavna uloga");
        System.out.println("Ime i prezime glumca: " + g.getImePrezime());
        System.out.println("Uloga: " + g.getNazivUloge());
        System.out.println("Ispis: " + g.toString());

        Reditelj r = new Reditelj("Miljana Markovic", p, "Milja");
        System.out.println("Nadimak reditelja: " + r.getNadimak());
        System.out.println("Ispis: " + r.toString());

        Predstava predstava = new Predstava("Radovan III", p);
        System.out.println("Naziv predstave: " + predstava.getNazivPredstave());
        System.out.println("Naziv pozorista: " + predstava.getPozoriste().getNaziv());
        predstava.dodajZaposlenog(z);
        predstava.dodajZaposlenog(g);
        predstava.dodajZaposlenog(r);
        System.out.println("Broj zaposlenih u predstavi: " + predstava.getBrZaposlenih());
        //predstava.izbaciZaposlenog(r);
        System.out.println("Ispis: " + predstava.toString());
    }
}


