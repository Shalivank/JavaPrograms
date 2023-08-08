package genericUtility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import flipkartrepo.homepage;

public class baseclass {
	protected WebDriver driver;
	protected WebDriverUtility w;
	protected homepage hp;
	@BeforeClass
	public void BaseSetup()
	{
		 w=new WebDriverUtility();
		
	}
	@BeforeMethod
	public void home()
	{
		 hp=new homepage(driver);
		
	}
	

}
