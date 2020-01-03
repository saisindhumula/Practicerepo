package samplePackage;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.homepage;
import pageobjects.registerpage;
import resources.baseclass;

public class testcase extends baseclass {
	
	@Test(dataProvider="getdata")
	
	public void homepagenavigation(String fullname, String email,String passw, String confirm) throws IOException
	{
		driver=initializedriver();
		driver.get("http://www.qaclickacademy.com/");
		registerpage re=new registerpage(driver);
		re.Popup().click();
		re.Register().click();
		re.Fullname().sendKeys(fullname);
		re.Emailid().sendKeys(email);
		re.Password().sendKeys(passw);
		re.Confirmpassword().sendKeys(confirm);
		re.Terms().click();
		re.Signup().click();
		//homepage ho=new homepage(driver);
		//ho.login().click();
	}
	
	@DataProvider
	public Object[][] getdata(){
		Object[][] data=new Object[2][4];
		
		data[0][0]="saisindhu";
		data[0][1]="saisindhu459@gmail.com";
		data[0][2]="sindhu@26";
		data[0][3]="sindhu@26";
		
		data[1][0]="nagaraju";
		data[1][1]="itsnagm@gmail.com";
		data[1][2]="saiaansh";
		data[1][3]="saiaansh";
		return data;
		
		
	}
	
	@AfterTest
	public void closingdriver() {
		driver.close();
	}
	
	

}
