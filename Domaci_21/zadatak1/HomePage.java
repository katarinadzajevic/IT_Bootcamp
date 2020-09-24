package zadatak1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    public static String url = "https://petstore.octoperf.com";
    private static String enterTheStoreXpath = "//a[contains(text(),'Enter the Store')]";

    public static void clickEnterTheStoreElem(WebDriver wd){
        WebElement enterTheStore =  wd.findElement(By.xpath(enterTheStoreXpath));
        enterTheStore.click();
    }
}
