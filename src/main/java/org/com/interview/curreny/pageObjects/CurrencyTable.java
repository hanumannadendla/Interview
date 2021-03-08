package org.com.interview.curreny.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;


public class CurrencyTable {
	
	WebDriver driver;
	
	public CurrencyTable(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBys(@FindBy(xpath=".//*[contains(@id,'lbl_val_')]"))
	public List<WebElement> lblvalues;
	
	@FindBys(@FindBy(xpath=".//*[contains(@id,'txt_val_')]"))
	public List<WebElement> textvalues;
	
	@FindBy(id="txt_ttl_val")
	public WebElement totalvalue;
	
}
