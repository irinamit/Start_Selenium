package com.selenium.tutorial.homeWork5;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DownloadHomework {
    @Test
    public void downloadFiles() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/download");

        List <WebElement> downloadAllFiles = driver.findElements(By.partialLinkText("download/"));
        for(WebElement c: downloadAllFiles){
            c.click();
            Thread.sleep(6000);
        }
        driver.quit();


    }

}

