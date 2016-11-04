package selenium.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestFacebook {
	
	public  WebDriver driver;
	public  LoginPage loginpage;
	
	@BeforeClass
	public void setUp(){
	
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ravi\\Downloads\\geckodriver-v0.10.0-win64\\geckodriver.exe");	
		 
		driver=new FirefoxDriver();
		
		loginpage = new LoginPage(driver);
	}
	
	@Test
	public void TestFacebookFireFox() throws InterruptedException{
		
	
	 Facebook facebook = new Facebook(driver);
	 Thread.sleep(1000);
	 System.out.println("Facebook is opened");
	 
	 Thread.sleep(1000);
	 System.out.println("Setting username in login field");
	 loginpage.setUsername();
	 loginpage.setPassword();
	 loginpage.clickLogin();
	
	}
	
	@AfterClass
	public void tearDown(){
		
		driver.quit();
	}

}
