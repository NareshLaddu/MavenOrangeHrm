package com.orangehrm.test;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.orangehrm.or.Admin;
import com.orangehrm.or.LoginPage;
import com.orangehrm.utilities.Base;
import com.orangehrm.utilities.DataRead;

public class LoginTest extends Base {
	
	@Test(dataProvider = "getDataXL" , dataProviderClass = DataRead.class)
	public void login(String uid,String pawd) throws Throwable
	{
		LoginPage lp=new LoginPage(dr);
		lp.uN.clear();
		lp.uN.sendKeys(uid);
		lp.pwd.clear();
		lp.pwd.sendKeys(pawd);
		lp.btn.click();
		
		Thread.sleep(5000);

	}   
	@Test
	public void userDetails()
	{ 
	    Admin ad = new Admin(dr);
		Actions act= new Actions(dr);
		act.moveToElement(ad.admn).moveToElement(ad.usrmgmt).moveToElement(ad.usr).click().build().perform();
	}

}
