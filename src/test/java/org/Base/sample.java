package org.Base;

import org.openqa.selenium.WebElement;
import org.test.SampleMaven;

public class sample  {

	public static void main(String[] args) {
		Baseclass1 b = new Baseclass1();
		 b.getDriver();
		 b.LoadUrl("https://www.facebook.com");
		
		b.findElementById
		 
		 WebElement user = b.locatebyid("email");
		 
		 b.sendKeys(user,"");
		 
	WebElement passwrd = b.locatebyid("pass");
	b.sendKeys(passwrd, "ramu");
		
	}
}