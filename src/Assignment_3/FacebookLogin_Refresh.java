package Assignment_3;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin_Refresh {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe"); //  chrome driver location 
		WebDriver driver = new ChromeDriver();// Intializing driver
		driver.manage().window().maximize();// maximixe window
		
	
		refresh(driver); //calling refresh method and passing driver 

		login(driver);// calling facebook login method and passing driver 
		
	}

	public static void login(WebDriver driver) {
		// TODO Auto-generated method stub

		driver.get("http://www.facebook.com"); // Open URL 
		
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("Username"); // element using css selector 
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("passwrd"); // element using css selector 
		driver.findElement(By.cssSelector("input[type='submit']")).click(); // element using css selector 
	
		
		
	}
	
	
	public static void refresh(WebDriver driver) {
		
		driver.get("http://www.google.com");  //open Google page
		driver.findElement(By.cssSelector("input[title='Search']")).sendKeys("test"); //  entering text
		driver.findElement(By.cssSelector("input[title='Search']")).sendKeys(Keys.ENTER); //hitting enter button 
		driver.navigate().refresh();// Refresh
		driver.navigate().back(); // back up to previous page
		driver.navigate().forward();// clicking forward page 
	
		
	}

}
