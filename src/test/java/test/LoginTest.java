package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {

	WebDriver driver;

	// Login data

//	String passWord="abc123";

	@Test
	public void ValidUserShouldBeAbleToLogin() {

		driver = BrowserFactory.init(); // giving driver as a return value

		String userName = "demo@techfios.com", passWord = "abc123";
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName(userName);
		loginPage.insertPassword(passWord);
		loginPage.clickSignInButton();

	
		DashBoardPage dashboardPage=PageFactory.initElements(driver, DashBoardPage.class);
	
		dashboardPage.validateDashboardPage();
		//BrowserFactory.tearDown();
	
	}
}
