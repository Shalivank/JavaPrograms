package api.practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip {
		@Test
		public void makemytrip() throws AWTException, EncryptedDocumentException, IOException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			FileInputStream fis=new FileInputStream("./src/test/resources/STC1.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			String fromcity = wb.getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();
			String tocity = wb.getSheet("Sheet2").getRow(1).getCell(0).getStringCellValue();
			System.out.println(fromcity);
			System.out.println(tocity);
			driver.get("https://www.makemytrip.com/");
//			WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@class='close']")))).click();
			driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
	//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
			driver.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']")).click();
	//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@class='close']")))).click();
			driver.findElement(By.xpath("//span[.='From']")).click();
			driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(fromcity);
			driver.findElement(By.xpath("//div[.='"+fromcity+"']")).click();
			driver.findElement(By.xpath("//span[.='To']")).click();
			driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(tocity);
			driver.findElement(By.xpath("//div[.='"+tocity+"']")).click();
			driver.findElement(By.xpath("//a[.='Search']")).click();
			driver.close();
			
		}
}
