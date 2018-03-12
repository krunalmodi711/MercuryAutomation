package com.mercury.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.mercury.base.BaseTest;

public class RegisterPage extends BaseTest {

	public RegisterPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	public String verifyRegisterPageTitle(){
		
		return driver.getTitle();
	}

}
