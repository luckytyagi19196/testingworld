import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class InitiateDriver
{
	public Login login;
	public WebDriver driver;
	@BeforeMethod
	public void startBrowser()
	{
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
     driver = new ChromeDriver();
     driver.get("https://thetestingworld.com/");
     login = new Login(driver);
	}
	
}

