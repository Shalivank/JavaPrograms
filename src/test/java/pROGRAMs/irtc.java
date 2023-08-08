package pROGRAMs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class irtc {
	@Test
	public void rail() {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications--");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(op);
		driver.get("https://www.irctc.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// driver.switchTo().alert().accept();
		WebElement ele = driver.findElement(By.xpath("//a[text()=' Train Ticket']"));
		js.executeScript("arguments[0].scrollIntoView()", ele);
				WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOf(ele));
		ele.click();
		WebElement ele1 = driver.findElement(By.xpath("//span[@class='ng-tns-c58-10 ui-calendar']/child::input[@autocomplete='off']"));
		//WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		//w.until(ExpectedConditions.visibilityOf(ele1));
		ele1.sendKeys("Yeshwantpur Junction");
		driver.close();

	}
}
