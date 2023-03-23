package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import page.Login;

public class Crmsfa  extends BaseClass {
	
		
		@Test
		public void run() {
			
			 new Login(driver) 
			.username()
			.password()
		     .login().displayed().crmsfa();

}
}
