import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class SortButtons {
    //Sortirati dugmice obrnutim redosledom sa stranice https://demoqa.com/sortable (iz opcije grid)

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/sortable");

        String btn1Xpath = "//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][contains(text(),'One')]";
        String btn2Xpath = "//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][contains(text(),'Two')]";
        String btn3Xpath = "//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][contains(text(),'Three')]";
        String btn4Xpath = "//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][contains(text(),'Four')]";
        String btn5Xpath = "//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][contains(text(),'Five')]";
        String btn6Xpath = "//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][contains(text(),'Six')]";
        String btn7Xpath = "//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][contains(text(),'Seven')]";
        String btn8Xpath = "//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][contains(text(),'Eight')]";
        String btn9Xpath = "//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][contains(text(),'Nine')]";

        WebElement grid = driver.findElement(By.xpath("//a[@id='demo-tab-grid']"));
        grid.click();

        WebElement btn1 = driver.findElement(By.xpath(btn1Xpath));
        WebElement btn2 = driver.findElement(By.xpath(btn2Xpath));
        WebElement btn3 = driver.findElement(By.xpath(btn3Xpath));
        WebElement btn4 = driver.findElement(By.xpath(btn4Xpath));
        WebElement btn5 = driver.findElement(By.xpath(btn5Xpath));
        WebElement btn6 = driver.findElement(By.xpath(btn6Xpath));
        WebElement btn7 = driver.findElement(By.xpath(btn7Xpath));
        WebElement btn8 = driver.findElement(By.xpath(btn8Xpath));
        WebElement btn9 = driver.findElement(By.xpath(btn9Xpath));

        WebElement[] elements = {btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9};

        for (int i = 8; i > 0; i--) {

            Actions actions = new Actions(driver);
            actions.dragAndDrop(elements[0], elements[i]).build().perform();


        }


    }
}
