package com.cognizant.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Pokedex {
	WebDriver driver;
	@Before
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "C://Users/Admin/Desktop/chromedriver_win32//chromedriver.exe");
		
		driver = new ChromeDriver();
	}

	@After
	public void teardown() throws InterruptedException {
		Thread.sleep(30000);
		driver.quit();	
	}
	
//	You can implement missing steps with the snippets below:

		@Given("^I have clicked on route (\\d+)$")
		public void i_have_clicked_on_route(int arg1) throws Throwable {
			driver.manage().window().maximize();

			driver.get(Constants.POKEGAMEURL);
			driver.findElement(By.xpath("//*[@id=\"Charmander\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"startAdventure\"]")).click();
			
		}

		@When("^I wait for (\\d+) pokemons to be defeated$")
		public void i_wait_for_pokemons_to_be_defeated(int arg1) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@Then("^the pokemon counter should read (\\d+)/(\\d+)$")
		public void the_pokemon_counter_should_read(int arg1, int arg2) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@Given("^the pokemon counter reads (\\d+)/(\\d+)$")
		public void the_pokemon_counter_reads(int arg1, int arg2) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@When("^I click the Pewter City red hexagon$")
		public void i_click_the_Pewter_City_red_hexagon() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@Then("^I should be able to click on the Pewter City Shop Button$")
		public void i_should_be_able_to_click_on_the_Pewter_City_Shop_Button() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@Then("^I should be able to click on the Pewter City Gym Button$")
		public void i_should_be_able_to_click_on_the_Pewter_City_Gym_Button() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@Given("^the Pewter City Gym button is clickable$")
		public void the_Pewter_City_Gym_button_is_clickable() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@Given("^I am strong enough to beat the Gym Leader$")
		public void i_am_strong_enough_to_beat_the_Gym_Leader() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@When("^I click the Gym button at Pewter City$")
		public void i_click_the_Gym_button_at_Pewter_City() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@Then("^I should be able to beat the gym leader$")
		public void i_should_be_able_to_beat_the_gym_leader() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}
}
