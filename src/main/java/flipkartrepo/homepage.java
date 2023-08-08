package flipkartrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	@FindBy(name="q")
	private WebElement name;
	
	@FindBy(xpath="//h3[text()='Amazon.in']")
	private WebElement clicktext;
	
	public homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Welcomepage()
	{
		name.sendKeys("www.amazon.in");
		clicktext.click();
	}

}
