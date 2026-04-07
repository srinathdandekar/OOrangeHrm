package Arr2;

import org.testng.annotations.Test;

import Orr1.Orrparameters;

public class Mainclass extends Orangemm {
	
	@Test
	public void prime() {
		Orrparameters obj = new Orrparameters(driver);
		obj.enterUsername("Admin");
		obj.enterPassword("admin123");
		obj.clickLogin();
	}

	
}
