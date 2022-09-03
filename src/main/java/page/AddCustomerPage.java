package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddCustomerPage extends BasePage{
	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	// WebElement list
	// Type name=value
	@FindBy(how = How.XPATH, using = "//input[@id='account']") WebElement FULL_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id='cid']")  WebElement COMPANY_DROPDOWN_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='email']") WebElement EMAIL_ELEMENT;

	@FindBy(how = How.XPATH, using = "//input[@id='phone']") WebElement PHONE_NUMBER_ELEMENT;
	
	
	// corresponding method
	public void insertFullName(String fullName) {
		
		String insertedName=fullName+generateRandomNumber(999);
		
		FULL_NAME_ELEMENT.sendKeys(insertedName);	

	}
	public void selectCompanyDropDownName(String company) {

selectFromDropDown(COMPANY_DROPDOWN_ELEMENT, company);
	}
	public void insertEmailAddress(String email) {
		
		String insertedEmail=generateRandomNumber(999)+email;
		
		EMAIL_ELEMENT.sendKeys(insertedEmail);	

	}
	public void insertPhoneNumber(String phone) {
		PHONE_NUMBER_ELEMENT.sendKeys(phone);	

	}
	
	
	
}