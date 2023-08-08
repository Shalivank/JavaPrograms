package api.practice;

import java.time.Duration;
import java.util.Set;

import org.Youli.GenericUtilities.WebDriverUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart2 {
	@Test
	public void main() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		String pid = driver.getWindowHandle();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("washing machine");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(
				By.xpath("//div[.='LG 7 kg 5 star rating and Wind jet dry Semi Automatic Top Load Grey, White']"))
				.click();
		Set<String> ids = driver.getWindowHandles();
		for (String s : ids) {
			if (!s.equals(pid))
				driver.switchTo().window(s);
		}
		WebElement path = driver.findElement(By.xpath("//div[@class='_3dtsli']"));
		WebDriverUtility wdu = new WebDriverUtility();
		wdu.initializeJSE(driver);
		wdu.scrollUsingJSE(path);
		String ss = path.getText();
		System.out.println(ss);
	}
}
