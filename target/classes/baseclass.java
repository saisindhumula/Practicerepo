package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class baseclass {
	public WebDriver driver;
	
	public WebDriver initializedriver() throws IOException
	{
	Properties prop=new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\nagar\\eclipse-workspace\\SampleMaven\\src\\main\\java\\resources\\propertiesfile");
prop.load(fis);
String browsername=prop.getProperty("browser");
System.out.println(browsername);
//String urlvalue=prop.getProperty("url");
//when ever we are extracting any value from property file 
//we should not use == instead we have to use equals method otherwise we will get null point exception
if(browsername.equals("chrome"))
{
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
}

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

return driver;

	}
	public void getScreenshot(String result) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\screenshot+shot.png"));
		
	}
	

	
	
	
}
