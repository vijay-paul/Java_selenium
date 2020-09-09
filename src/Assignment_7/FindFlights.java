package Assignment_7;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindFlights {
@BeforeTest
public void testbegeins() {
	System.out.println("Test begins");
}
	
	
	
	@Test(priority = 1)
	public void bookFlight() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe"); // chrome driver location
		WebDriver driver = new ChromeDriver();// Intializing driver
		driver.manage().window().maximize();// maximixe window
		driver.get("http://demo.guru99.com/test/newtours/");

		captureScreenshot(driver);// Take screenshot after url is opened

		SignPage signOn = new SignPage(driver);
		signOn.username().sendKeys("mercury"); // valid username
		signOn.password().sendKeys("mercury"); // valid password

		captureScreenshot(driver);// Take screenshot after entering username and password
		signOn.login().click();

		captureScreenshot(driver);

		// Assert.assertEquals(

		/*
		 * SignPage signOn = new SignPage(driver); signOn.SignOn().click();
		 * signOn.username().sendKeys("mercury"); signOn.password().sendKeys("mercury");
		 * signOn.login().click();
		 */

		FlightFinderPage Flights = new FlightFinderPage(driver);
		captureScreenshot(driver);// Take screenshot after going to Flight booking page

		Flights.findflights.click();

		Flights.reserveflights.click();

		if (Flights.noseats.isDisplayed()) {
			String title = Flights.noseats.getText();
			System.out.println(title);
			captureScreenshot(driver);// Take screenshot for no seats displayed
		}

		else {

			BookFlightPage book = new BookFlightPage(driver);
			captureScreenshot(driver);// Take screenshot for user entering booking details
			book.firstname().sendKeys("Vijay");
			book.Lastname().sendKeys("Paul");
			book.creditcard().sendKeys("1243098712340987");
			book.securepurchase().click();

			captureScreenshot(driver);// Take screenshot after entering user details
		}
		
		

	}

	public void captureScreenshot(WebDriver driver) {

		TakesScreenshot screenshot = ((TakesScreenshot) driver);

		String destination = System.getProperty("user.dir") + "//" + "ScreenShots"
				+ "//" + timestamp() + "screenshot.png";
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File(destination));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// screenshot file name --
	public static String timestamp() {

		return new SimpleDateFormat("MM-dd HH-mm-ss").format(new Date());

	}

	
	}
	
	
	

	
	
	
	
	



