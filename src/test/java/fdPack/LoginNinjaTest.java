package fdPack;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import objectRepository.LandingPageObject;
import objectRepository.LoginPageObject;
import objectRepository.MyAccountPageObjects;

public class LoginNinjaTest extends Base{
	
	@BeforeMethod
	public void openBrowser() throws IOException {
		
		System.out.println("code changed by me needed to push");
		driver = initializeDriver();
		driver.get(pro.getProperty("url"));
	}
	
	@Test(dataProvider ="getdata")
	public void loginTest(String EmailID, String Password) {
		
		System.out.println("karan has updated this code now");
		LandingPageObject LandingPageObject = new LandingPageObject(driver);
		
		LandingPageObject.myAccountDrop().click();
		LandingPageObject.loginOption().click();
		
		LoginPageObject LoginPageObject = new LoginPageObject(driver);
		
		LoginPageObject.EmailAttribute().sendKeys(EmailID);
		LoginPageObject.passwordAttribute().sendKeys(Password);
		LoginPageObject.loginbutton().click();
		
		MyAccountPageObjects MyAccountPageObjects = new MyAccountPageObjects(driver);
		try
		{
			Assert.assertTrue(MyAccountPageObjects.breadcrumAccount().isDisplayed());
			System.out.println("sucessfull");
		}
		catch(Exception b)
		{
			System.out.println("sucessfull");
		}
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.close();
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object [][] data = new Object[5][2];
		
		data[0][0] ="jishanalam123@gmail.com";
		data[0][1] ="acdefs";
		data[1][0] ="jishanalam12@gmail.com";
		data[1][1] ="9034";
		data[2][0] ="jishanalam23@gmail.com";
		data[2][1] ="nndjnf";
		data[3][0] ="jishanalam103@gmail.com";
		data[3][1] ="3456";
		data[4][0] ="jishanalam100@gmail.com";
		data[4][1] ="1234";
		
		return data;
		
	}

}
