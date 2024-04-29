package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class FacebookTestingApp {

    public static final String XPATH_CREATE_ACCOUNT = "//a[text()='Utwórz nowe konto']";
    public static final String XPATH_DAY = "//select[@id='day']";
    public static final String XPATH_MONTH = "//select[@id='month']";
    public static final String XPATH_YEAR = "//select[@id='year']";


    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.facebook.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        WebElement acceptCookiesButton = driver.findElement(By.xpath("  //*[@id=\"u_0_k_+8\"]"));
        if (acceptCookiesButton.isDisplayed()) {
            acceptCookiesButton.click();
        }

        WebElement createAccount = driver.findElement(By.xpath(XPATH_CREATE_ACCOUNT));
        createAccount.click();

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