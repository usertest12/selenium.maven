package selenium.maven;

import org.openqa.selenium.WebDriver;

public class Facebook {
	
	public WebDriver driver;
	
	public Facebook(WebDriver driver){
		
		 
		
		 driver.manage().window().maximize();
		 
		 driver.get("http://www.facebook.com");

	}

}
