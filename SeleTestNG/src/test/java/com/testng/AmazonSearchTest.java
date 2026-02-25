package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonSearchTest {

    @Test
    public void searchMobile() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in");
        Thread.sleep(3000);
        //click on sign in
        driver.findElement(By.id("nav-link-accountList")).click();
        Thread.sleep(1500);
        //enter mobile number
        driver.findElement(By.id("ap_email_login")).sendKeys("6300724445");
        Thread.sleep(1500);
        //click continue
        driver.findElement(By.className("a-button-input")).click();
        Thread.sleep(1500);
        //enter password
        driver.findElement(By.id("ap_password")).sendKeys("Amazon@123");
        Thread.sleep(1500);
        //click on login
        driver.findElement(By.id("auth-signin-button")).click();
        Thread.sleep(1500);
        //searches
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
        Thread.sleep(1500);
        //click on search
        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(1500);
        System.out.println("Search executed");

        driver.quit();
    }
}
