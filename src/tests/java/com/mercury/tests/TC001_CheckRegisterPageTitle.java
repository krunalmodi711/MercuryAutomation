package com.mercury.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mercury.base.BaseTest;
import com.mercury.pages.RegisterPage;

public class TC001_CheckRegisterPageTitle extends BaseTest {
	
	public TC001_CheckRegisterPageTitle(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	RegisterPage objRegPage;
	
	@BeforeMethod
	public void setUp(){
		initialize();
		objRegPage = new RegisterPage(driver);
	} 
	
	@Test
	public void checkRegisrationPageTitle(){
		
		Assert.assertEquals(objRegPage.verifyRegisterPageTitle(), "Register: Mercury Tours");
	}
	
	@AfterMethod
	public void tearDown(){
		
		driver.quit();
	}

}
