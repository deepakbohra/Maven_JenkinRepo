package com.clientproject.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.clientproject.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readConfig = new ReadConfig();
	
	
	 public String baseURL =readConfig.getApplcationURL();
	 public String username =readConfig.getUsername();
	 public String password= readConfig.getPassword();
	 public static WebDriver driver;
	 
	 //All the above thing are common for every test case
	 //Same Parameter we have to pass in the Method also 
	 @Parameters("browser")
	 @BeforeClass //As soon as your test cases class started before that this will method will run 
	 public void setup(String br) {
		 if(br.equals("chrome"))
		 {
		 System.setProperty("webdriver.chrome.driver", readConfig.getChromePath());
		 driver = new ChromeDriver();
		 }
		 
		 else if(br.equals("firefox"))
		 {
			 
			 System.setProperty("webdriver.gecko.driver", readConfig.getFireFoxPath());
			 driver = new FirefoxDriver(); 
			 
		 }
		 
		 else if(br.equals("ie"))
		 {
			 
		 }
		 
		 driver.get(baseURL);
	 }
	 @AfterClass  //After the test case class method completed this method will going to un 
	 public void tearDown() {
		 
		 driver.quit();
	 }

}
