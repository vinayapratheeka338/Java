package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BeforeAfterMethodsExample {

    WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        System.out.println("Before Method -> Runs before every test");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

    @Test
    public void testOne() {
        System.out.println("Executing Test One");
        System.out.println("Title: " + driver.getTitle());
    }

    @Test
    public void testTwo() {
        System.out.println("Executing Test Two");
        System.out.println("URL: " + driver.getCurrentUrl());
    }

    @AfterMethod
    public void closeBrowser() {
        System.out.println("AfterMethod -> Runs after every test");
        driver.quit();
    }
}
