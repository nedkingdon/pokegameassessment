package com.cognizant.Test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.After;

public class Task2 {
	public static WebDriver driver=PokeTestRunner.driver;
	@After
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();	
	}
	
	
	@Test
	public void clicker() throws InterruptedException{
		while(driver.findElement(By.id("currentRoute")).getText().contains("10/10")==false){
			driver.findElement(By.id("enemyInfo")).click();
			Thread.sleep(50);
		}
		Thread.sleep(2000);
		Actions builder = new Actions(driver);   
		builder.moveToElement(driver.findElement(By.id("enemyInfo")), -50, 0).click().build().perform();
		
	}
}
