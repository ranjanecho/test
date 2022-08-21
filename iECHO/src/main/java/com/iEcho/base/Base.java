package com.iEcho.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import com.iEcho.action.Action;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static Properties prop;
	//public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
	public static WebDriver driver;
	
	@BeforeTest
	public void loadConfig() {
		

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "\\Config\\config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void launchApp() {
		
		
		WebDriverManager.chromedriver().setup();
		String browserName = prop.getProperty("browser");
		
		// Set Browser to ThreadLocalMap
		if(browserName.equalsIgnoreCase("Chrome")){
			driver = new ChromeDriver();
		
	} else if (browserName.equalsIgnoreCase("FireFox")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		
	
 }
		
	driver.get(prop.getProperty("url"));
	
	}
	
 
}


	


