package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage{
	WebDriver driver;
	
	By firstName = By.xpath("//input[contains(@type, text) and @placeholder = 'First Name']");
	By lastName = By.xpath("//input[contains(@type, text) and @placeholder = 'Last Name']");
	public LogInPage(WebDriver driver){
		this.driver = driver;
	}
	
	public LogInPage enterUserName(String firstNameVal) {
	driver.findElement(firstName).sendKeys(firstNameVal);
		return this;
	}
	//SB check
	public LogInPage enterSecondName(String secondNameVal) {
		driver.findElement(lastName).sendKeys(secondNameVal);
		return this;
	}
}