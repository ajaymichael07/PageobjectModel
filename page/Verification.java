package page;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;


public class Verification extends BaseClass{

	public Verification(ChromeDriver driver) {
		this.driver=driver;
	}
	public void verifi() {
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	
	
	
}
