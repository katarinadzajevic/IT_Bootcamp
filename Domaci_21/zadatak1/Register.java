package zadatak1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Register {

    //UserInformation

    private static String userID = "username";
    private static String password = "password";
    private static String repeatPsw = "repeatedPassword";

    public static WebElement getUserID(WebDriver wd){
        return wd.findElement(By.name(userID));
    }
    public static WebElement getPassword(WebDriver wd){
        return wd.findElement(By.name(password));
    }
    public static WebElement getRepeatPsw(WebDriver wd){
        return wd.findElement(By.name(repeatPsw));
    }

    public static void setUserID(WebDriver wd, String id){
        getUserID(wd).sendKeys(id);
    }
    public static void setPassword(WebDriver wd, String password){
        getPassword(wd).sendKeys(password);
    }
    public static void setRepeatPsw(WebDriver wd, String repeatPsw){
        getRepeatPsw(wd).sendKeys(repeatPsw);
    }

    //Account information

    private static String firstName = "account.firstName";
    private static String lastName = "account.lastName";
    private static String email = "account.email";
    private static String phone = "account.phone";
    private static String address1 = "account.address1";
    private static String address2 = "account.address2";
    private static String city = "account.city";
    private static String state = "account.state";
    private static String zip = "account.zip";
    private static String country = "account.country";

    public static WebElement getFirstName(WebDriver wd) {
        return wd.findElement(By.name(firstName));
    }

    public static WebElement getLastName(WebDriver wd) {
        return wd.findElement(By.name(lastName));
    }

    public static WebElement getEmail(WebDriver wd) {
        return wd.findElement(By.name(email));
    }

    public static WebElement getPhone(WebDriver wd) {
        return wd.findElement(By.name(phone));
    }

    public static WebElement getAddress1(WebDriver wd) {
        return wd.findElement(By.name(address1));
    }

    public static WebElement getAddress2(WebDriver wd) {
        return wd.findElement(By.name(address2));
    }

    public static WebElement getCity(WebDriver wd) {
        return wd.findElement(By.name(city));
    }

    public static WebElement getState(WebDriver wd) {
        return wd.findElement(By.name(state));
    }

    public static WebElement getZip(WebDriver wd) {
        return wd.findElement(By.name(zip));
    }

    public static WebElement getCountry(WebDriver wd) {
        return wd.findElement(By.name(country));
    }

    public static void setFirstName(WebDriver wd, String firstName) {
        getFirstName(wd).sendKeys(firstName);
    }

    public static void setLastName(WebDriver wd, String lastName) {
        getLastName(wd).sendKeys(lastName);
    }

    public static void setEmail(WebDriver wd, String email) {
        getEmail(wd).sendKeys(email);
    }

    public static void setPhone(WebDriver wd, String phone) {
        getPhone(wd).sendKeys(phone);
    }

    public static void setAddress1(WebDriver wd, String address1) {
        getAddress1(wd).sendKeys(address1);
    }

    public static void setAddress2(WebDriver wd, String address2) {
        getAddress2(wd).sendKeys(address2);
    }

    public static void setCity(WebDriver wd, String city) {
        getCity(wd).sendKeys(city);
    }

    public static void setState(WebDriver wd, String state) {
        getState(wd).sendKeys(state);
    }

    public static void setZip(WebDriver wd, String zip) {
        getZip(wd).sendKeys(zip);
    }

    public static void setCountry(WebDriver wd, String country) {
        getCountry(wd).sendKeys(country);
    }

    //ProfileInformation

    private static String languagePreferencesXpath = "//select[@name='account.languagePreference']";
    private static String favouriteCategoryXpath = "//select[@name='account.favouriteCategoryId']";
    private static String enableMyListXpath = "//input[@name='account.listOption']";
    private static String enableMyBannerXpath = "//input[@name='account.bannerOption']";

    public static WebElement getLanguagePreferences(WebDriver wd) {
        return wd.findElement(By.xpath(languagePreferencesXpath));

    }
    public static void setLanguagePreferences(WebDriver wd) {
        getLanguagePreferences(wd).click();
        Select drpLanguage = new Select(getLanguagePreferences(wd));
        drpLanguage.selectByVisibleText("english");
    }

    public static WebElement getFavouriteCategory(WebDriver driver){
        return  driver.findElement(By.xpath(favouriteCategoryXpath));
    }
    public static void setFavouriteCategory(WebDriver driver){
        getFavouriteCategory(driver).click();
        Select favCategory = new Select(getFavouriteCategory(driver));
        favCategory.selectByVisibleText("DOGS");
    }
    public static WebElement getEnableMyListPath(WebDriver driver){
        return driver.findElement(By.xpath(enableMyListXpath));
    }
    public static void setEnableMyListXpath(WebDriver driver){
        getEnableMyListPath(driver).click();
    }
    public static WebElement getEnableMyBAnner(WebDriver driver){
        return driver.findElement(By.xpath(enableMyBannerXpath));
    }
    public static void setEnableMyBanner(WebDriver driver){
        getEnableMyBAnner(driver).click();
    }

    //Save account information button

    private static String submitBtnXpath = "//input[@name='newAccount']";

    public static WebElement getAccountInfoButton(WebDriver driver){
        return driver.findElement(By.xpath(submitBtnXpath));
    }
    public static void clickAccountInfoBtn(WebDriver driver){
        getAccountInfoButton(driver).click();
    }

}