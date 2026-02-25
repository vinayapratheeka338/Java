package vinaya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InstagramLogin {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		System.out.println("Title: "+driver.getCurrentUrl());
		driver.findElement(By.id("_R_32d9lplcldcpbn6b5ipamH1_")).sendKeys("vinaya_363");
		Thread.sleep(2000);
		driver.findElement(By.id("_R_33d9lplcldcpbn6b5ipamH1_")).sendKeys("Insta123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
