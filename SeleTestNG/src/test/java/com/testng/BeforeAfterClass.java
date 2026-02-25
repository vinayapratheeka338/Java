package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeAfterClass {
	//Runs once PER JAVA CLASS
	WebDriver driver;
	@BeforeClass
	public void setUpOnce() {
		System.out.println("Before Class -> runs only once before tests ");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skill-assist.ai/Wipro/");
	}
	@Test
	public void test1() throws InterruptedException {
		System.out.println("Test 1 running");
		//Login
		driver.findElement(By.id("signin-email")).sendKeys("vinaya6300@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("signin-password")).sendKeys("Vinaya@2003");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/form/button")).click();
		Thread.sleep(2000);
	}
	@Test
	public void test2() throws InterruptedException {
		System.out.println("Test 2 running");
		//go to my learning
		driver.findElement(By.id("radix-:r2:-trigger-enrollments")).click();
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
	}
	@AfterClass
	public void quit() {
		System.out.println("After Class -> runs only once after tests");
        driver.quit();
	}
	

}
