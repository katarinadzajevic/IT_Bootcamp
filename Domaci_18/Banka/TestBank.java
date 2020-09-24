package testiranje;

//Potrebno je napraviti test za ispravnost klase Bank. Za sve testove potrebno je
// napraviti jedinstvenu banku koja se na početku testa resetuje. Smatrati da ova banka
// ne može da ima nalog kod kojeg je stanje negativno.
// Ako se na osnovu testova nađe neka greška u kodu potrebno jej da se popravi originalni kod.
//
//Potrebno je ispitati da li adekvatno radi otvaranje naloga, tako što će se ubaciti 5 naloga i zatim ispitati
// da li se ti nalozi mogu dohvatiti.
//Proveriti da li dobro radi metoda za uplatu novca.
//Proveriti da li dobro radi metoda za transfer novca.
//Proveriti da li dobro radi metoda za računanje ukupnog novca u banci (getSumMoney).

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestBank {
    private Bank mobi;

    @BeforeClass
    public void init() {
        mobi = new Bank();
    }

    @BeforeMethod
    public void resetBeforeEveryTestCase() {
        mobi.reset();
    }

    @Test
    public void testOpenAccount() {

        Account[] racuni = new Account[5];
        for (int i = 0; i < 5; i++) {
            Account a = mobi.openAccount("Racun " + i);
            racuni[i] = a;
        }
        for (int i = 0; i < racuni.length; i++) {

            if (racuni[i].getNumber().equals(mobi.getAccount(racuni[i].getNumber()))) {
                System.out.println("Dohvatili smo racun");
            }
        }
    }

    @Test
    public void testTranferMoney() {
        Account milena = mobi.openAccount("Milena");
        Account pera = mobi.openAccount("Pera");

        mobi.payInMoney(milena.getNumber(), 5000.0);
        mobi.transferMoney(milena.getNumber(), pera.getNumber(), 2000.0);


        SoftAssert sa = new SoftAssert();
        sa.assertEquals(milena.getAmount(), 3000.0);
        sa.assertEquals(pera.getAmount(), 2000.0);

        sa.assertAll();
    }
    @Test
    public void payInMoney(){
        Account account1 = mobi.openAccount("Kaca");
        String accountNumberFrom= mobi.getAccount(account1.getNumber()).getNumber();
        mobi.payInMoney(accountNumberFrom,9000.0);


        Account account2 = mobi.openAccount("Djordje");
        String accountNumberTo= mobi.getAccount(account2.getNumber()).getNumber();
        mobi.payInMoney(accountNumberTo,57000.0);

        SoftAssert sa = new SoftAssert();
        sa.assertEquals(account1.getAmount(),9000.0);
        sa.assertEquals(account2.getAmount(),57000.0);
        sa.assertAll();

    }

    @Test
    public void testGetSumMoney() {
        Account a = mobi.openAccount("Milosev racun");
        a.setAmount(5000);
        Account b = mobi.openAccount("Ivanin racun");
        b.setAmount(6000);
        Account c = mobi.openAccount("Dejanov racun");
        c.setAmount(10000);
        Assert.assertEquals(mobi.getSumMoney(), 21000);
    }

}
