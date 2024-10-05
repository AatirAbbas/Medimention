package com.medimention.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.medimention.pageObject.CreateAccountPage;
import com.medimention.pageObject.HomePage;
import com.medimention.pageObject.MyAccountPage;
import com.medimention.utilities.DataProviders;

public class TC_002_RegistrationDDT extends BaseClass {
	
	@Test(dataProvider="RegisterData", dataProviderClass=DataProviders.class)
	public void account_register(String B_Name, String username, String email, String password, String RepPassword)
	{
		HomePage H=new HomePage(driver);
		CreateAccountPage CR=new CreateAccountPage(driver);
		MyAccountPage mya=new MyAccountPage(driver);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
//		WebElement blood=driver.findElement(By.xpath("//span[normalize-space()='Blood Bank']"));
//		WebElement company=driver.findElement(By.xpath("//span[text()='Company']");)
		
//		WebElement groupele[]= {blood, company};
		
			try
			{
			H.homebtn();
			H.registerbtn();
//			}catch(StaleElementReferenceException e)
//			{
//				System.out.println(e.getMessage());
//				driver.navigate().refresh();
//			}
			
		CR.selectGroup();
//		String pwd= randomString()+randomNumber();
//		String username=randomString()+randomNumber();
//		String BussName=randomString();
//		Select drpgroupname=new Select(driver.findElement(By.xpath("//span[@class='filter-option pull-left']")));
//		drpgroupname.selectByVisibleText("Blood Bank");
		CR.BName(B_Name);
		CR.enterUsername(email);
		CR.enterEmail(username);
		CR.enterPassword(password);
		CR.enterConfPassword(RepPassword);
		CR.termsCheck();
		CR.registerSuccess();
		
		//MyAccount
		
		String actHead= "Medimention | ".toLowerCase()+B_Name.toLowerCase()+"'s User Panel".toLowerCase();
		
		Assert.assertEquals(actHead, mya.AcctRegSuccess());
		mya.logoutdropdown();
		mya.logoutbtn();
		mya.homebtn();
		
		System.out.println(username+" "+password);
		System.out.println();
			}
			catch(Exception e)
			{
				
				mya.homebtn();
			}
		
	}
}
