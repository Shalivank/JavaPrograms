package api.practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");
	 String pid = driver.getWindowHandle();
	 driver.findElement(By.xpath("//a[.='  Like us On Facebook ']")).click();
	Set<String> ele = driver.getWindowHandles();
	Thread.sleep(4000);
	for (String st: ele) {
		if(!st.equalsIgnoreCase(pid))
		{
			driver.switchTo().window(st).close();
			
		}
		Thread.sleep(4000);
	}
	

	}

}
