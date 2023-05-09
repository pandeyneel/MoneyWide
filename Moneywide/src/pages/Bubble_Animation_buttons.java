package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseclasses.Baselibrary;

public class Bubble_Animation_buttons extends Baselibrary
{
	//creating a Constructor.
	public Bubble_Animation_buttons()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[text()='New to Credit']")
	private WebElement new_to_crdt_loan;
	@FindBy(xpath = "//*[@href=\"/personal-loan\" and @class=\"bubble-2 bb-2\"]")
	private WebElement ins_per_loan;
	@FindBy(xpath="//*[@class=\"bubble-3 bb-3\"]")
	private WebElement loan_against_salary;
	@FindBy(xpath = "//*[@class=\"bubble-4 bb-4\"]")
    private WebElement Pl_without_document;
	@FindBy(xpath = "//*[@class=\"btn index_page_apply_button\"]")
	private WebElement ApplyNow_button;
	
	//Clicking the button and checking whether it is being redirected to correct page or not.
	public void apply_now_button()
	{
		ApplyNow_button.click();
		String expected="https://www.moneywide.com/personal-loan";
		String Actual=driver.getCurrentUrl();
		Assert.assertEquals(Actual, expected);
	}
	public void New_to_credit_loan() throws InterruptedException
	{
		driver.navigate().back();
		Thread.sleep(2000);
		new_to_crdt_loan.click();
		String expected="https://www.moneywide.com/new-credit-personal-loan-mw-first/";
		String Actual=driver.getCurrentUrl();
		Assert.assertEquals(Actual, expected);
	}
	public void Instant_person_loan() throws InterruptedException
	{
		driver.navigate().back();
		Thread.sleep(2000);
		ins_per_loan.click();
		String expected="https://www.moneywide.com/personal-loan";
		String Actual=driver.getCurrentUrl();
		Assert.assertEquals(Actual, expected);
	}
	public void Loan_against_salary() throws InterruptedException
	{
		driver.navigate().back();
		Thread.sleep(2000);
		loan_against_salary.click();
		String expected="https://www.moneywide.com/blog/salary-advance-loans";
		String Actual=driver.getCurrentUrl();
		Assert.assertEquals(Actual, expected);
	}
	public void Pl_without_document() throws InterruptedException
	{
		driver.navigate().back();
		Thread.sleep(2000);
		Pl_without_document.click();
		String expected="https://www.moneywide.com/instant-personal-loan-without-documents/";
		String Actual=driver.getCurrentUrl();
		Assert.assertEquals(Actual, expected);
		
	}
	
	
}
