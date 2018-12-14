package com.cognizant.Test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PokeTestRunner{
	public static WebDriver driver;
	public static void main(String [] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users/Admin/Desktop/chromedriver_win32//chromedriver.exe");
		  
		  driver = new ChromeDriver();
	   
		  start();
		  
	}
		  
		  public static void start() {
	Result result= JUnitCore.runClasses(Task1.class,Task2.class);
	
	}
}

