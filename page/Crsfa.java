package page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class Crsfa extends BaseClass {
	
	public Crsfa (ChromeDriver driver) {
		this.driver=driver;
	}
public Crsfa displayed() {
		
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		if(displayed) {
			System.out.println("It is displayed");
		}else {
			System.out.println("It is displayed");
			
			
		}
		return this;
	}


	
	public CreateLead crmsfa(){
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		return new CreateLead(driver);
	}
}
