package selenium_edgedriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MaximiseHoldEdge {
	public static void main(String[] args) {
		WebDriver d = new EdgeDriver();
		try {
			d.manage().window().maximize();
			//d.get("https://www.amazon.in");
			d.navigate().to("https://www.amazon.com");
			Thread.sleep(3000);
			
			String title = d.getTitle();
			System.out.println("Page Title:" + title);
			
			if(title.contains("Amazon")){
				System.out.println("Test Pass");
			}
			else {
				System.out.println("Test Fail");
			}
			
		}
		catch(Exception e) {
			System.out.println("Exception occured : "+e.getMessage());
		}
		finally {
			d.quit();
		}
	}

}
