package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclasses.Baselibrary;
import pages.Loanmenu;

public class Loanmenutest extends Baselibrary
{
	Loanmenu ob;
	@BeforeTest
	public void launch() throws InterruptedException
	{
		getlaunch();
		Thread.sleep(2000);
		ob=new Loanmenu();
	}
	@Test
	public void Loanmenu() throws InterruptedException
	{
		ob.click_instant_personalloan();
		ob.click_new_credit_personalloan();
		ob.PersonalLoan_without_document();
		ob.Personal_loan_aadharcard();
		
	}
	 
	

}
