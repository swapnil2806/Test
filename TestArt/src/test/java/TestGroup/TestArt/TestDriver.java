package TestGroup.TestArt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestDriver
{
	static WebDriver driver;
	public static WebDriver getDriver()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\swapnil.gangwal\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		return driver;
	}
	public static void main(String args[])
	{
		driver=getDriver();
		//String baseUrl = "http://automationpractice.com/index.php";
		String baseUrl = "http://automationpractice.com/index.php";
			
		driver.get(baseUrl);
		
		//driver.navigate().to("https://www.guru99.com/gecko-marionette-driver-selenium.html");
		
		//---- for practice ----- 
		System.out.println(driver.getTitle());
		System.out.println("Done");
		
		
	}
}
