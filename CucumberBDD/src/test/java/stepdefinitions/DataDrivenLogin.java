package stepdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenLogin {
WebDriver driver;
	
	@Given("User launches the browser")
	public void launch_the_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@When("User opens the login page")
    public void open_the_login_page() {
        driver.get("https://www.saucedemo.com/");
    }

	@And("User enters credentials and click on login")
	public void enters_credentials(DataTable table) throws InterruptedException {

	    List<List<String>> data = table.asLists();

	    for (List<String> row : data) {
	        String username = row.get(0);
	        String password = row.get(1);

	        driver.findElement(By.id("user-name")).clear();
	        driver.findElement(By.id("user-name")).sendKeys(username);
	        Thread.sleep(1000);
	        driver.findElement(By.id("password")).clear();
	        driver.findElement(By.id("password")).sendKeys(password);
	        Thread.sleep(1000);
	        driver.findElement(By.id("login-button")).click();
	        driver.navigate().back();
	    }
	}

    @Then("User should be redirected to newpage")
    public void user_should_be_redirected() {
        System.out.println("Login successful");
        driver.quit();
    }
}

