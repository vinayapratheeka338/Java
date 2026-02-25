package vinaya;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class YahooLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("http://in.mail.yahoo.com");
		System.out.println("Title: "+driver.getCurrentUrl());
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//click on signin
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Sign in']"))).click();
		Thread.sleep(1000);
		//enter username
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-username"))).sendKeys("bhumi_vinaya");
		Thread.sleep(1000);
		//click on next
		wait.until(ExpectedConditions.elementToBeClickable(By.id("login-signin"))).click();
		Thread.sleep(1000);
		//enter password
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-passwd"))).sendKeys("Vinaya@2003");
		Thread.sleep(1000);
		//click on next
		wait.until(ExpectedConditions.elementToBeClickable(By.id("login-signin"))).click();
		Thread.sleep(1000);
		driver.quit();*/
		
		
		driver.get("https://login.yahoo.com/");
		Thread.sleep(1000);
		System.out.println("Title: " +driver.getCurrentUrl());
		driver.findElement(By.id("login-username")).sendKeys("bhumi_vinaya@yahoo.com");
		Thread.sleep(1000);
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("login-passwd")).sendKeys("Vinaya@2003");
		Thread.sleep(1000);
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[@aria-label='Check your mail']")).click();
		driver.findElement(By.id("ybarMailLink")).click();
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		for(int i=0;i<3;i++) {
			action.sendKeys(Keys.PAGE_DOWN).perform();
			Thread.sleep(1000);
		}
		driver.quit();
	}

}
