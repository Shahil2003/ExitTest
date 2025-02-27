package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
	// Declare the WebDriver to be used for browser interaction
	protected WebDriver driver;
	
	// This method will run before each test, setting up the browser and environment
	@BeforeTest
	public void setUp() throws InterruptedException {
		
		//Initialize the WebDriver
		driver=new ChromeDriver();
		
		//Navigate to the URL(amazon)
		driver.get("https://www.amazon.com/");
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		// Set an implicit wait of 10 seconds for elements to be loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Wait for 3 seconds and refresh the page for avoid the captcha
		Thread.sleep(3000);
		driver.navigate().refresh();
	}
	
	// Quit the WebDriver and close the browser window after test
	@AfterTest
	public void exit() {
		driver.quit();
	}

}

