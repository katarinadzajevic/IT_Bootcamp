package planinarskoDrustvo;
//  Planinarsko drustvo poseduje naziv, i spisak planinara. Spisak planinara je inicijalno prazan i planinar moze da se doda ili
//  ukloni sa spiska. Ove akcije ralizovati kao 2 zasebne metode(dodaj, ukloni). Naziv se zadaje prilikom kreiranja i moguce ga i
//  dohvatiti i postaviti. Moze da se dohvati broj planinara registrovanih u drustvu. Planinarsko drustvo je zaduzeno za kreiranje
//  planinara, to jest, poseduje metodu registruj(Osoba o, String brojDozvole), koja osobu o registruje kao planinara u svom
//  drustvu, sa brojemDozvole brojDozvole. Novoregistrovanog planinara dodaje u spisak planinara i vraca referncu na tog
//  planinara. Primer poziva metode registruj:

import java.util.ArrayList;
import java.util.List;

public class PlaninarskoDrustvo {

    private String naziv;

    public PlaninarskoDrustvo(String naziv) {
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    private List <Planinar> planinari = new ArrayList<>();

    public void dodajPlaninara(Planinar r){

        planinari.add(r);
    }
    public void ukoloniPlaninara(Planinar r){
        planinari.remove(r);
    }
    public int brPlaninara(){
        int br = planinari.size();
        return br;
    }
    //      Planinarsko drustvo je zaduzeno za kreiranje
    ////  planinara, to jest, poseduje metodu registruj(Osoba o, String brojDozvole), koja osobu o registruje kao planinara u svom
    ////  drustvu, sa brojemDozvole brojDozvole. Novoregistrovanog planinara dodaje u spisak planinara i vraca referncu na tog
    ////  planinara. Primer poziva metode registruj:

    public Planinar registruj(Osoba o, String brojDozvole){
        if (brojDozvole.length() != 7){
            brojDozvole = "0000000";
        }
        Planinar p = new Planinar(o.getIme(), o.getPrezime(), o.getGodRodj(), o.getJmbg(), brojDozvole);
        dodajPlaninara(p);
        return p;
    }
    //Planinarsko drustvo moze se ispisati na sledeci nacin:
    //  [NazivDrustva]{BrojPlaninara}
    //Planinar1
    //planinar2
    //...

    private String ispisPlaninara(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < planinari.size(); i++) {
            sb.append(planinari.get(i)).append("\n");

        }
        return sb.toString();
    }
    public String toString(){
        return "[" + getNaziv() + "]{" + planinari.size() + "}\n" + ispisPlaninara();
    }
}
