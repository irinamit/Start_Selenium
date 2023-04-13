package com.selenium.tutorial.homeWork5;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ChallengingHomework {
    @Test
    public void testingChallenging()  {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/challenging_dom");

        driver.manage().timeouts().setScriptTimeout(10000,TimeUnit.SECONDS);

        WebElement buttons = driver.findElement(By.xpath("//a[@class='button']"));

        buttons.click();

        WebElement buttons1 = driver.findElement(By.xpath("//a[@class='button alert']"));

        buttons1.click();


        WebElement buttons2 = driver.findElement(By.xpath("//a[@class='button success']"));
        buttons2.click();

        driver.quit();
    }



}