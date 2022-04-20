package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {
	
	WebDriver driver;
	
	public LoginPageObject(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="input-email")
	WebElement EmailAttribute;
	
	@FindBy(id="input-password")
	WebElement passwordAttribute;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement loginbutton;

	public WebElement EmailAttribute() {
		return EmailAttribute;
	}
	public WebElement passwordAttribute() {
		return passwordAttribute;
	}
	public WebElement loginbutton() {
		return loginbutton;
	}
}
