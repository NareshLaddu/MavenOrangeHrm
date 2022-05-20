package com.orangehrm.or;

import org.apache.commons.math3.ode.events.EventHandler.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin {
  WebDriver dr;
  
   
  
  @FindBy (xpath="//b[text()='Admin']") public WebElement admn;
  @FindBy (xpath="//a[text()='User Management']") public WebElement usrmgmt;
  @FindBy (xpath="//a[text()='Users']") public WebElement usr;
  
  public Admin(WebDriver dr)
  {
	   PageFactory.initElements(dr, this);
  }
}
