package com.orangehrm.test;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.orangehrm.or.Admin;
import com.orangehrm.or.LoginPage;
import com.orangehrm.utilities.Base;

public class AdminTest extends LoginTest {
	
	@Test(dependsOnMethods={"login"})
	public void userDetails()
	{ 
	    Admin ad = new Admin(dr);
		Actions act= new Actions(dr);
		act.moveToElement(ad.admn).moveToElement(ad.usrmgmt).moveToElement(ad.usr).click().build().perform();
	}

}
