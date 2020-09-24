package zadatak1;
import zadatak1.Catalog;
import zadatak1.HomePage;
import zadatak1.LogIn;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPage {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(HomePage.url);
        driver.manage().window().maximize();

        HomePage.clickEnterTheStoreElem(driver);
        Catalog.clickSignIn(driver);

//        LogIn.clickRegisterNow(driver);
//        Register.setUserID(driver, "Kaca_K");
//        Register.setPassword(driver, "12345789");
//        Register.setRepeatPsw(driver, "12345789");
//        Register.setFirstName(driver,"Katarina");
//        Register.setLastName(driver, "Dzajevic");
//        Register.setEmail(driver, "kaca@gmail.com");
//        Register.setPhone(driver, "06402135878");
//        Register.setAddress1(driver, "Maticanksa");
//        Register.setAddress2(driver, "Maticanksa2");
//        Register.setCity(driver, "Beograd");
//        Register.setState(driver, "Serbia");
//        Register.setZip(driver, "11000");
//        Register.setCountry(driver, "Serbia");
//        Register.setLanguagePreferences(driver);
//        Register.setFavouriteCategory(driver);
//        Register.setEnableMyListXpath(driver);
//        Register.setEnableMyBanner(driver);
//        Register.clickAccountInfoBtn(driver);


        LogIn.setUsername(driver);
        LogIn.setPassword(driver);
        LogIn.clickLoginBtn(driver);


    }
}
