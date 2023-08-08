package pROGRAMs;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JUPITER {
	@Test
	public void jup()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icc-cricket.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	//driver.findElement(By.xpath("//button[text()='Womens']/ancestor::div[@class='rankings__content js-player-rankings-panel ']")).click();
	 WebElement ele = driver.findElement(By.xpath("//span[text()='Top Stories']/parent::a[@class='widget-header-link  u-hide-tablet']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoViw()",ele);
	
	
	}

}
