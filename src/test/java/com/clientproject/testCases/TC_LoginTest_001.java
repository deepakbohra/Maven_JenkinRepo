package com.clientproject.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.clientproject.pagesObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	
	@Test
	public void loginTest() {
			
		driver.get(baseURL);
		
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clickSumbit();
		//System.out.println("Runinng the test case ");
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			
			Assert.assertTrue(true);
		}else {
			
			Assert.assertTrue(false);			
		}
		
	}

}
