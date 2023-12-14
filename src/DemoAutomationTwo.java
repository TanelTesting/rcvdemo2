import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutomationTwo {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Browserdrivers -isetegin\\chromedriver-win64"); 
		
		ChromeDriver driver = new ChromeDriver(); 
		
		//driver.get("http://www.google.com"); 		
		driver.get("http://www.ebay.com");
		driver.manage().window().maximize(); 
		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("mobile");
		driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click(); 
		//driver.close(); 
		//driver.quit(); 
		
		
		
		
		
		
	}

}
