package vinaya;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonUsecase {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Step 1: Log in to the account
		wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-link-accountList"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_email_login")))
				.sendKeys("6300724445");

		wait.until(ExpectedConditions.elementToBeClickable(By.id("continue"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_password")))
				.sendKeys("Amazon@123");

		wait.until(ExpectedConditions.elementToBeClickable(By.id("auth-signin-button"))).click();

		// Step 2: Select the category
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-hamburger-menu"))).click();
		//WebElement category = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@aria-label='Open All Categories Menu']")));

		//scroll
		Actions actions = new Actions(driver);
		//for(int i = 0; i < 3; i++) {
		    actions.sendKeys(Keys.PAGE_DOWN).perform();
		//}

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='TV, Appliances, Electronics']")
		    	)).click();
		
		// Step 3: Search for Product
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")))
				.sendKeys("laptop");

		wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-search-submit-button"))).click();

		// Step 4: Add the product to the cart
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("(//button[@aria-label='Add to cart'])[1]"))).click();

		// Step 5: Checkout
		wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-cart"))).click();

		wait.until(ExpectedConditions.elementToBeClickable(
				By.name("proceedToRetailCheckout"))).click();

		// Step 6: Log out of your account
		wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-checkout-cart-icon"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-link-accountList"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//span[text()='Sign Out']"))).click();

		// Step 7: Close all the tabs successfully
		driver.quit();
	}
}

