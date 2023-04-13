package com.selenium.tutorial.homeWork5;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InteractingWithElementsHomework {
    @Test
    public void addRemoveElements()throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        WebElement targetAddRemoveElement = driver.findElement(By.tagName("button"));
        targetAddRemoveElement.click();
        Thread.sleep(2000);
        WebElement targetAddRemoveElement2 = driver.findElement(By.tagName("button"));
        targetAddRemoveElement.click();
        Thread.sleep(2000);

        driver.quit();


    }
}
