package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {
	WebDriver driver;

	// Login data

//	String passWord="abc123";

	
	
	String fullName="Java Selenium";
	String company="Apple";
	String email="abc@yahoo.com";
	String Phone="5654345";
	@Test
	public void ValidUserShouldBeAbleToLogin() throws Exception {

		driver = BrowserFactory.init(); // giving driver as a return value

		String userName = "demo@techfios.com", passWord = "abc123";
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName(userName);
		loginPage.insertPassword(passWord);
		loginPage.clickSignInButton();

	
		DashBoardPage dashboardPage=PageFactory.initElements(driver, DashBoardPage.class);
	
		dashboardPage.validateDashboardPage();
		//BrowserFactory.tearDown();
		Thread.sleep(3000);
		dashboardPage.clickCustomerMenuButton();
		dashboardPage.clickAddCustomerMenueButton();
		
		AddCustomerPage addCustomerPage=PageFactory.initElements(driver, AddCustomerPage.class);
		Thread.sleep(5000);
		addCustomerPage.insertFullName(fullName);
		addCustomerPage.selectCompanyDropDownName(company);
		
		addCustomerPage.insertEmailAddress(email);
	
		addCustomerPage.insertPhoneNumber(Phone);
	}
}
