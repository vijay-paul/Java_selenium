package Assignment_4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Keyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");// chrome driver location
		WebDriver driver = new ChromeDriver();// Intializing driver
		// TODO Auto-generated method s.tub

		keyboard(driver); // Keyboard method for performing keyboard actions

		pagecontent(driver);//  verifying page content for webpage

	}

	public static void pagecontent(WebDriver driver) {
		driver.get("http://www.google.com");

		String Pagecontent = driver.findElement(By.cssSelector("body[id='gsr']")).getText(); // getting text and storing in string 
		System.out.println(Pagecontent); // printing the page content
		
		String pagetext = "Store";
		Assert.assertTrue(Pagecontent.contains(pagetext));
	}

	public static void keyboard(WebDriver driver) {

		driver.get("http://www.spicejet.com"); // Open URL
		driver.manage().window().maximize();
		Actions act = new Actions(driver); // intializing action using driver obkect
		act.sendKeys(Keys.ARROW_DOWN).build().perform();// Using Down arrow button
		act.keyDown(Keys.CONTROL).sendKeys("a").build().perform(); // using keyboard CTRL +A
		act.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform(); // using keyboard CTRL + HOME

	}

}
