package zadatak1;
//  Koristeci svoju tabelu sa potrebnim vrednostima, automatizovati kupovinu na sajtu https://www.saucedemo.com. Proci kroz sledece stavke:
//  a) Ulogovati se sa ispravnim kredencijalima(na sajtu su ispisani ispravni kredencijali, probati sa 2 username-a)
//  b) Izabrati da redosled proizvoda bude od najjeftinijeg do najskupljeg
//  c) Dodati najskuplji proizvod u cart
//  d) Preci na korak za placanje i popuniti neophodna polja
//  e) Uspesno zavrsiti kupovinu

//Dodatno: Izvuci informaciju (mozete i rucno) o iznosu takse na kupovinu, nazivu proizvoda i payment information (#nekbrojevi) 
//te iste informacije ubaciti u tabelu a zatim prilikom dolaska na tu stranicu kroz test, 
//proveriti da li se ta dva parametra poklapaju sa onim sto imate u vasoj tabeli.

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;

public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "/home/katarina/Jars/webdriver/chromedriver");

        for (int i = 1; i < 3; i++) {

            WebDriver driver = new ChromeDriver();
            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();


            WebElement userName = driver.findElement(By.id("user-name"));
            WebElement password = driver.findElement(By.id("password"));
            WebElement loginBtn = driver.findElement(By.xpath("//input[@id='login-button']"));

            Cell cellUserName = null;
            Cell cellPassword = null;
            Cell cellfirstName = null;
            Cell celllastName = null;
            Cell cellzipCode = null;
            Cell cellPaymentInfo = null;
            Cell cellProductName = null;
            Cell cellTax = null;

            try (FileInputStream fis = new FileInputStream("users.xlsx")) {

                XSSFWorkbook wb = new XSSFWorkbook(fis);
                Sheet sheet = wb.getSheetAt(0);
                Row row = sheet.getRow(i);
                cellUserName = row.getCell(0);
                cellPassword = row.getCell(1);
                cellfirstName = row.getCell(2);
                celllastName = row.getCell(3);
                cellzipCode = row.getCell(4);
                cellPaymentInfo = row.getCell(5);
                cellProductName = row.getCell(6);
                cellTax = row.getCell(7);

            } catch (Exception e) {
                System.out.println("Doslo je do greske");
            }

            userName.sendKeys(cellUserName.toString());
            password.sendKeys(cellPassword.toString());
            loginBtn.click();
            Thread.sleep(1000);

            WebElement sortBtn = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/select[1]"));
            WebElement sortByPrice = driver.findElement(By.xpath("//option[contains(text(),'Price (low to high)')]"));
            WebElement product = driver.findElement(By.xpath("//div[text()='Sauce Labs Fleece Jacket']//ancestor::div[@class='inventory_item']//button"));

            sortBtn.click();
            sortByPrice.click();
            product.click();
            Thread.sleep(1000);

            WebElement cart = driver.findElement(By.xpath("//*[name()='path' and contains(@fill,'currentCol')]"));
            cart.click();
            Thread.sleep(2000);

            WebElement checkoutBtn = driver.findElement(By.xpath("//a[@class='btn_action checkout_button']"));
            checkoutBtn.click();
            Thread.sleep(1000);


            WebElement firstName = driver.findElement(By.xpath("//input[@id='first-name']"));
            WebElement lastName = driver.findElement(By.xpath("//input[@id='last-name']"));
            WebElement zipCode = driver.findElement(By.xpath("//input[@id='postal-code']"));
            WebElement continuetBtn = driver.findElement(By.xpath("//input[@class='btn_primary cart_button']"));

            firstName.sendKeys(cellfirstName.toString());
            lastName.sendKeys(celllastName.toString());
            zipCode.sendKeys(cellzipCode.toString());
            continuetBtn.click();
            Thread.sleep(2000);

            WebElement productName = driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
            WebElement paymentInfo = driver.findElement(By.xpath("//div[contains(text(),'SauceCard #31337')]"));
            WebElement tax = driver.findElement(By.xpath("//div[@class='summary_tax_label']"));

            String pName = productName.getText();
            Assert.assertEquals(cellProductName.toString(), pName);

            String pInfo = paymentInfo.getText();
            Assert.assertEquals(cellPaymentInfo.toString(), pInfo);

            String t = tax.getText();
            Assert.assertEquals(cellTax.toString(), t);

            WebElement finishBtn = driver.findElement(By.xpath("//a[@class='btn_action cart_button']"));
            finishBtn.click();
            Thread.sleep(1000);
            driver.close();
        }

    }
}
