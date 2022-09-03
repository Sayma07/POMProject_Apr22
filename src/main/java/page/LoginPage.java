package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
    
	WebDriver driver;
	
	
	//WebElement list
	//WebElement            //Type name=value
	//By Type
	
	@FindBy(how=How.XPATH , using="//input[@id='username']") WebElement USERNAME_ELEMENT;
	@FindBy(how=How.XPATH,using="//input[@id='password']") WebElement PASSWORD_ELEMENT;
	@FindBy(how=How.XPATH,using="//button[@name='login']") WebElement SIGNINBUTTON_ELEMENT;
	
	
	//corresponding method
public LoginPage(WebDriver driver) {           //this driver will come from PageFactory from Test
	this.driver=driver;
	
}



	
	public void insertUserName(String username) {
		USERNAME_ELEMENT.sendKeys(username);
	}
	
	public void insertPassword(String Password) {
		PASSWORD_ELEMENT.sendKeys(Password);
	}
	
	public void clickSignInButton() {
		SIGNINBUTTON_ELEMENT.click();
	}
	public void performLogin(String username, String Password) {
		USERNAME_ELEMENT.sendKeys(username);
		PASSWORD_ELEMENT.sendKeys(Password);
		SIGNINBUTTON_ELEMENT.click();
		
		
		
		
}
}