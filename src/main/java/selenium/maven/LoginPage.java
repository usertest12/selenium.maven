package selenium.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LoginPage {
	
	public WebDriver driver;
	
	
	public LoginPage(WebDriver driver){
		
		this.driver = driver;
		
	}
	
	

	public void setUsername() throws InterruptedException {
		
		Thread.sleep(1000);
		WebElement username = driver.findElement(By.xpath(".//*[@id='email']"));
		username.sendKeys("sruthi.kura@gmail.com");
		
	}
	
    public void setPassword() {
    	
    	WebElement password = driver.findElement(By.xpath(".//*[@id='pass']"));
    	password.sendKeys("friend");
		
	}
    
    public void clickLogin() {
    	
    	WebElement loginButton = driver.findElement(By.xpath(".//*[@id='u_0_n']"));
    	loginButton.click();
		
	}
	

}
