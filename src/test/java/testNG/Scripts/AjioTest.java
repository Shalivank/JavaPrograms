package testNG.Scripts;

import java.awt.Checkbox;

import org.Youli.GenericUtilities.BaseClass;
import org.Youli.GenericUtilities.IConstantsPath;
import org.testng.annotations.Test;

import ajio.POM.Repository.ChooseBrands;

public class AjioTest extends BaseClass {

	@Test
	public void verifyTest() {

		option.addArguments("--disable -notifications");
		wp.homeAndKitchenLink();
//		HK.scrollTillBrand(driver, wdu);
		HK.brandstab();
		option.addArguments("--disable -notifications");
		ChooseBrands cp = new ChooseBrands(driver);
		eu.openExcel(IConstantsPath.EXCEL_PATH, "Sheet1");
		String FusionAccess= eu.getexcel(2, 0);
		String MEYER= eu.getexcel(3, 0);
		String Zippo= eu.getexcel(1, 0);
		cp.clickSpecifiedBrand(FusionAccess);
		cp.clickSpecifiedBrand(MEYER);
		cp.clickSpecifiedBrand(Zippo);
		//HK.checkbox();
		//option.addArguments("--disable notifications");
		HK.applyButton();
		
	}

}
