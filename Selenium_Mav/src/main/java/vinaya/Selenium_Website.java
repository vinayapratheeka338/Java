package vinaya;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Website {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/");

        Thread.sleep(2000);

        // Scroll down using keyboard
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        // Scroll till About and click it
        WebElement about = driver.findElement(By.xpath("//span[text()='About']"));
        actions.moveToElement(about).perform();
        about.click();

        Thread.sleep(2000);

        System.out.println("Successfully navigated to About section");

        driver.quit();
    }
}
