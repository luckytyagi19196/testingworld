import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Registration 
{
	public WebDriver driver=null;
	public Registration(WebDriver driver)
	{
		this.driver =driver;
	}
public void registrationLink()
{
	driver.findElement(By.xpath("//a[text()='Registration ']")).click();
}
public void regName()
{
	driver.findElement(By.xpath("//input[@id='jform_name']")).sendKeys("lucky");
}
public void regUserName()
{
	driver.findElement(By.xpath("//input[@id='jform_username']")).sendKeys("luckytyagi19198");
}
public void regPassword()
{
	driver.findElement(By.xpath("//input[@id='jform_password1']")).sendKeys("luckytyagi19198");
}
public void regConfirmPassword()
{
	driver.findElement(By.xpath("//input[@id='jform_password2']")).sendKeys("luckytyagi19198");
}
public void regEmailAdd()
{
	driver.findElement(By.xpath("//input[@id='jform_email1']")).sendKeys("luckytyagi19198");
}
public void regConfirmEmailAdd() throws IOException
{
	driver.findElement(By.xpath("//input[@id='jform_email2']")).sendKeys("luckytyagi19198");
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File("./Screenshot/image.png"));
}
}
