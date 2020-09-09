package Assignment_4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe"); // chrome driver location
		WebDriver driver = new ChromeDriver();// Intializing driver

		loginCheckBox(driver);// method for checkbox disable /enable method
		readtext(driver);// read text method
		attribute(driver);// disabled attribute method

	}

	public static void loginCheckBox(WebDriver driver) {
		// TODO Auto-generated method stub
		WebElement checkbox;
		WebElement search;

		driver.get("http://www.spicejet.com"); // Open URL
		checkbox = driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount"));// Webelement for check box
																						// student
		if (checkbox.isSelected() == true) {
			System.out.println("Check box is  selected");
		} else {
			System.out.println("checkbox is not selected");
		}

		checkbox.click();// after clicking verifying if check box is selected or not

		if (checkbox.isSelected() == true) {
			System.out.println("Check box is  selected");
		} else {
			System.out.println("checkbox is not selected");
		}

		search = driver.findElement(By.xpath("//input[@value='Search']"));

		Assert.assertTrue(search.isDisplayed()); // Verifying if the weblement is present

	}

	public static void readtext(WebDriver driver) {
		// TODO Auto-generated method stub

		WebElement readtextbox;
		String text;

		driver.get("http://www.spicejet.com"); // Open URL
		readtextbox = driver.findElement(By.className("paxinfo"));// Webelement for Passenger read text
		text = readtextbox.getText();
		System.out.println(text);

	}

	public static void attribute(WebDriver driver) {

		WebElement dis_attirbute;
		driver.get("http://www.spicejet.com"); // Open URL

		dis_attirbute = driver.findElement(By.id("Div1")); // storing webelement of return date field
		String text = dis_attirbute.getAttribute("style");// get style attribute from webelement
		if (text.contains("0.5")) {
			System.out.println("return date is disabled");
		} else if (text.contains("1")) {
			System.out.println("return date is enabled");
		}

		dis_attirbute.click();// click the return date

		// after clicking verifying if attribute is changed or not
		String retext = dis_attirbute.getAttribute("style");
		if (retext.contains("0.5")) {
			System.out.println("return date is disabled");
		} else if (retext.contains("1")) {
			System.out.println("return date is enabled");
		}

	}

}
