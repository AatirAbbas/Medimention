package com.medimention.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[text()='Home']")      
	@CacheLookup
	WebElement bthHome;
	
	@FindBy(xpath="//a[text()='Join Us']")
	@CacheLookup
	WebElement btnRegister;
	
	@FindBy(xpath="//a[text()='Login']")
	@CacheLookup
	WebElement btnLogin;
	
	public void homebtn()
	{
		bthHome.click();
	}
	
	public void registerbtn()
	{
		btnRegister.click();
	}
	
	public void loginbtn()
	{
		btnLogin.click();
	}
	
	
	

}
