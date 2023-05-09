package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclasses.Baselibrary;
import pages.Contactus_MakePay_Log_button;

public class Contactus_Makepay_Log_test extends Baselibrary
{
Contactus_MakePay_Log_button ob;
@BeforeTest
public void launchurl()
{
	getlaunch();
	ob=new Contactus_MakePay_Log_button();
}

@Test(priority=1)
public void Contact_us_buttontest()
{
	ob.contact_us_check();
}
@Test(priority=2)
public void Make_payemt_button_test()
{
	ob.Make_Paymentbutton();
}
@Test(priority=3)
public void Login_button_test()
{
	ob.Login_button();
}
@Test(priority=4)
public void download_app() throws InterruptedException
{
	ob.Downloadapp_button();
}
}
