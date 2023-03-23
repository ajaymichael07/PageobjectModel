package page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateLead extends BaseClass {
	
		public CreateLead (ChromeDriver driver) {
			this.driver=driver;
		}

	public CreatingLead cl() {
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		return new CreatingLead(driver);
	}
	
}
