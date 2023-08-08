package pROGRAMs;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class snapdeal {
	@Test
	public void snap() {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications--");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(op);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.xpath(
				"//img[@src='https://n4.sdlcdn.com/imgs/k/e/u/large/Veirdo-100-Cotton-Regular-Fit-SDL302182620-1-f0fac.jpg']"));
		js.executeScript("arguments[0].click()", ele);
		System.out.println("passed");
		WebElement ele2 = driver
				.findElement(By.xpath("//a[@class='social-link']/child::img[@alt='Snapdeal Facebook Page']"));
		js.executeScript("arguments[0].scrollIntoView", ele2);
		ele2.click();

		String p = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		for (String ch : child) {
			System.out.println(ch);
			if (!p.equals(ch)) {
				driver.switchTo().window(ch);
				driver.close();
			}

		}
		driver.close();

	}

}
