package org.com.interview.curreny.stepDef;

import static org.junit.Assert.assertTrue;

import java.util.Currency;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

import org.com.interview.curreny.DataProvider.PropertiesRead;
import org.com.interview.curreny.pageObjects.CurrencyTable;
import org.com.interview.curreny.util.Seleniumhelper;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Currency_Validation {
	WebDriver driver;
	CurrencyTable table;
	Seleniumhelper helper;

	public Currency_Validation() {
		this.driver = new Driver().instanceOfWebdriver();
		this.table = new CurrencyTable(this.driver);
		this.helper = new Seleniumhelper(driver);
	}

	@Given("^Launch test url$")
	public void launch_test_url() {
		driver.get(new PropertiesRead("currency_dv.properties").getvalue("URL"));
	}

	@When("^table displayed$")
	public void table_displayed() throws Throwable {
		this.table.totalvalue.isDisplayed();
	}

	@Then("^validate right count of values$")
	public void validate_right_count_of_values() throws Throwable {
		List<String> values = helper.listofstringsfromwebelements(this.table.textvalues);
		Float total = 0.0f;
		for (String value : values) {
			total = total + Float.parseFloat(value.trim().split("$")[1]);
		}
		assertTrue(total == Float.parseFloat(this.table.totalvalue.getText().trim().split("$")[1]));
	}

	@Then("^validate the values are greater than zero$")
	public void validate_the_values_are_greater_than_zero() throws Throwable {
		List<String> values = helper.listofstringsfromwebelements(this.table.textvalues);
		for (String value : values) {
			assertTrue(Float.parseFloat(value.trim().split("$")[1]) > 0);
		}
	}

	@Then("^validate the total balence and values listed on the screen count should be same$")
	public void validate_the_total_balence_and_values_listed_on_the_screen_count_should_be_same() {
		List<String> values = helper.listofstringsfromwebelements(this.table.textvalues);
		Float total = 0.0f;
		for (String value : values) {
			total = total + Float.parseFloat(value.trim().split("$")[1]);
		}
		assertTrue(total == Float.parseFloat(this.table.totalvalue.getText().trim().split("$")[1]));
	}

	@Then("^validate the values are in  correct format or not$")
	public void validate_the_values_are_in_correct_format_or_not() throws Throwable {
		List<String> values = helper.listofstringsfromwebelements(this.table.textvalues);
		Currency currency = Currency.getInstance(Locale.US);
		Pattern p = Pattern.compile("[+-]?([0-9]*[.])?[0-9]+");
		for (String value : values) {
			assertTrue(value.startsWith(currency.getSymbol()));
			assertTrue(p.matcher(value.substring(1)).matches());
		}
	}

}
