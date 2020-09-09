package Assignment_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignPage {

	WebDriver driver;

	By username = By.name("userName");
	By password = By.xpath("//input[@name='password']");
	// By login=By.xpath("//input[@value='Login']");
	By SignOn = By.xpath("//a[text()='SIGN-ON']");
	By login = By.xpath("//input[@type='submit']");
	By loginsuccess = By.xpath("//tr/td/h3");
	By loginfail =By.xpath("//td/span");
	public String SuccessText() {
		String Flightpage = "Login Successfullyy";

		return Flightpage;
	}
	
	public String loginfailText() {
		String loginfail = "Enter your userName and password correct";
	

		return loginfail;
	}
	public SignPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement username() {
		return driver.findElement(username);

	}

	public WebElement password() {
		return driver.findElement(password);

	}

	public WebElement login() {
		return driver.findElement(login);

	}

	public WebElement SignOn() {
		return driver.findElement(SignOn);

	}

	public WebElement loginsuccess() {
		return driver.findElement(loginsuccess);
	}


	public WebElement loginfail() {
		return driver.findElement(loginfail);
	}
}
