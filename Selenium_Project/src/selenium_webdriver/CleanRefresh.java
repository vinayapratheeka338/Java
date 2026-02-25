package selenium_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CleanRefresh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		try {
		
			driver.manage().deleteAllCookies();  //Cleans-no cache
			driver.manage().window().maximize();
		
			driver.get("https://skill-assist.ai/Wipro/");
			Thread.sleep(2000);
			
			String url = driver.getCurrentUrl();
			System.out.println("URL : "+url);
			
			String title = driver.getTitle();
			System.out.println("Title : "+title);
			
			if(title.contains("Techademy") && url.contains("skill-assist")) {
				System.out.println("Pass");
			}
			else {
				System.out.println("Fail");
			}
		}catch(Exception e) {
			System.out.println("Exception : " +e.getLocalizedMessage());
		}finally {
			driver.navigate().refresh(); //refreshes page
			driver.quit();
		}
	}
}
