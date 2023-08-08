package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Register {
		@Test
		public void register() {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://demo.automationtesting.in/Register.html");
			driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("shalivan");
			driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("khandre");
			driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("siddeshwar");
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("shalivan12@gmail.com");
			driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("7411678867");
			driver.findElement(By.xpath("//input[@type='radio']")).click();
			driver.findElement(By.xpath("//input[@value='Cricket']")).click();
			driver.findElement(By.xpath("//input[@value='Movies']")).click();
			driver.findElement(By.xpath("//input[@value='Hockey']")).click();
			driver.findElement(By.xpath("//div[@id='msdd']")).click();
			driver.findElement(By.xpath("//a[.='English']")).click();
			driver.findElement(By.xpath("//a[.='Hindi']")).click();
			driver.findElement(By.xpath("//input[@value='Hockey']")).click();
			driver.findElement(By.xpath("//select[@id='Skills']"));
			WebElement ele = driver.findElement(By.xpath("//select[@id='Skills']"));
			Select s=new Select(ele);
			s.selectByValue("Java");
		//	driver.findElement(By.xpath("//span[@class='selection']")).click();
			 driver.findElement(By.xpath("//span[@role='combobox'] ")).sendKeys("India");
//			Select s1=new Select(ele1);
//			s1.selectByIndex(4);
	//		driver.close();
		}
}
