package com.selenium.tutorial.homeWork5;

import com.beust.ah.A;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class inputsHomework {
    @Test
    public void downloadFiles() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/inputs");


        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofMillis(500L));
        WebElement number = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='number']")));
        number.sendKeys("1");
             
        driver.quit();
    }

}
