package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclasses.Baselibrary;
import pages.Resources_menu;

public class Resources_Menu_Test extends Baselibrary
{
Resources_menu ob;
@BeforeTest 
public void openurl()
{
	getlaunch();
	ob=new Resources_menu();
}

@Test(priority=1)
public void Resources_Company_Servicerequstbutton()
{
	ob.Company_Servicerequest();
}

@Test(priority=2)
public void Resources_Company_Our_partner()
{
	try {
		ob.Company_outpartners();
		
	} catch (Exception e) {
		System.out.println("1 issue found");
		driver.navigate().back();
		ob.Company_outpartners();	
	}	
}

@Test(priority=3)
public void Resources_Company() throws InterruptedException
{
	try {
		ob.Company_Careers(); 
		
	} catch (Exception e) {
		System.out.println("1 Issue Found");
		driver.navigate().back();
		Thread.sleep(1000);
		ob.Company_Careers();		
	}
}

@Test(priority=4)
public void Resources_Company_Partner_with_us() throws InterruptedException
{
      try {  
	ob.Company_partenr_with_us();
	
		
	} catch (Exception e) {
		System.out.println("1 issue Found");
		driver.navigate().back();
		Thread.sleep(1000);
		ob.Company_partenr_with_us();		
	}
}

@Test(priority=5)
public void Resources_company_legalpolicies() throws InterruptedException
{ 
	
       try {  
	    ob.Company_legal_policies();
		
	}  catch (Exception e) {
		System.out.println("One Issue Found");
		driver.navigate().back();
		Thread.sleep(1000);
		ob.Company_legal_policies();
	}	
}

@Test(priority=6)
public void Faq_Blogs_infographic_Button_test() throws InterruptedException
{   
	try {
		ob.Faq_button();
		Thread.sleep(2000);
		ob.Blog_button();
		Thread.sleep(2000);
		ob.Infographic();
		driver.navigate().back();
		
	} catch (Exception e) {
		// TODO: handle exception
		driver.navigate().back();
		Thread.sleep(1000);
		ob.Faq_button();
		ob.Blog_button();
		ob.Infographic();
		
	}
	
}
@Test(priority=7)
public void Calculators() throws InterruptedException
{
	Thread.sleep(2000);
	ob.Calculator_EmiCalculator();
	ob.Calculator_Fortcloser();
    ob.Calculator_loan_eligibility();
    ob.Calculator_Portpayment();
}


}
