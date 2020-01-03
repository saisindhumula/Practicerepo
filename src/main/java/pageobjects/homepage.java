package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage {
	public WebDriver driver;
	
	
	public homepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}

	By Login=By.xpath("//*[@id=\"homepage\"]/header/div[1]/div/nav/ul/li[4]/a");
	
	//By popup=By.xpath("//*[@id=\"homepage\"]/div[5]/div[2]/div/div/div/span/div/div[7]/div/div/div[2]");
	
	By email=By.xpath("//input[@type='email']");
	
	By password=By.xpath("//input[@type='password']");
	
	By submit=By.xpath("//input[@type='submit']");
	 
	By alert=By.xpath("//div[@class='alert alert-danger']");
	
	
	
	public WebElement login()
	{
		return driver.findElement(Login);
	}
	
	//public WebElement Popup()
	//{
	//	return driver.findElement(popup);
	//}
	public WebElement Email()
	{
		return driver.findElement(email);
	}
	public WebElement Password()
	{
		return driver.findElement(password);
	}
	public WebElement Submit()
	{
		return driver.findElement(submit);
	}
	
	public WebElement Alert()
	{
		return driver.findElement(alert);
	}
	

}
