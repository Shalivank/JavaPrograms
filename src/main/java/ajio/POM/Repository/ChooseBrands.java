package ajio.POM.Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ChooseBrands {
   private WebDriver driver;
   private String brands="//label[@for='modal-%s']";
    
   public ChooseBrands(WebDriver driver)
   {  
	   this.driver=driver;
	   PageFactory.initElements(driver,this);
   }
   
   private WebElement convertStringIntoCategoryWebelement(String required)
   {
	  String actualvalue = String.format(brands, required);
	  WebElement ele = driver.findElement(By.xpath(actualvalue));
	  return ele;
   }
   
   public void clickSpecifiedBrand(String options)
   {
	   convertStringIntoCategoryWebelement(options.toString()).click();
   }
}
