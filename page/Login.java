package page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class Login extends BaseClass {
	public Login(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public Login username() {
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		return this;
	}

	public Login password() {
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		return this;
	}
	
	public Crsfa login() {
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		return new Crsfa(driver);
		
	}
}
