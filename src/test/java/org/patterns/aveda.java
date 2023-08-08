package org.patterns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class aveda {
	@Test
	public void avedaa()
	{
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications--");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(op);
		driver.get("https://www.aveda.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement ele = driver.findElement(By.xpath("//a[text()='MAKEUP']/parent::li[@class='menu__item menu__item--lvl-2 menu__item--category js-menu-item-category']/ancestor::div[@id='node-98']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele);
		
	}

}
