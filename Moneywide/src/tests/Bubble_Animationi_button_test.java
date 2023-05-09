package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclasses.Baselibrary;
import pages.Bubble_Animation_buttons;

public class Bubble_Animationi_button_test extends Baselibrary
{
Bubble_Animation_buttons ob;
@BeforeTest
//To Launch the Url of the Home-Page.
public void launchurl()
{
	getlaunch();
	ob=new Bubble_Animation_buttons();
}
//Testing the buttons in sequence and verifying whether it is directing to correct url or not.
@Test(priority=5)
public void New_credit() throws InterruptedException
{
	ob.New_to_credit_loan();
}
@Test(priority=2)
public void Instant_loan_button_test() throws InterruptedException
{
	ob.Instant_person_loan();
}
@Test(priority=3)
public void Loan_against_salary() throws InterruptedException
{
	ob.Loan_against_salary();
}
@Test(priority=4)
public void Pl_without_document() throws InterruptedException
{
	ob.Pl_without_document();
}
@Test(priority=1)
public void Apply_button_test()
{
	ob.apply_now_button();
}
}
