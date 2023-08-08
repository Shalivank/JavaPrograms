package flipkartrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart {
	@FindBy(xpath="//input[@class='_3704LK']")
	private WebElement searchText;
	@FindBy(xpath="//a[@class='_3izBDY']")
	private WebElement mobiletext;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement buttonfield;
	
   public Flipkart(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   public void flpikart()
   {
	   searchText.sendKeys("mobile");
	   mobiletext.click();
	   buttonfield.click();
	   
	   
   }
}
