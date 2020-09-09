package Assignment_10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class javaMusicDownload {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe"); // chrome driver location
		WebDriver driver = new ChromeDriver();// Intializing driver
		driver.manage().window().maximize();// maximixe window
		driver.get("https://www.last.fm/music/+free-music-downloads");// Open URl
		// driver.get("https://www.selenium.dev/downloads/");
		Screen screendownload;
		try {
			screendownload = new Screen();
			Pattern Pattern1 = new Pattern("//Java_Edureka//src//Assignment_10//Download.png");
			Pattern Pattern2 = new Pattern("//Java_Edureka//src//Assignment_10//Savelinkas.png");
			Pattern Pattern3 = new Pattern("//Java_Edureka//src//Assignment_10//Desktop.png");
			Pattern Pattern4 = new Pattern("//Java_Edureka//src//Assignment_10//Save.png");

			screendownload.rightClick(Pattern1);// right for download
			screendownload.click(Pattern2);// click on save link as
			screendownload.click(Pattern2);
			screendownload.click(Pattern3);
			screendownload.type("C:\\Music Assignment");// save as
			screendownload.click(Pattern4);
			screendownload.click(Pattern4);// save

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// TODO Auto-generated method stub

}
