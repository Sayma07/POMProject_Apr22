package page;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	public void selectFromDropDown(WebElement element,String visibletext) {
		Select sel=new Select(element);
		sel.selectByVisibleText(visibletext);
	}
	
	public int generateRandomNumber(int boundaryNum) {
		Random rnd=new Random();
		int genNum=rnd.nextInt(boundaryNum);
	return genNum;
	
	
	}
}
