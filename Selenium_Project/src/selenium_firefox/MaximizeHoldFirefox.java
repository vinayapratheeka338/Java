package selenium_firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MaximizeHoldFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		try {
			//driver.manage().window().fullscreen();
			driver.manage().window().maximize();
			driver.get("https://skill-assist.ai/Wipro/");
			Thread.sleep(3000);
		
			String title = driver.getTitle();
			System.out.println("Page Title: "+title);
		
			if(title.contains("Techademy")) {
				System.out.println("Test Pass");
			}
			else {
				System.out.println("Test Fail");
			}
		}
		catch(Exception e) {
			System.out.println("Exception occured : " +e.getMessage());
		}
		finally {
			driver.quit();
		}
	}
}
