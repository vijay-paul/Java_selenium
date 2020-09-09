package Assignment_5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Gmail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");// chrome driver location
		WebDriver driver = new ChromeDriver();// Intializing driver
		// TODO Auto-generated method s.tub
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // (globally) Implicity waiting for 10
		
		gmail(driver); // Keyboard method for performing gmail

	}

	public static void gmail(WebDriver driver) throws InterruptedException {

		driver.get("https://accounts.google.com/signin");

		driver.findElement(By.id("identifierId")).sendKeys("waitkeyedureka");

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("******");

		WebDriverWait wait = new WebDriverWait(driver, 20); // Explicity waiting for 20 

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']")));

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("656");

		System.out.println(driver.findElement(By.className("bsU")).getText());

	}

}
