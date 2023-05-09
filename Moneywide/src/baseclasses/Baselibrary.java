package baseclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baselibrary 
{ public static WebDriver driver;
	public static void getlaunch()
	{
		System.getProperty("webdriver.chrome.driver", "C:\\Users\\nileshkumar.pandey\\eclipse-workspace\\Moneywide\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.moneywide.com/");
		driver.manage().window().maximize();
	}
	

}
