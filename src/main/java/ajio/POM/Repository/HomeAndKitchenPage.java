package ajio.POM.Repository;

import org.Youli.GenericUtilities.WebDriverUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeAndKitchenPage {
	@FindBy(xpath = "//span[text()='brands']") private WebElement brandsTab;
	@FindBy(xpath = "//span[.='brands']/following::div[text()='MORE']") private WebElement MoreLink;
	@FindBy(xpath = "//label[@for='modal-%s']") private WebElement brandCheckbox;
	@FindBy(xpath = "//button[.='Apply']") private WebElement applyButton;
	public HomeAndKitchenPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void brandstab() {
	
		brandsTab.click();
		MoreLink.click();
		
	}
	public void checkbox()
	{
		brandCheckbox.click();
	} 
	public void scrollTillBrand(WebDriver driver, WebDriverUtility wdu)
	{
		wdu.initializeJSE(driver);
		wdu.scrollUsingJSE(brandsTab);
	}
	public void applyButton()
	{
		applyButton.click();
	}
} 
