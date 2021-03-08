package org.com.interview.curreny.util;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Seleniumhelper {
	
	WebDriver driver;
	WebDriverWait wait;
	public Seleniumhelper(WebDriver driver) {
		this.driver=driver;
		
	}
	
	
	public WebElement waitforelement(String xpath) {
		wait=new WebDriverWait(driver, 60);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		
	}
	public WebElement waitforelement(WebElement we) {
		wait=new WebDriverWait(driver, 60);
		return wait.until(ExpectedConditions.visibilityOf(we));
	}
	
	public List<String>listofstringsfromwebelements(List<WebElement>elements){	
		List<String>values=new ArrayList<String>();
		for(WebElement ele:elements) {
			values.add(ele.getText());
		}
		return values;
	}
	
	
	
	

}
