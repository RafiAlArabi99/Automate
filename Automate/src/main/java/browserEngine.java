import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserEngine {
	
public static WebDriver driver;
	
	
	public static WebDriver browserConfig()
	
	{

			//T001	Open Browser 

			System.setProperty("webdriver.chrome.driver", "C:\\JPM\\Demo03\\automcibc\\drivers\\chromedriver.exe");
			
			driver =new ChromeDriver();
			
			
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			return driver;
		
	
	}
		

}
