package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclasses.Baselibrary;

public class Resources_menu extends Baselibrary
{
	public Resources_menu()
	{
		PageFactory.initElements(driver, this);
	}
	//All required Webelements.
	@FindBy(xpath = "//*[text()='Resources ']")
	private WebElement Resources;
	@FindBy(xpath = "//*[text()=' Company ']")
	private WebElement Company;
	@FindBy(xpath = "//*[text()='Service Request']")
	private WebElement Service_request;
	@FindBy(xpath = "//*[text()='Our Partners']")
	private WebElement Our_partners;
	@FindBy(xpath = "//*[text()='Careers']")
	private WebElement Careers;
	@FindBy(xpath = "//*[text()='Partner with Us']")
	private WebElement Partner_with_us;
	@FindBy(xpath = "//*[text()='Legal Policies']")
	private WebElement Legal_policies;
	@FindBy(xpath = "//*[text()=' FAQs']")
	private WebElement Faqs;
	@FindBy(xpath = "//*[text()=' Blogs']")
	private WebElement Blogs;
	@FindBy(xpath = "//*[text()='Infographics']")
	private WebElement Infographics;
	@FindBy(xpath = "//*[text()=' Calculators']")
	private WebElement Calculators;
	@FindBy(xpath = "//*[text()='Personal Loan EMI Calculator']")
	private WebElement Personal_loan_EMI_calculator;
	@FindBy(xpath = "//*[text()='Personal Loan Eligibility Calculator']")
	private WebElement Per_Loan_elg_cal;
	@FindBy(xpath = "//*[text()='Personal Loan Foreclosure Calculator']	")
	private WebElement Per_Loan_fore_cal;
	@FindBy(xpath = "//*[text()='Personal Loan Partpayment Calculator']")
	private WebElement Per_loan_partpay_cal;
	
	//Action Class to hovering the Menus.
	Actions hover=new Actions(driver);
	
	public void Company_Servicerequest()
	{
		hover.moveToElement(Resources).perform();
		hover.moveToElement(Company).perform();
		hover.click(Service_request).perform();
		
	}
	public void Company_outpartners()
	{
		hover.moveToElement(Resources).perform();
		hover.moveToElement(Company).perform();
		hover.click(Our_partners).perform();
	}
	public void Company_Careers()
	{
		hover.moveToElement(Resources).perform();
		hover.moveToElement(Company).perform();
		hover.click(Careers).perform();
	}
	public void Company_partenr_with_us()
	{
		hover.moveToElement(Resources).perform();
		hover.moveToElement(Company).perform();
		hover.click(Partner_with_us);
	}
	public void Company_legal_policies()
	{
		hover.moveToElement(Resources).perform();
		hover.moveToElement(Company).perform();
		hover.click(Legal_policies).perform();
	}
	public void Faq_button()
	{
		hover.moveToElement(Resources).perform();
		hover.click(Faqs).perform();
		
	}
	public void Blog_button()
	{
		hover.moveToElement(Resources).perform();
		hover.click(Blogs).perform();
	}
	public void Infographic()
	{
		hover.moveToElement(Resources).perform();
		hover.click(Infographics).perform();
	}
	public void Calculator_EmiCalculator()
	{
		hover.moveToElement(Resources).perform();
		hover.moveToElement(Calculators).perform();
		hover.click(Personal_loan_EMI_calculator).perform();
	}
	public void Calculator_loan_eligibility()
	{
		hover.moveToElement(Resources).perform();
		hover.moveToElement(Calculators).perform();
		hover.click(Per_Loan_elg_cal).perform();
	}
	public void  Calculator_Fortcloser()
	{
		hover.moveToElement(Resources).perform();
		hover.moveToElement(Calculators).perform();
		hover.click(Per_Loan_fore_cal).perform();
	}
	public void Calculator_Portpayment()
	{
		hover.moveToElement(Resources).perform();
		hover.moveToElement(Calculators).perform();
		hover.click(Per_loan_partpay_cal).perform();
	}
	

}
