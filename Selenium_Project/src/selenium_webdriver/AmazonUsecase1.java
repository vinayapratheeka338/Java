package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonUsecase1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.amazon.in");

        Thread.sleep(2000);

        // Step 1: Login
        driver.findElement(By.id("nav-link-accountList")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("ap_email_login")).sendKeys("6300724445");
        Thread.sleep(2000);

        driver.findElement(By.id("continue")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("ap_password")).sendKeys("Amazon@123");
        Thread.sleep(2000);

        driver.findElement(By.id("auth-signin-button")).click();
        Thread.sleep(3000);

        // Step 2: Open Hamburger Menu
        driver.findElement(By.id("nav-hamburger-menu")).click();
        Thread.sleep(2000);

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);

        // Click TV, Appliances, Electronics
        driver.findElement(By.xpath("//div[text()='TV, Appliances, Electronics']")).click();
        Thread.sleep(2000);

        // Click All Electronics
        driver.findElement(
        	    By.xpath("//div[contains(@class,'hmenu-visible')]//a[normalize-space()='All Electronics']")).sendKeys(Keys.ENTER);
        	Thread.sleep(3000);


        // Click Laptops & Accessories
        driver.findElement(By.xpath("//span[text()='Laptops & Accessories']")).click();
        Thread.sleep(2000);

        // Click Laptops
        driver.findElement(By.xpath("//span[text()='Laptops']")).click();
        Thread.sleep(3000);

        // Step 3: Scroll down to view laptops
        for(int i = 0; i < 5; i++) {
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            Thread.sleep(1000);
        }

        // Step 4: Add first laptop to cart
        driver.findElement(By.xpath("(//button[@aria-label='Add to cart'])[1]")).click();
        Thread.sleep(3000);

        // Step 5: Go to cart
        driver.findElement(By.id("nav-cart")).click();
        Thread.sleep(3000);

        // Step 6: Logout
        driver.findElement(By.id("nav-link-accountList")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[text()='Sign Out']")).click();
        Thread.sleep(2000);

        // Step 7: Close browser
        driver.quit();
    }
}
