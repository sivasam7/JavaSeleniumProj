import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LogInPage;

public class MainPage{
	
	
	public static void main(String args[]) {	
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");	
		LogInPage lip = new LogInPage(driver);
		lip.enterUserName("siva").enterSecondName("Prakasam");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.quit();
	}
}