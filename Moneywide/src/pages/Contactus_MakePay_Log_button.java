package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseclasses.Baselibrary;

public class Contactus_MakePay_Log_button extends Baselibrary 
{
	//This class will check the Contact us,Make Payment, Login Button and Download App button.
	public Contactus_MakePay_Log_button()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='Contact Us']")
	private WebElement contact_us_button;
	@FindBy(xpath="//a[text()='Make Payment']")
	private WebElement Make_Payment_button;
	@FindBy(xpath="//*[@href=\"/login\"]")
	private WebElement Login_Button;
	@FindBy(xpath="//*[text()='Download App']")
	private WebElement Download_app_Button;
	
	public void contact_us_check()
	{
		contact_us_button.click();
		String expected="https://www.moneywide.com/contact-us/";
		String Actual=driver.getCurrentUrl();
		Assert.assertEquals(Actual, expected);
	}
	public void Make_Paymentbutton()
	{
		Make_Payment_button.click();
		String expected="https://www.moneywide.com/login/?utm_source=TVE9PQ==";
	//Because the Application is being tested when it is not logged in, the payment button will redirect to login first.
		String Actual=driver.getCurrentUrl();
		Assert.assertEquals(Actual, expected);
	}
	public void Login_button()
	{
		driver.navigate().back();
		Login_Button.click();
		String expected="https://www.moneywide.com/login";
		String Actual=driver.getCurrentUrl();
		Assert.assertEquals(Actual, expected);
	}
	public void Downloadapp_button() throws InterruptedException
	{
		driver.navigate().back();
		Download_app_Button.click();
		String expected="https://play.google.com/store/apps/details?id=com.app.mlcfinotech";
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
		String Actual=driver.getCurrentUrl();
		Thread.sleep(1000);
		Assert.assertEquals(Actual, expected);	
	}

}
