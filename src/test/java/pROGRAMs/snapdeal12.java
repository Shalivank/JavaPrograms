package pROGRAMs;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class snapdeal12 {
@Test
public void sp()
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	WebElement ele = driver.findElement(By.xpath("//div[@class='accountInner']"));
	Actions a=new Actions(driver);
	a.moveToElement(ele).perform();
	driver.findElement(By.xpath("//a[text()='login']")).click();
	driver.switchTo().frame(0);
	driver.findElement(By.id("userName")).sendKeys("123456789");
	driver.findElement(By.id("close-pop")).click();
	driver.switchTo().parentFrame();
	driver.findElement(By.name("keyword")).sendKeys("mobile");
	driver.close();
	
}
@Test
public void sp2()
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	String text1 = driver.getTitle();
	System.out.println(text1);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	String p = driver.getWindowHandle();
	driver.switchTo().newWindow(WindowType.TAB);
	driver.navigate().to("https://www.amazon.in/");
	Set<String> p2 = driver.getWindowHandles();
	System.out.println(p2);
	driver.switchTo().newWindow(WindowType.TAB);
	driver.navigate().to("https://www.flipkart.com/");
	String text = driver.getTitle();
	System.out.println(text);
	Set<String> p3 = driver.getWindowHandles();
	System.out.println(p3);
	for(String id:p2)
	{
		driver.switchTo().window(id);
		if(driver.getCurrentUrl().contains(text1));
		driver.close();
	}
	
	
	//driver.close();
}
}
