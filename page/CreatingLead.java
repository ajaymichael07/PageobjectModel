package page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreatingLead extends BaseClass{
	
	public CreatingLead(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public CreatingLead companyname() {
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		return this;
		
	}
	
	public CreatingLead  firstname() {
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ajay");
		
		return this;
	}
	
	public CreatingLead lastname() {
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		
		return this;
	}
	
	public Verification clicklead() {
		
		driver.findElement(By.className("smallSubmit")).click();
		
		return new Verification(driver);
	}

}
