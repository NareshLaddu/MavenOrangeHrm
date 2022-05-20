package com.orangehrm.or;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver dr;
	
   @FindBy (id="txtUsername") public WebElement uN;
   @FindBy (id="txtPassword") public WebElement pwd;
   @FindBy (id="btnLogin") public WebElement btn;
   
   public LoginPage(WebDriver dr)
   {
	   PageFactory.initElements(dr, this);
   }
}
