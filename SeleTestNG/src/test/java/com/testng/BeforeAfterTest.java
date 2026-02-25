package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterTest {
	//Runs once PER <test> in testng.xml (can cover many classes)
	WebDriver driver;
	@BeforeTest
	public void setUp() throws InterruptedException {
		System.out.println("Before Test -> Runs only once before all tests");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hackerrank.com/auth/login");
		Thread.sleep(5000);
	}
	@Test
	public void test1() throws InterruptedException {
		System.out.println("Test 1 running");
		driver.findElement(By.name("username")).sendKeys("vinayapratheeka333@gmail.com");
		Thread.sleep(2000);
	}
	@Test
	public void test2() throws InterruptedException {
		System.out.println("Test 2 running");
		driver.findElement(By.name("password")).sendKeys("Vinaya@2003");
		Thread.sleep(2000);
	}
	@AfterTest
	public void quit() {
		System.out.println("After Test -> Runs only once after all tests");
		driver.quit();
	}

}
