package com.orangehrm.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver dr;
	@BeforeClass
	public static void setUP()
	{
		WebDriverManager.chromedriver().setup();
		dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		dr.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
//	@AfterClass
//	public void tearDown()
//	{
//		dr.quit();
//	}
}
