package com.selenium.tutorial.homeWork5;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadHomework {
    @Test
    public void uploadPics() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement chooseFile = driver.findElement(By.id("file-upload"));
        try {
            chooseFile.sendKeys("C:\\Users\\valen\\IdeaProjects\\Start_Selenium\\src\\test\\java\\com\\selenium\\tutorial\\1.jpg");
            driver.findElement(By.id("file-submit")).click();
            Thread.sleep(1000);
        } catch (InvalidArgumentException e) {
            System.out.println(e.getLocalizedMessage());
        } finally {
            driver.quit();
        }
    }
}
