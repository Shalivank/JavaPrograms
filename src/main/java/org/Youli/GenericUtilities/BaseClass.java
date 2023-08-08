package org.Youli.GenericUtilities;


import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import ajio.POM.Repository.ChooseBrands;
import ajio.POM.Repository.HomeAndKitchenPage;
import ajio.POM.Repository.WelcomePage;

public class BaseClass {
	protected WebDriver driver;
	protected WebDriverUtility wdu;
	protected ExcelUtility eu;
	protected FileUtility fu;
	protected JavaUtility ju;
	protected String browser;
	protected ChromeOptions option;
	protected String url;
	protected HomeAndKitchenPage HK;
	protected long longtime;
	protected ChooseBrands choice;
	protected WelcomePage wp;     
    public static WebDriver sdriver;
    public static JavaUtility sju;
	@BeforeClass
	public void classSetup() {
		wdu = new WebDriverUtility();
		fu = new FileUtility();
		eu = new ExcelUtility();
		ju = new JavaUtility();
		sju=ju;
		
		url = fu.getDataFromPropertyfile(IConstantsPath.PROPERTY_FILE_PATH, "url");
		browser=fu.getDataFromPropertyfile(IConstantsPath.PROPERTY_FILE_PATH, "browser");
		choice = new ChooseBrands(driver);

		driver=wdu.commonOperation(browser, url, longtime);
		 option=new ChromeOptions();
		 sdriver = driver;
		wdu.initializeJSE(driver);

	}

	@BeforeMethod	public void methodSetup() {

    	wp = new WelcomePage(driver);
        HK=new HomeAndKitchenPage(driver);

	}

	@AfterClass
	public void afterClassSetup() {
	//	wdu.closeTheBrowser(driver);
	}
}
