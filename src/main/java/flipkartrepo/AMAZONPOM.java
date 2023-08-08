package flipkartrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AMAZONPOM {
	@FindBy(id="searchDropdownBox")
	private WebElement droptext;
	
	@FindBy(xpath="//option[text()='Amazon Fashion']")
	private WebElement optiontext;
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement seachtext;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement subtext;
	
	
	public AMAZONPOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void amazon(String amazonfashion,String dresses)
	{
		droptext.click();
		optiontext.sendKeys(amazonfashion);
		seachtext.sendKeys(dresses );
		subtext.click();
	}
	

}
