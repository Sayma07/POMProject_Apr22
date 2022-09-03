package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashBoardPage {

	WebDriver driver;

	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
	}

	// WebElement list
	// Type name=value
	@FindBy(how = How.XPATH, using = "//h2[text()=' Dashboard ']")
	WebElement DASHBOARD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Customers')]")
	WebElement CUSTOMER_MENUE_FIELD;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Add Customer')]")
	WebElement ADDCUSTOMER_MENUE_FIELD;

	
	
	
	// corresponding method
	public void validateDashboardPage() {
		Assert.assertEquals(DASHBOARD_ELEMENT.getText(), "Dashboard", "Dasboard is not Found");

	}

	public void clickCustomerMenuButton() {
		CUSTOMER_MENUE_FIELD.click();
	}

	public void clickAddCustomerMenueButton() {
		ADDCUSTOMER_MENUE_FIELD.click();
	}

}