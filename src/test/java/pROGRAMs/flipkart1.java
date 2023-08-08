package pROGRAMs;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkart1 {
	@Test
	public void fp() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//		Point data = ele.getLocation();
//		int a = data.getX();
//		int b = data.getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.xpath("//a[text()='Facebook']"));
		js.executeScript("arguments[0].scrollIntoView()", ele);

		String ele2 = ele.getText();
		ele.click();
		driver.navigate().to("https://www.facebook.com/flipkart");
		String title = driver.getTitle();
		System.out.println(title);
		// Assert.assertEquals("Flipkart - Home | Facebook", title);
		if (title.contains(ele2)) {
			System.out.println("pass");
		} else {
			System.out.println("Fail");
		}
		driver.close();
	}

	@Test
	public void String()
	{
		int n=10;
		for(int i=1;i<n;i++) {
			//System.out.println(i);
			if(i%n==5)
			{
				System.out.print(i+"hi");
			}
					}
		
	}
}
