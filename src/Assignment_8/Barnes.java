package Assignment_8;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
public class Barnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe"); //  chrome driver location 
		WebDriver driver = new ChromeDriver();// Intializing driver
		driver.manage().window().maximize();// maximixe window
		
	
		barnes(driver); //calling barnes method and passing driver 

	}

	public static void barnes(WebDriver driver) {
		// TODO Auto-generated method stub

		driver.get("https://www.barnesandnoble.com/"); // Open URL
		Actions mouse=new Actions(driver);
		WebElement books = driver.findElement(By.xpath("//li[@id='topNav1']/a")); // mouse hover action to books
		mouse.moveToElement(books).build().perform();
		driver.findElement(By.linkText("Biography")).click(); //clicking biography link 
		
		// validating best seller text
		String bestsellertext=driver.findElement(By.xpath("//section[@id='hotBooksWithDesc_Bestsellers']/header/h2")).getText();
		String actualtext="Bestsellers";
		Assert.assertEquals(actualtext, bestsellertext);
		
		
		//validating biography text  -- actual is Biography books but expected is biography so test will fail
		
		String biographytext=driver.findElement(By.className("text")).getText();
		System.out.println(biographytext);
		actualtext="Biography";
		Assert.assertEquals(actualtext,biographytext);
		
		
		
		
		driver.close();
		
		
		
	}
	
	
		
	}

	

