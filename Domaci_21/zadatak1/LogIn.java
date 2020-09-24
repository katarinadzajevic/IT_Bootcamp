package zadatak1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn {

    private static String registerNowXpath = "//a[contains(text(),'Register Now!')]";
    private static String logInBtn = "//input[@name='signon']";


    public static WebElement getRegisterNowElement(WebDriver wd) {
        return wd.findElement(By.xpath(registerNowXpath));
    }

    public static void clickRegisterNow(WebDriver wd) {
        getRegisterNowElement(wd).click();
    }


    public static WebElement getUsername(WebDriver driver) {
        return driver.findElement(By.name("username"));
    }

    public static void setUsername(WebDriver driver) {
        getUsername(driver).sendKeys("Kaca_K");
    }

    public static WebElement getPassword(WebDriver driver) {
        return driver.findElement(By.name("password"));
    }

    public static void setPassword(WebDriver driver) {
        getPassword(driver).clear();
        getPassword(driver).sendKeys("12345789");
    }

    public static void clickLoginBtn(WebDriver driver) {
        driver.findElement(By.xpath(logInBtn)).click();
    }

}
