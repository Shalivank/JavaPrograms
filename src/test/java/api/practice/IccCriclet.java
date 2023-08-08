package api.practice;

import java.awt.AWTException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class IccCriclet {
	@Test
	public void rankingDropdown() throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.t20worldcup.com/");
		driver.findElement(By.xpath("//a[contains(.,'ICC RANKINGS')]")).click();
		Set<String> set = driver.getWindowHandles();
		ArrayList<String> list = new ArrayList<String>(set);
		driver.switchTo().window(list.get(1));
		WebElement ele = driver.findElement(By.xpath("//div[@class='main-navigation__header u-hide-desktop']//parent::li/button[contains(.,'Rankings')]"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.close();
}
}