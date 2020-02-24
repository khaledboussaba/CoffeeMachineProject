package fr.lcdlv.coffeemachine;

import static org.junit.Assert.*;

import org.junit.Test;

public class MakingDrinksTest {

	@Test
	public void makeOneTeaWithOneSugar() {
		Command command = new Command("Tea");
		command.addOneSugar();
		DrinkMakerProtocol drinkMaker = new DrinkMakerProtocol(command);
		String message = drinkMaker.makeDrink();
		assertEquals(message, "T:1:0");
	}
	
	@Test
	public void makeOneChocolateWithoutSugar() {
		Command command = new Command("Chocolate");
		DrinkMakerProtocol drinkMaker = new DrinkMakerProtocol(command);
		String message = drinkMaker.makeDrink();
		assertEquals(message, "H::");
	}
	
	@Test
	public void makeOneCoffeeWithTwoSugar() {
		Command command = new Command("Coffee");
		command.addOneSugar();
		command.addOneSugar();
		DrinkMakerProtocol drinkMaker = new DrinkMakerProtocol(command);
		String message = drinkMaker.makeDrink();
		assertEquals(message, "C:2:0");
	}



}
