package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assessment1 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        // Launch Chrome browser
        driver = new ChromeDriver();

        // Maximize window
        driver.manage().window().maximize();

        // Navigate to login page
        driver.get("https://the-internet.herokuapp.com/login");
    }

    @Test
    public void verifySuccessfulLogin() {

        // Locate username using By.id
        driver.findElement(By.id("username"))
                .sendKeys("tomsmith");

        // Locate password using By.name
        driver.findElement(By.name("password"))
                .sendKeys("SuperSecretPassword!");

        // Locate login button using By.xpath
        driver.findElement(By.xpath("//button[@type='submit']"))
                .click();

        // Capture success message after login
        String successMessage = driver.findElement(By.id("flash"))
                .getText();

        // Validate using TestNG Assert
        Assert.assertTrue(
                successMessage.contains("You logged into a secure area"),
                "Login was not successful!"
        );
    }

    @AfterMethod
    public void tearDown() {

        // Close browser
        driver.quit();
    }
}
