package vinaya;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("Title: "+driver.getTitle());
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//enter username
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']"))).sendKeys("Admin");
		Thread.sleep(2000);
		//enter password
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']"))).sendKeys("admin123");
		Thread.sleep(2000);
		//click login
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
		Thread.sleep(2000);
		//click on Admin
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Admin']"))).click();
		Thread.sleep(2000);
		//click on add(+)
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Add']"))).click();
		Thread.sleep(2000);
		//click on select for user role
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='oxd-select-text-input']"))).click();
		Thread.sleep(2000);
		//click on option in dropdown
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[normalize-space()='Admin']"))).click();
		Thread.sleep(2000);
		//click on employee name
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Type for hints...']"))).click();
		Thread.sleep(2000);
		//
		//click on status
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Enabled']"))).click();
		Thread.sleep(2000);
		
		
		
		
		driver.quit();
		
	}

}
