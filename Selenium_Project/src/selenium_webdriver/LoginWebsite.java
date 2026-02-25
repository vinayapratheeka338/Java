package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWebsite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		//By id
		driver.findElement(By.id("user-name")).sendKeys("error_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		//By name
		/*driver.findElement(By.name("user-name")).sendKeys("visual_user");
		driver.findElement(By.name("password")).sendKeys("secret");
		driver.findElement(By.name("login-button")).click();*/
		
		//By classname
		/*driver.findElement(By.className("input_error")).sendKeys("standard_user");
		driver.findElement(By.className("input_error")).sendKeys("secret_secret");
		driver.findElement(By.className("submit-button")).click();*/
		/*driver.findElement(By.className("input_error")).sendKeys("standard_user");
		driver.findElement(By.className("form_input")).sendKeys("secret_secret");
		driver.findElement(By.className("btn_action")).click();*/
		
		//By xpath
		/*driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("problem_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();*/
		
		Thread.sleep(3000);
		driver.quit();

	}

}
