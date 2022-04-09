import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTestGit {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\executable\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
	}
	
	@Test
	public void doLogin() {
		
		driver.findElement(By.id("login1")).sendKeys("dummyuser");
		driver.findElement(By.id("password")).sendKeys("pass123");
		
		
		
	}
	
	@AfterSuite
	public void tearDown() {
		
		driver.quit();
		
		
	}
}
