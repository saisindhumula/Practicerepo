package samplePackage;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jsoup.Connection.Base;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.homepage;
//import pageobjects.registerpage;
import resources.baseclass;

//adding logs
//generating html reports
//screenshot on failure
//jenkins integration

public class Logintestcase extends baseclass {
	 public static final Logger log = LogManager.getLogger(Base.class.getName());
	@Test(dataProvider="credentials")
	public void Loginapp(String email, String password) throws IOException
	{
		driver=initializedriver();
		log.info("driver is initialized");
		driver.get("http://www.qaclickacademy.com/");
		homepage hom=new homepage(driver);
		log.info("navigated to homepage");
		hom.login().click();
		//hom.Popup().click();
		hom.Email().sendKeys(email);
		log.info("invalidemail is id entered");
		hom.Password().sendKeys(password);
		log.info("password is entered");
		hom.Submit().click();
		log.info("user clicked on submit button");
		//guru99seleniumlink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//div[@class='alert alert-danger']")));
		Assert.assertEquals(hom.Alert().getText(), "Invalid email or password.");
		log.error("invalid credentials");
		//how to assert for valid credentials and invalid credentials
	}
	
	@DataProvider
	public Object[][] credentials()
	{
		Object[][] arr=new Object[1][2];
		//arr[0][0]="itsnagm@gmail.com";
		//arr[0][1]="saiaansh";
		
		arr[0][0]="istnagm@gmail.com";
		arr[0][1]="saiaansh";
		return arr;		
	}
	
	@AfterTest
	public void closingdriver()
	{
		driver.close();
	}

}
