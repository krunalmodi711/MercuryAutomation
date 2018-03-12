package com.mercury.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.mercury.utils.ConfigReader;

public class BaseTest {
	
	protected WebDriver driver;
	
	public BaseTest(WebDriver driver){
		
		this.driver = driver;
	}
	
	
	public void initialize(){
		
		if(ConfigReader.getProperty("BrowserName").trim().equals("Firefox"))
		{
			System.out.println("inside");
			System.setProperty("webdriver.gecko.driver","G:\\Neon\\gecko driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(ConfigReader.getProperty("IMPLICITLYWAIT").trim()), TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Integer.parseInt(ConfigReader.getProperty("PAGELOADTIMEOUT").trim()), TimeUnit.SECONDS);
		driver.get(ConfigReader.getProperty("URL").trim());
	}

}
