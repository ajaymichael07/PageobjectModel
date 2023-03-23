package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public  ChromeDriver driver;
	
	@BeforeMethod
	public void url() {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("start-maximized");
		driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/main");
		

	}
	@AfterMethod
	
	public void close() {
		
		driver.quit();
		
		
		}

}
