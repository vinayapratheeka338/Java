package vinaya;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
 
import java.time.Duration;

import java.util.Set;
 
public class Ama1 {
 
    public static void main(String[] args) throws InterruptedException {
 
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
 
        try{

        	driver.get("https://www.amazon.com");

            driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");

            driver.findElement(By.id("nav-search-submit-button")).click();
 
         

            WebElement firstProduct = wait.until(

                    ExpectedConditions.elementToBeClickable(

                            By.cssSelector("div.s-main-slot div[data-component-type='s-search-result'] h2 a")));

            driver.findElement(By.xpath("//input[@data-action-type='DISMISS']")).click();
 
 
            firstProduct.click();

            driver.findElement(By.xpath("//input[@data-action-type='DISMISS']")).click();

           String mainWindow = driver.getWindowHandle();

            Set<String> windows = driver.getWindowHandles();
 
            for (String window : windows) {

                if (!window.equals(mainWindow)) {

                    driver.switchTo().window(window);

                }

            }
 
        

            wait.until(ExpectedConditions.elementToBeClickable(

                    By.id("add-to-cart-button"))).click();
 
         

            try {

                WebElement checkbox = wait.until(

                        ExpectedConditions.elementToBeClickable(

                                By.xpath("//input[@type='checkbox']")));

                if (!checkbox.isSelected()) {

                    checkbox.click();

                }

            } catch (Exception e) {

                System.out.println("No checkbox found - continuing...");

            }
 
          

            wait.until(ExpectedConditions.elementToBeClickable(

                    By.name("proceedToRetailCheckout"))).click();
 
      

            wait.until(ExpectedConditions.visibilityOfElementLocated(

                    By.id("ap_email"))).sendKeys("ashwiniashu70608@gmail.com");
 
            driver.findElement(By.id("continue")).click();
 
      

            wait.until(ExpectedConditions.visibilityOfElementLocated(

                    By.id("ap_password"))).sendKeys("Ashwini@13");
 
            driver.findElement(By.id("signInSubmit")).click();
 
         
 
        } catch (Exception e) {

            e.printStackTrace();

        }
 
        driver.quit();  

    }

}
 