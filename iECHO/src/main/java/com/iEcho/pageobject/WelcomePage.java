package com.iEcho.pageobject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.iEcho.action.Action;
import com.iEcho.base.Base;

public class WelcomePage extends Base {
	
	Action action = new Action();
	
	@FindBy(xpath="//span[contains(text(),'Continue')]")
	WebElement continuebtn;
	@FindBy(xpath="//label[contains(text(),'English')]")
	WebElement selectLanguage;
	
	public WelcomePage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public HomePage clickOnContinue() {
		action.click(driver, continuebtn);
		return new HomePage();
	}
	
	
}









