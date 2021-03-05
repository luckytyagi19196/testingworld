import java.io.File;
import java.io.IOException;

import javax.swing.Action;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Login
{
	public WebDriver driver=null;
	public Login(WebDriver driver)
	{
		this.driver= driver;
	}
public void loginLink() throws InterruptedException
{
	driver.findElement(By.xpath("//a[text()='Login']")).click();
	Thread.sleep(3000);
}
public void userName(String userName)
{

	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(userName);

	Assert.assertEquals("sunilkumar1232","sunilkumar1232");
	System.out.println("error");
	
}
public void password(String password)
{
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
}
public void checkBox()
{
	driver.findElement(By.xpath("//input[@id='remember']")).click();
}
public void loginbtn()
{
	driver.findElement(By.xpath("//button[text()='Log in']")).click();
}
public void home()
{
	driver.findElement(By.xpath("//a[@href='https://thetestingworld.com/'and@title='Home']")).click();
}
public void aboutUs()
{
	Actions action =new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//span[text()='ABOUT US']"))).build().perform();
	driver.findElement(By.xpath("//span[text()='Mission & Vision']")).click();
	driver.navigate().back();	
}
public void training()
{
	Actions action =new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//span[text()='TRAINING']"))).build().perform();
	action.moveToElement(driver.findElement(By.xpath("//span[text()='CAMPUS TRAINING']"))).build().perform();
}
public void contactUs()
{
	driver.findElement(By.xpath("//span[text()='Contact Us']")).click();
}
public void contactName(String name)
{
	driver.findElement(By.xpath("//input[@id='jform_contact_name']")).sendKeys(name);
}
public void contactEmail(String userEmail)
{
driver.findElement(By.xpath("//input[@id='jform_contact_email']")).sendKeys(userEmail);;
}
public void contactSubject(String sub)
{
	driver.findElement(By.xpath("//input[@id='jform_contact_emailmsg']")).sendKeys(sub);;
}
public void contactMessage(String msg)
{
	driver.findElement(By.xpath("//textarea[@id='jform_contact_message']")).sendKeys(msg);
}
public void contactCheckbox() throws IOException
{
	driver.findElement(By.xpath("//input[@id='jform_contact_email_copy']")).click();
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File("./Screenshot/image.png"));
}
}