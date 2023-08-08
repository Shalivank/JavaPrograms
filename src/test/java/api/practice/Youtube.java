package api.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Youtube {
	@Test
	public void playSong()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("bare bare kalyan mantapakke baa");
		driver.findElement(By.xpath("//button[@class='style-scope ytd-searchbox']")).click();
		driver.findElement(By.xpath("//a[@title='Appu - \"Baare Baare Kalayana\" Audio Song | Puneeth Rajkumar, Rakshitha | Akash Audio']")).click();
		driver.close();
	}
}
