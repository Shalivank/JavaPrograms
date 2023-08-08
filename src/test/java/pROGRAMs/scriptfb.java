package pROGRAMs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scriptfb {
	@Test
	public void fb() {
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications--");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(op);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("email")).sendKeys("9535944339");
		driver.findElement(By.id("pass")).sendKeys("bharati456");
		driver.findElement(By.name("login")).click();
	//	driver.findElement(By.xpath("//span[text()='Bharati Yaligar']")).click();
		driver.findElement(By.xpath("//span[text()='Watch']")).click();
		//driver.switchTo().alert().dismiss();
		driver.close();
	}

}
