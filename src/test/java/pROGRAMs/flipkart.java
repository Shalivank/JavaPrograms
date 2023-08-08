package pROGRAMs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkart {
	@Test
	public void flip() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("mobile");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		driver.findElement(
				By.xpath("//div[text()='POCO']/parent::label[@class='_2iDkf8 t0pPfW']/child::div[@class='_24_Dny']"))
				.click();
		Thread.sleep(3000);
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		// WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));

		// System.out.println(ele);
		for (WebElement element : ele) {
			String data = element.getText();
			// wait.until(ExpectedConditions.textToBePresentInElementValue(element,data));

			System.out.println(data);
		}
		driver.close();
	}

}
