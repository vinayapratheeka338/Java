package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriResume {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.naukri.com");
        Thread.sleep(3000);

        // Click Login
        driver.findElement(By.id("login_Layer")).click();
        Thread.sleep(3000);

        // Enter email
        driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("vinayapratheeka333@gmail.com");
        Thread.sleep(2000);

        // Enter password
        driver.findElement(By.xpath("//input[@type='password']"))
              .sendKeys("Vinaya@2003");
        Thread.sleep(2000);

        // Click Login button
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        //driver.findElement(By.className("btn-primary")).click();
        //driver.findElement(By.xpath("//button[]")).click();
        Thread.sleep(5000);

        // Click profile icon
        driver.findElement(By.xpath("//div[contains(@class,'nI-gNb-drawer__icon')]")).click();
        Thread.sleep(2000);

        // Click View Profile
        driver.findElement(By.className("nI-gNb-info__sub-link")).click();
        Thread.sleep(4000);
        
        // Scroll a bit down
        driver.findElement(By.tagName("body")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(3000);

        // Upload resume
        WebElement upload = driver.findElement(By.xpath("//input[@type='file']"));
        upload.sendKeys("C:\\Users\\HP\\OneDrive\\Desktop\\Desktop\\my_pro\\Vinaya_resume.pdf");
        Thread.sleep(3000);

        System.out.println("Resume uploaded successfully");

        driver.quit();
    }
}
