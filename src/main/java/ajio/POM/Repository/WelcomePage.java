package ajio.POM.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
    @FindBy(xpath = "//a[.='HOME AND KITCHEN']") private WebElement HomeAndKitchenLink;
    
    public WelcomePage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void homeAndKitchenLink()
    {
    	HomeAndKitchenLink.click();
    }
    
    
    
    
}
