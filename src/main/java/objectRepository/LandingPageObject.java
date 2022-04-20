package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LandingPageObject {
	
	WebDriver driver;
	public LandingPageObject(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@title='My Account']")
	WebElement myAccountDrop;
	
	@FindBy(xpath="//a[.='Login']")
	WebElement loginOption;
	
	
	public WebElement myAccountDrop() {
		
		return myAccountDrop;
	}
	public WebElement loginOption() {
		
		return loginOption;
	}
	

}
