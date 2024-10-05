package com.medimention.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{
	
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[@class='navbar-brand']/small")
	@CacheLookup
	WebElement registerActPage;
	
	@FindBy(xpath="//li[@class='green']/a")
	@CacheLookup
	WebElement logoutdrp;
	
	@FindBy(xpath="//ul[@class='dropdown-menu pull-right']/li[5]/a")
	@CacheLookup
	WebElement logoutbtn;
	
	@FindBy(xpath="//a[@class='navbar-brand']//small")
	@CacheLookup
	WebElement medihome;
	
	public String AcctRegSuccess()
	{
		try
		{
			return registerActPage.getText().toLowerCase();
		}catch(Exception e)
		{
			return "Unsuccessful";
		}
	}
	
	public void logoutdropdown()
	{
		logoutdrp.click();
	}
	
	public void logoutbtn()
	{
		logoutbtn.click();
	}
	
	public void homebtn()
	{
		medihome.click();
	}

}
