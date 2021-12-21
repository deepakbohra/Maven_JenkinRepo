package com.clientproject.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;  //Creating object for properties class
	
	public ReadConfig() {
		
	File  src  = new File("./Configuration/config.properties"); 
	
	//File is an another class from Java.IO
	
	// src variable is refer the Properties file 
	
	try {
		
		FileInputStream fis  = new FileInputStream(src);
		//file Input Steam is also an class 
		//opening the file in reading mode 
		
		pro  = new Properties();
		//pro object
		
		pro.load(fis);
		
	}catch(Exception e){
		
		System.out.println("Exception is " + e.getMessage());
		
		
	}
		
		
	}
	
	
	
	public String getApplcationURL()  
	
	{
		
		String  url =pro.getProperty("baseURL");
		return url;
		
		
    }
	
	public String getUsername()
	{
		
		String username =pro.getProperty("username");
		return username ;
	}
	
	
	public String getPassword()
	{
		
		String password =pro.getProperty("password");
		return password ;
	}
	
	
	
	public String getChromePath()
	{
		
		String chromePath =pro.getProperty("chromepath");
		return chromePath ;
	}
	
	

	public String getFireFoxPath()
	{
		
		String firefoxpath =pro.getProperty("firefoxpath");
		return firefoxpath ;
	}
	
	
	

}
 