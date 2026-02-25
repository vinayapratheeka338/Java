package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumWebsite {
	public static void main(String[] args) {
		String browser = "chrome";
		WebDriver driver = null;
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		
		try {
			driver.manage().window().maximize();
			driver.get("https://www.selenium.dev/");
			
			System.out.println("URL : " + driver.getCurrentUrl());
            System.out.println("Title : " + driver.getTitle());
			
           /* JavascriptExecutor js = (JavascriptExecutor) driver;

            // Scroll down
            js.executeScript("window.scrollBy(0,1000)");
            Thread.sleep(2000);

            js.executeScript("window.scrollBy(0,1000)");
            Thread.sleep(2000);

            // Scroll up
            js.executeScript("window.scrollTo(0,0)");
            Thread.sleep(2000);*/
         

            Actions actions = new Actions(driver);

            // Scroll down
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            Thread.sleep(2000);

            // Scroll down again
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            Thread.sleep(2000);

            // Scroll up
            actions.sendKeys(Keys.PAGE_UP).perform();
            Thread.sleep(2000);
            
            /*WebElement element = driver.findElement(By.xpath("//span[text()='News']"));
            Actions actions = new Actions(driver);
            actions.moveToElement(element).perform();*/
            
            /*Actions actions = new Actions(driver);
            actions.scrollByAmount(0, 800).perform();
            Thread.sleep(2000);*/
 
            String title = driver.getTitle();

            if (title.contains("Selenium"))
                System.out.println("Navigation Successful");
            else
                System.out.println("Navigation Failed");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			driver.quit();
		}
	}

}
