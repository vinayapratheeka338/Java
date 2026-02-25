package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_Window {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.cssSelector("#content > ul > li:nth-child(22) > a")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > a")).click();
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		
		driver.quit();

	}

}
