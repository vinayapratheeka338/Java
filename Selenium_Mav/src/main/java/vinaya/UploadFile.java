package vinaya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		Thread.sleep(2000);
		WebElement upload = driver.findElement(By.id("file-upload"));
		upload.sendKeys("C:\\Users\\HP\\OneDrive\\Desktop\\Classes\\Portal Assessments\\SQL\\SDET- Daily Assignment- Day 19 Q3 Solution.pdf");
		Thread.sleep(2000);
		driver.findElement(By.id("file-submit")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}