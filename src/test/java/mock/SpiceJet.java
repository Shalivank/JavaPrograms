package mock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJet {
	@Test
	public void main() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.spicejet.com/");
		try{
			wait.until(ExpectedConditions.alertIsPresent());
		}
		catch (Exception e1){
			e1.printStackTrace();
		}
		
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/descendant::input[@autocapitalize='sentences']")).sendKeys("Mum");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']/descendant::input[@autocapitalize='sentences']")).sendKeys("chennai");
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-16ru68a r-y47klf r-1loqt21 r-eu3ka r-1otgn73 r-1aockid']")).click();
		driver.findElement(By.xpath("//div[text()='Passengers']")).click();
		for (int i = 0; i < 3; i++) {
			driver.findElement(By.xpath("//div[text()='Adult']/parent::div/following-sibling::div/div[3]")).click();
		}
		driver.findElement(By.xpath("//div[text()='Passengers']")).click();
		driver.findElement(By.xpath("//div[text()='Senior Citizen']")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[text()='Search Flight']"))));
		WebElement ele = driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']"));
		ele.click();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-14lw9ot r-z2wwpe r-f9v2oj r-1a852e4 r-1609sg0 r-1pcd2l5 r-1mdbw0j r-hnxvie']/descendant::div[@class='css-1dbjc4n r-zso239']")).click();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")).click();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1wtj0ep r-1f1sjgu']/descendant::div[@data-testid='continue-search-page-cta']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@data-testid='first-inputbox-contact-details']")).sendKeys("Siva");
		driver.findElement(By.xpath("//input[@data-testid='last-inputbox-contact-details']")).sendKeys("kumar");
		driver.findElement(By.xpath("//input[@data-testid='contact-number-input-box']")).sendKeys("9626315179");
		driver.findElement(By.xpath("//input[@data-testid='emailAddress-inputbox-contact-details']")).sendKeys("siva54325@gmail.com");
		for (int i = 0; i < 4; i++) {
			driver.findElement(By.xpath("//input[@data-testid='traveller-"+i+"-first-traveller-info-input-box']")).sendKeys("Siva");
			driver.findElement(By.xpath("//input[@data-testid='traveller-"+i+"-last-traveller-info-input-box']")).sendKeys("Kumar");
			driver.findElement(By.xpath("//input[@data-testid='sc-member-mobile-number-input-box']")).sendKeys("7010609044");
			driver.findElement(By.xpath("//input[@data-testid='traveller-"+i+"-date-of-birth-field']")).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='1963']"))).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Jan']"))).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='1']"))).click();
			try{
				driver.findElement(By.xpath("//div[@data-testid='traveller-"+i+"-travel-info-cta']")).click();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		driver.findElement(By.xpath("//div[@data-testid='traveller-info-continue-cta']")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}
