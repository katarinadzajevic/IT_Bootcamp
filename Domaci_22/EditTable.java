import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditTable {
    //Na stranici https://demoqa.com/webtables :
    //- obrisati 2 od 3 postojece tabele
    //- preostalu tabelu editovati sa random parametrima
    //- napraviti jednu tabelu sa svojim random parametrima
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");
        driver.manage().window().maximize();

        //Delete two rows

        WebElement delFirstRow = driver.findElement(By.xpath("//span[@id='delete-record-1']//*[local-name()='svg']//*[name()='path' and contains(@d,'M864 256H7')]"));
        delFirstRow.click();
        WebElement delSecRow = driver.findElement(By.xpath("//span[@id='delete-record-2']//*[local-name()='svg']//*[name()='path' and contains(@d,'M864 256H7')]"));
        delSecRow.click();

        //edit row

        WebElement editBtn = driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M880 836H1')]"));
        editBtn.click();

        String firstNameXpath = "//input[@id='firstName']";
        String lastNameXpath = "//input[@id='lastName']";
        String emailXpath = "//input[@id='userEmail']";
        String ageXpath = "//input[@id='age']";
        String salaryNameXpath = "//input[@id='salary']";
        String departmentNameXpath = "//input[@id='department']";

        WebElement fName = driver.findElement(By.xpath(firstNameXpath));
        WebElement lName = driver.findElement(By.xpath(lastNameXpath));
        WebElement email = driver.findElement(By.xpath(emailXpath));
        WebElement age = driver.findElement(By.xpath(ageXpath));
        WebElement salary = driver.findElement(By.xpath(salaryNameXpath));
        WebElement department = driver.findElement(By.xpath(departmentNameXpath));
        WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));

        fName.clear();
        fName.sendKeys("Katarina");
        lName.clear();
        lName.sendKeys("Dzajevic");
        email.clear();
        email.sendKeys("kaca@gmail.com");
        age.clear();
        age.sendKeys("28");
        salary.clear();
        salary.sendKeys("45000");
        department.clear();
        department.sendKeys("Ilegal");
        submit.click();


        //add data in table

        for (int i = 0; i < 5; i++) {
            WebElement add = driver.findElement(By.xpath("//button[@id='addNewRecordButton']"));
            add.click();
            WebElement fName1 = driver.findElement(By.xpath(firstNameXpath));
            WebElement lName1 = driver.findElement(By.xpath(lastNameXpath));
            WebElement email1 = driver.findElement(By.xpath(emailXpath));
            WebElement age1= driver.findElement(By.xpath(ageXpath));
            WebElement salary1 = driver.findElement(By.xpath(salaryNameXpath));
            WebElement department1 = driver.findElement(By.xpath(departmentNameXpath));
            WebElement submit1 = driver.findElement(By.xpath("//button[@id='submit']"));
            fName1.click();
            fName1.sendKeys("Kaca" + i);
            lName1.click();
            lName1.sendKeys("Dzajevic" + i);
            email1.click();
            email1.sendKeys(i+"kaca@gmail.com");
            age1.click();
            age1.sendKeys("28");
            salary1.click();
            salary1.sendKeys("4500" + i);
            department1.click();
            department1.sendKeys("legal"+ i);
            submit1.click();
        }
    }
}
