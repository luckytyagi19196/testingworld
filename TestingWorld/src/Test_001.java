import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Test_001 extends InitiateDriver
{
	@Test(priority=1)
public void login_test() throws InterruptedException, IOException {
	
	login.loginLink();
	//Thread.sleep(3000);
	login.userName("sunilkumar1232");
	login.password("Lucky@123");
	login.checkBox();
	login.loginbtn();
	login.home();
	login.aboutUs();
	login.training(); 
	login.contactUs();
	login.contactName("lucky");
	login.contactEmail("lucky@appsquadz.com");
	login.contactSubject("maths");
	login.contactMessage("hello user");
	login.contactCheckbox();
	
//	CaptureScreenshot.takeScreenshot(driver,"error");
	
}
	@Test(priority=2)
	public void registration_test() throws IOException
	{
		Registration registration = new Registration(driver);
		registration.registrationLink();
		registration.regName();
		registration.regUserName();
		registration.regPassword();
		registration.regConfirmPassword();
		registration.regEmailAdd();
		registration.regConfirmEmailAdd();
		
	}
	
}
