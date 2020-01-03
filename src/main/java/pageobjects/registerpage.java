package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class registerpage {
public registerpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	}

public WebDriver driver;
By popup=By.xpath("//*[@id=\"homepage\"]/div[5]/div[2]/div/div/div/span/div/div[7]/div/div/div[2]");
By register=By.xpath("//*[@id=\"homepage\"]/header/div[1]/div/nav/ul/li[3]/a/span");
By fullname=By.xpath("//input[@name='user[name]']");
By emailid=By.xpath("//input[@name='user[email]']");
By password=By.xpath("//input[@name='user[password]']");
By confirmpassword=By.xpath("//input[@name='user[password_confirmation]']");
By terms=By.xpath("//input[@id='user_agreed_to_terms']");
By signup=By.xpath("//input[@name='commit']");
//By userexist=By.xpath("//div[@class='alert alert-danger alert-registration-page']");
public WebElement Popup()
{
	return driver.findElement(popup);
}
public WebElement Register()
{
	return driver.findElement(register);
}

public WebElement Fullname()
{
	return driver.findElement(fullname);
}

public WebElement Emailid()
{
	return driver.findElement(emailid);
}

public WebElement Password()
{
	return driver.findElement(password);
}

public WebElement Confirmpassword()
{
	return driver.findElement(confirmpassword);
}

public WebElement Terms()
{
	return driver.findElement(terms);
}

public WebElement Signup()
{
	return driver.findElement(signup);
}





}
