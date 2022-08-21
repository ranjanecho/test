package com.iEcho.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.iEcho.base.Base;
import com.iEcho.pageobject.WelcomePage;

public class WelcomePageTest extends Base {
	
	@BeforeMethod
	public void setup() {
		launchApp();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void verify() throws InterruptedException {
		WelcomePage welcomePage = new WelcomePage();
		Thread.sleep(3000);
		welcomePage.clickOnContinue();
	}
}
