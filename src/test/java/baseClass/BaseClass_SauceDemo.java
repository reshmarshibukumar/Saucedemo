package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass_SauceDemo {
	
	protected WebDriver driver;
	
	@BeforeClass
	public void browserSetup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void urlLaunch() 
	{
		driver.get("https://www.saucedemo.com/");
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	

}
