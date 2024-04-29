package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_CREATE_ACCOUNT = "/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a";
    public static final String XPATH_DAY = "//select[@id='day']";
    public static final String XPATH_MONTH = "//select[@id='month']";
    public static final String XPATH_YEAR = "//select[@id='year']";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        Thread.sleep(3000);

        WebElement acceptCookiesButton = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[4]/button[2]"));
        if (acceptCookiesButton.isDisplayed()) {
            acceptCookiesButton.click();
        }

        WebElement createAccount = driver.findElement(By.xpath(XPATH_CREATE_ACCOUNT));
        createAccount.click();

        Thread.sleep(3000);

        WebElement dayDropdown = driver.findElement(By.xpath(XPATH_DAY));
        Select daySelect = new Select(dayDropdown);
        daySelect.selectByVisibleText("17");

        WebElement monthDropdown = driver.findElement(By.xpath(XPATH_MONTH));
        Select monthSelect = new Select(monthDropdown);
        monthSelect.selectByVisibleText("sie");

        WebElement yearDropdown = driver.findElement(By.xpath(XPATH_YEAR));
        Select yearSelect = new Select(yearDropdown);
        yearSelect.selectByVisibleText("1989");
    }
}