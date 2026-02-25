package vinaya;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SkillAssistLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skill-assist.ai/Wipro/");
		Thread.sleep(2000);
		System.out.println("Title: "+driver.getTitle());
		driver.findElement(By.id("signin-email")).sendKeys("vinaya6300@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("signin-password")).sendKeys("Vinaya@2003");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/form/button")).click();
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
		driver.quit();

	}

}
