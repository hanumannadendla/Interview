package org.com.interview.curreny.stepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	
	private  WebDriver driver;
	public Driver() {
		
	}
	public WebDriver instanceOfWebdriver() {
		if(driver==null) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver=new ChromeDriver();
		}
		return driver;
	}
	

}
