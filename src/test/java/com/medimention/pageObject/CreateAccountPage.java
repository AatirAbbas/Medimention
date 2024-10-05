package com.medimention.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage extends BasePage {
	
	WebDriver driver;
	
	public CreateAccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//button[@data-id='UserRole']")
	@CacheLookup
	WebElement selectUserRole;
	
	@FindBy(xpath="//span[normalize-space()='Blood Bank']")
	@CacheLookup
	WebElement RoleBloodBank;
	
	@FindBy(xpath="//span[text()='Company']")
	@CacheLookup
	WebElement RoleCompany;
	
	@FindBy(xpath="//span[text()='Diagnostic Center']")
	@CacheLookup
	WebElement RoleDiagCen;
	
	@FindBy(xpath="//span[text()='Dietitian']")
	@CacheLookup
	WebElement RoleDietitian;
	
	@FindBy(xpath="//span[text()='Distributors']")
	@CacheLookup
	WebElement RoleDistributor;
	
	@FindBy(xpath="//span[text()='Doctor']")
	@CacheLookup
	WebElement RoleDoctor;
	
	@FindBy(xpath="//span[text()='Medical Equip. & Surgical Dealer']")
	@CacheLookup
	WebElement RoleMedEquip;
	
	@FindBy(xpath="//span[text()='Medical Representative']")
	@CacheLookup
	WebElement RoleMedRep;
	
	@FindBy(xpath="//span[text()='Medical Store']")
	@CacheLookup
	WebElement RoleMedStore;
	
	@FindBy(xpath="//span[text()='Nursing Home']")
	@CacheLookup
	WebElement RoleNurseHome;
	
	@FindBy(xpath="//span[text()='Orthotic']")
	@CacheLookup
	WebElement RoleOrthotic;
	
	@FindBy(xpath="//span[text()='Physio Therapist']")
	@CacheLookup
	WebElement RolePhyThe;
	
	@FindBy(xpath="//span[text()='Seller']")
	@CacheLookup
	WebElement RoleSeller;
	
	@FindBy(xpath="//span[text()='Stockist']")
	@CacheLookup
	WebElement RoleStockist;
	
	@FindBy(xpath="//span[text()='Union']")
	@CacheLookup
	WebElement RoleUnion;
	
	@FindBy(xpath="//span[text()='Wholeseller']")
	@CacheLookup
	WebElement RoleWholeSeller;
		
	@FindBy(xpath="//input[@id='DetailName']")
	@CacheLookup
	WebElement SBFname;
	
	@FindBy(xpath="//input[@id='UserUsername']")
	@CacheLookup
	WebElement txtUsername;
	
	@FindBy(xpath="//input[@id='UserEmail']")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@name='data[User][password1]']")
	@CacheLookup
	WebElement txtConfPassword;
	
	@FindBy(xpath="//input[@name='terms']")
	@CacheLookup
	WebElement termsConditions;
	
	@FindBy(xpath="//span[text()='Register']")
	@CacheLookup
	WebElement btnRegister;
	
	public void selectGroup()
	{
		
		selectUserRole.click();
		RoleBloodBank.click();
//		Select drpgroupname=new Select(selectUserRole);
//		drpgroupname.selectByVisibleText(groupname);
	}
	
	public void selectGroup2()
	{
		
		selectUserRole.click();
		RoleCompany.click();
//		Select drpgroupname=new Select(selectUserRole);
//		drpgroupname.selectByVisibleText(groupname);
	}
	
	public void selectGroup3()
	{
		
		selectUserRole.click();
		RoleDiagCen.click();
//		Select drpgroupname=new Select(selectUserRole);
//		drpgroupname.selectByVisibleText(groupname);
	}
	
	public void selectGroup4()
	{
		
		selectUserRole.click();
		RoleDietitian.click();
//		Select drpgroupname=new Select(selectUserRole);
//		drpgroupname.selectByVisibleText(groupname);
	}
	
	public void selectGroup5()
	{
		
		selectUserRole.click();
		RoleDistributor.click();
//		Select drpgroupname=new Select(selectUserRole);
//		drpgroupname.selectByVisibleText(groupname);
	}
	
	public void selectGroup6()
	{
		
		selectUserRole.click();
		RoleDoctor.click();
//		Select drpgroupname=new Select(selectUserRole);
//		drpgroupname.selectByVisibleText(groupname);
	}
	
	public void selectGroup7()
	{
		
		selectUserRole.click();
		RoleMedEquip.click();
//		Select drpgroupname=new Select(selectUserRole);
//		drpgroupname.selectByVisibleText(groupname);
	}
	
	public void selectGroup8()
	{
		
		selectUserRole.click();
		RoleMedRep.click();
//		Select drpgroupname=new Select(selectUserRole);
//		drpgroupname.selectByVisibleText(groupname);
	}
	
	public void selectGroup9()
	{
		
		selectUserRole.click();
		RoleMedStore.click();
//		Select drpgroupname=new Select(selectUserRole);
//		drpgroupname.selectByVisibleText(groupname);
	}
	
	public void selectGroup10()
	{
		
		selectUserRole.click();
		RoleNurseHome.click();
//		Select drpgroupname=new Select(selectUserRole);
//		drpgroupname.selectByVisibleText(groupname);
	}
	
	public void BName(String ShopName)
	{
		SBFname.sendKeys(ShopName);
	}
	
	public void enterUsername(String Username)
	{
		txtUsername.sendKeys(Username);
	}
	
	public void enterEmail(String Email)
	{
		txtEmail.sendKeys(Email);
	}
	
	public void enterPassword(String Password)
	{
		txtPassword.sendKeys(Password);
	}
	
	public void enterConfPassword(String ConfPassword)
	{
		txtConfPassword.sendKeys(ConfPassword);
	}
	
	public void termsCheck()
	{
		termsConditions.click();
	}
	
	public void registerSuccess()
	{
		btnRegister.click();
	}
}
