package api.practice;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Makemytrip1 {
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
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable -notifications");
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		option.addArguments("--disable -notifications");
		driver.findElement(By.xpath("//span[.='From']")).click();
		option.addArguments("--disable -notifications");
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(fromcity);
		option.addArguments("--disable -notifications");
		driver.findElement(By.xpath("//div[.='"+fromcity+"']")).click();
		option.addArguments("--disable -notifications");
		driver.findElement(By.xpath("//span[.='To']")).click();
		option.addArguments("--disable -notifications");
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(tocity);
		option.addArguments("--disable -notifications");
		driver.findElement(By.xpath("//div[.='"+tocity+"']")).click();
		option.addArguments("--disable -notifications");
		driver.findElement(By.xpath("//a[.='Search']")).click();
		System.out.println("************TESTCASE IS PASS **********");
		driver.close();
		//i[@class='wewidgeticon we_close']
	}
}
