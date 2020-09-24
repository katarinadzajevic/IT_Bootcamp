package zadatak1;
//Koristeci Selenium webdriver otici na sajt https://www.techlistic.com/p/selenium-practice-form.html
// i popuniti formu
//Potrudite se da koristite vise nacina (lokatora) za pronalazenje elemenata.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/home/katarina/Jars/webdriver/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().window().maximize();

        WebElement name = driver.findElement(By.name("firstname"));
        WebElement lastName = driver.findElement(By.name("lastname"));
        WebElement femaleCheckBox = driver.findElement(By.xpath("//input[@id='sex-1']"));
        WebElement yearsExp1 = driver.findElement(By.cssSelector("#exp-0"));
        WebElement date = driver.findElement(By.id("datepicker"));
        WebElement proffesion = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[21]/input[2]"));
        WebElement automationTools = driver.findElement(By.xpath("//input[@id='tool-2']"));
        WebElement continent = driver.findElement(By.xpath("//select[@id='continents']"));
        WebElement europe = driver.findElement(By.xpath("//option[contains(text(),'Europe')]"));
        WebElement btn = driver.findElement(By.xpath("//button[@id='submit']"));

        name.sendKeys("Katarina");
        lastName.sendKeys("Dzajevic");
        femaleCheckBox.click();
        yearsExp1.click();
        date.sendKeys("12-12-1992");
        proffesion.click();
        automationTools.click();
        continent.click();
        europe.click();
        btn.click();
        driver.close();


    }


    
}
