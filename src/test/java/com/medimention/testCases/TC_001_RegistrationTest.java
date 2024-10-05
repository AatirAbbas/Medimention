package com.medimention.testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.medimention.pageObject.CreateAccountPage;
import com.medimention.pageObject.HomePage;
import com.medimention.pageObject.MyAccountPage;

public class TC_001_RegistrationTest extends BaseClass{
	
	@Test
	public void account_register()
	{
		HomePage H=new HomePage(driver);
		CreateAccountPage CR=new CreateAccountPage(driver);
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
		String pwd= randomString()+randomNumber();
		String username=randomString()+randomNumber();
		String BussName=randomString();
//		Select drpgroupname=new Select(driver.findElement(By.xpath("//span[@class='filter-option pull-left']")));
//		drpgroupname.selectByVisibleText("Blood Bank");
		CR.BName(BussName);
		CR.enterUsername(username);
		CR.enterEmail(randomString()+"@xyz.com");
		CR.enterPassword(pwd);
		CR.enterConfPassword(pwd);
		CR.termsCheck();
		CR.registerSuccess();
		
		//MyAccount
		MyAccountPage mya=new MyAccountPage(driver);
		String actHead= "Medimention | ".toLowerCase()+BussName.toLowerCase()+"'s User Panel".toLowerCase();
		
		Assert.assertEquals(actHead, mya.AcctRegSuccess());
		System.out.println(username+" "+pwd);
		System.out.println();
			}
			catch(Exception e)
			{
				Assert.fail();
			}
		
	}

}
