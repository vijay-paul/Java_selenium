package Assignment_6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandlingControls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe"); // chrome driver location
		WebDriver driver = new ChromeDriver();// Intializing driver
		driver.manage().window().maximize();// maximixe window
		facebooklinks(driver);

	}

	public static void facebooklinks(WebDriver driver) {
		// TODO Auto-generated method stub

		driver.get("http://www.facebook.com"); // Open URL

		WebElement fblink = driver.findElement(By.id("pageFooterChildren"));// Storing driver to footer link section

		int fblinks = fblink.findElements(By.tagName("a")).size(); // collecting all the link present
		

		for (int i = 1; i <fblinks; i++) {

			fblink.findElements(By.tagName("a")).get(i).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));// opening the
																										// link in new
																										// window

		}

		Set<String> fbwindow = driver.getWindowHandles(); // getting the number of window handles open
		Iterator<String> fbhandle = fbwindow.iterator(); // using iterator to scan

		while (fbhandle.hasNext()) {

			driver.switchTo().window(fbhandle.next());
			System.out.println(driver.getTitle()); // printing the pagetitle

		}

	}
}
