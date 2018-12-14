package com.cognizant.Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstPage {
@FindBy(id="Charmander")
public static WebElement pokemonChoice;

@FindBy(id="startAdventure")
public static WebElement startAdventure;



public static void startAdventure() {
	pokemonChoice.click();
	startAdventure.click();
}

}

