package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import page.Login;

public class CreateLeads extends BaseClass {
	@Test
	public void run() {
		
		 new Login(driver) 
		.username()
		.password()
	     .login().crmsfa()
	     .cl().firstname().lastname().companyname().clicklead()
	     .verifi();
	
}
}
