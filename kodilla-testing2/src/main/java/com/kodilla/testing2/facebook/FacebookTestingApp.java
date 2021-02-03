package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_COOKIES = "//div[contains(@class, \"_9fiw\")]/button[2]";
    public static final String XPATH_NEW_ACCOUNT = "//div[contains(@class, \"_6ltg\")]/a";
    public static final String XPATH_DAY = "//span[@data-name=\"birthday_wrapper\"]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://facebook.com");

        WebElement searchField = driver.findElement(By.xpath(XPATH_COOKIES));
        searchField.click();

        WebElement newAccount = driver.findElement(By.xpath(XPATH_NEW_ACCOUNT));
        newAccount.click();

        while (!driver.findElement(By.xpath(XPATH_DAY)).isDisplayed());
        WebElement day = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(day);
        selectDay.selectByIndex(21);
    }
}
