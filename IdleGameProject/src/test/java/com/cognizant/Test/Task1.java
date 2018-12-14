package com.cognizant.Test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Task1 {
	public static WebDriver driver=PokeTestRunner.driver;
	@Before
	public void setup() {

		
		
		
	}

	
	
	@Test
	public void pokeGame() throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.get(Constants.POKEGAMEURL);
		
		FirstPage firstpage = PageFactory.initElements(driver, FirstPage.class);
		
		FirstPage.startAdventure();
		Thread.sleep(1000);
		
		
		
}
}
