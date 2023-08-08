package pROGRAMs;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class suggestion2 {
	@Test
	public void sug() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("q")).sendKeys("pm of india");
		Thread.sleep(1000);

		List<WebElement> ele = driver.findElements(By.xpath("//span[contains(.,'pm of ind')]"));
		System.out.println(ele);
		TreeSet<String> set = new TreeSet<String>();
         for (int i = 3; i < ele.size(); i++) {
			set.add(ele.get(i).getText());
			for (WebElement ele1 : ele) {
				String data = ele1.getText();
				System.out.println(data);

			}
		}

	}
}
