package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory; 

public class MyAccountPageObjects {
	
	WebDriver driver;
	public MyAccountPageObjects(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//div[@id='content']//*[.='My Account']")
	WebElement breadcrumAccount;
	
	public WebElement breadcrumAccount() {
		return breadcrumAccount;
	}
}
