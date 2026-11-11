package pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginSauceDemo_PageObject {
	
	WebDriver driver;
	WebDriverWait wait;
	
	//Locators
	
	private By username=By.id("user-name");
	private By password=By.id("password");
	private By submit_btn=By.id("login-button");
	private By error_msg=By.xpath("//h3[@data-test='error']");
	
	//Constructors
	public LoginSauceDemo_PageObject(WebDriver driver)
	{
		this.driver=driver;
		wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	}
	
	//Action Methods
    
	public void enterUsername(String uname)
	{
		driver.findElement(username).sendKeys(uname);
	}
	
	public void enterPassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		driver.findElement(submit_btn).click();
	}
	
	public String errorMsg()
	{
		WebElement errorelement=wait.until(ExpectedConditions.visibilityOfElementLocated(error_msg));
		String error_msg=errorelement.getText();
		return error_msg;
	}
	
	public String getURL()
	{
		return driver.getCurrentUrl();
	}

}
