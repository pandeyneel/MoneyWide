package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclasses.Baselibrary;

public class Loanmenu extends Baselibrary
{
	public Loanmenu()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='Loans ']")
	private WebElement Loanmenu;
	@FindBy(xpath = "//a[text()='  Personal Loans ']")
	private WebElement Personalloan;
	@FindBy(xpath = "//*[text()='Instant Personal Loan']")
	public WebElement Instantpersonalloan;
	@FindBy(xpath = "//*[text()='New Credit Personal Loan']")
	private WebElement Newcreditpersonalloan;
	@FindBy(xpath = "//*[text()='Personal Loan without documents']")
	private WebElement Perdonal_loan_without_documents;
	@FindBy(xpath="//*[text()='Personal Loan on Aadhaar Card']")
	private WebElement Personal_loan_aadhar_card;
	@FindBy(xpath = "//*[text()='Personal Loan for Travel']")
	private WebElement Personal_loan_travel;
	@FindBy(xpath = "//*[text()='Personal Loan for Marriage']")
	private WebElement Personal_loan_marriage;
	@FindBy(xpath = "//*[text()='Personal Loan for Home Renovation']")
	private WebElement Personal_loan_Home_renovation;
	
	Actions hover=new Actions(driver);
	
	
	
	
	public void click_instant_personalloan() throws InterruptedException
	{
		
		hover.moveToElement(Loanmenu).perform();;
		Thread.sleep(2000);
		hover.moveToElement(Personalloan).perform();
		hover.click(Instantpersonalloan).perform();
	}
	public void click_new_credit_personalloan() throws InterruptedException
	{
		hover.moveToElement(Loanmenu).perform();;
		Thread.sleep(2000);
		hover.moveToElement(Personalloan).perform();
		hover.click(Newcreditpersonalloan).perform();
		
	}
	
	public void PersonalLoan_without_document() throws InterruptedException
	{
		hover.moveToElement(Loanmenu).perform();;
		Thread.sleep(2000);
		hover.moveToElement(Personalloan).perform();
		hover.click(Perdonal_loan_without_documents).perform();
	}
	public void Personal_loan_aadharcard() throws InterruptedException
	{
		hover.moveToElement(Loanmenu).perform();;
		Thread.sleep(2000);
		hover.moveToElement(Personalloan).perform();
		hover.click(Personal_loan_aadhar_card).perform();
	}
	public void personalloan_Travel() throws InterruptedException
	{
		hover.moveToElement(Loanmenu).perform();;
		Thread.sleep(2000);
		hover.moveToElement(Personalloan).perform();
		hover.click(Personal_loan_travel).perform();
	}
	public void Personalloan_marriage() throws InterruptedException
	{
		hover.moveToElement(Loanmenu).perform();;
		Thread.sleep(2000);
		hover.moveToElement(Personalloan).perform();
		hover.click(Personal_loan_marriage).perform();
	}
	public void Personalloan_Homerenovation() throws InterruptedException
	{
		hover.moveToElement(Loanmenu).perform();;
		Thread.sleep(2000);
		hover.moveToElement(Personalloan).perform();
		hover.click(Personal_loan_Home_renovation).perform();
		
	}
	

}
