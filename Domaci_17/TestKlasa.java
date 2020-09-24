package domaci17;

//potrebno je napraviti test za ispravnost klase Zaposleni.
//Ako se na osnovu testova pronađe neka greška u kodu potrebno je da se popravi originalni kod.
//Proveriti da li konstruktor public Zaposleni dobro postavlja argumente, kao i da li get metode vraćaju odgovarajuće vrednosti.

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Date;

public class TestKlasa {

    @Test
    public void checkConstructor(){
        Date d = new Date();
        Zaposleni z1 = new Zaposleni("Milan Milojevic", 1984, d);
        SoftAssert s = new SoftAssert();
        s.assertEquals(z1.getNaziv(), "Milan Milojevic");
        s.assertEquals(z1.getGodRodjenja(), 1984);
        s.assertEquals(z1.getDatumZap(), d);
        s.assertAll();
    }
    @Test
    public void checkSetNazivMethod(){
        
        Zaposleni z2 = new Zaposleni("Nikola Dimitrijevic", 1875, new Date());
        z2.setNaziv("Jelena Petrovic");
        Assert.assertEquals(z2.getNaziv(), "Jelena Petrovic");
    }


}
