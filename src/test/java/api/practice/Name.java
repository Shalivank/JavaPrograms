package api.practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Name {
		@Test 
		public void name() {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.google.com");
			driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Shalivan");
			List<WebElement> list = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/li"));
			ArrayList<WebElement> l = new ArrayList<WebElement>(list);
			WebElement re = l.get(3);
			String value = re.getText();
			System.out.println(value);
			driver.close();
		}
}
