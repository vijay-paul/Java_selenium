package Assignment_7;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

// Taking screenshot with time stamp and get page title for URL 5 times 


public class DropBox {

	@Test(invocationCount = 5)//Running the same test 5 times 
	public void dropbox() throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe"); // chrome driver location
		WebDriver driver = new ChromeDriver();// Intializing driver
		driver.manage().window().maximize();// maximixe window
		driver.get("https://www.dropbox.com"); // open URL
		String timestamp=getDateTimeStamp();//getting time stamp for screenhot
		File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\Downloads\\hello"+timestamp+".png")); // storing file name + time stamp 
		String pagetitle = driver.getTitle(); 
		System.out.println(pagetitle);//print the page title
		driver.close(); // each time closing the browser

	}
//method to get date time stamp 

	public String getDateTimeStamp() {

	
		 return new SimpleDateFormat(" dd MM yyyy HH.mm.ss").format(Calendar.getInstance().getTime());
	
	}
		// TODO Auto-generated method stub
		
		
		
	}


