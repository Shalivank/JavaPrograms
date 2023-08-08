package api.practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {
	@Test
	public void main() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		String pid = driver.getWindowHandle();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("poco m4");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[text()='POCO M4 5G (Power Black, 64 GB)']")).click();
		Set<String> ids = driver.getWindowHandles();
		for(String s:ids)
		{
			if(!s.equals(pid))
			driver.switchTo().window(s);
		}
		String protext = driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//img[@title='Flipkart']")).click();
//		driver.findElement(By.xpath("//span[.='Cart']")).click();
//		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		String protext1 = driver.findElement(By.xpath("//a[text()='POCO M4 5G (Power Black, 64 GB)']")).getText();
		Assert.assertTrue(protext.contains(protext1));
		System.out.println("Testcase is pass");
		driver.quit();
	}

}
