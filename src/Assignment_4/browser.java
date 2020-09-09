package Assignment_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;

public class browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 chrome();
		mozilla();
		 internetExplorer();
	}

	public static void chrome() {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");// chrome driver location
		WebDriver driver = new ChromeDriver();// Intializing driver
		driver.get("http://wwww.facebook.com");

		// verifying the page title with actual and expected string using Assert
		String pagetitle = "Facebook - Log In or Sign Up";
		String actualpagetitle = driver.getTitle();
		Assert.assertEquals(actualpagetitle, pagetitle);

		// verifying the page text with actual and expected string using Assert
		String pagetext = "Connect with friends and the world around you on Facebook.";
		String actualpagetext = driver.findElement(By.xpath("//div[@class='_8esl']/h2")).getText();
		Assert.assertEquals(actualpagetext, pagetext);

		// verifying page text with actual and expected string using assert
		String text = "It's free and always will";
		String actualtext = driver.findElement(By.xpath("//div[@class='_8esm']/div[1]/div")).getText();
		Assert.assertEquals(actualtext, text);
		// expected [It's free and always will] but found [It’s quick and easy.]
		driver.close();

	}

	public static void mozilla() {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		// verifying the page title with actual and expected string using Assert
		String pagetitle = "Facebook - Log In or Sign Up";
		String actualpagetitle = driver.getTitle();
		Assert.assertEquals(actualpagetitle, pagetitle);

		// verifying the page text with actual and expected string using Assert
		String pagetext = "Connect with friends and the world around you on Facebook.";
		String actualpagetext = driver.findElement(By.xpath("//div[@class='_8esl']/h2")).getText();
		Assert.assertEquals(actualpagetext, pagetext);

		// verifying page text with actual and expected string using assert
		String text = "It's free and always will";
		String actualtext = driver.findElement(By.xpath("//div[@class='_8esm']/div[1]/div")).getText();
		Assert.assertEquals(actualtext, text);
		// expected [It's free and always will] but found [It’s quick and easy.]
		driver.close();

	}

	public static void internetExplorer() {
		System.setProperty("webdriver.ie.driver", "c:\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		// verifying the page title with actual and expected string using Assert
		String pagetitle = "Facebook - Log In or Sign Up";
		String actualpagetitle = driver.getTitle();
		Assert.assertEquals(actualpagetitle, pagetitle);

		// verifying the page text with actual and expected string using Assert
		String pagetext = "Connect with friends and the world around you on Facebook.";
		String actualpagetext = driver.findElement(By.xpath("//div[@class='_8esl']/h2")).getText();
		Assert.assertEquals(actualpagetext, pagetext);

		// verifying page text with actual and expected string using assert
		String text = "It's free and always will";
		String actualtext = driver.findElement(By.xpath("//div[@class='_8esm']/div[1]/div")).getText();
		Assert.assertEquals(actualtext, text);
		// expected [It's free and always will] but found [It’s quick and easy.]
		driver.close();
	}

}
