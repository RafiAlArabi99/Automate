import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T01_homePage 
{
	// Call Selenium WebDRiver 
	
	public static WebDriver driver; 
	
	@BeforeMethod 
	
	public static void openBrowser()
	
	{
		// open Chrome Browser 
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\forum2023_Sun\\automation\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		// Maximize the windoiws 
		
		driver.manage().window().maximize();
		
		// delete cookies from the browser 
		driver.manage().deleteAllCookies();
		
	}

	
	@Test 
	 public static void homepageValidation()
	 {
		
		driver.get("https://forum.digitalpoint.tech/");
	 }
	

	@AfterMethod 
	
	public static void closeBrowser()
	
	{
		
		//closing the browser 
		
		//driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
