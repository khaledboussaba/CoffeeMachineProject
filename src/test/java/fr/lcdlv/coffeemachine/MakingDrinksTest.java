package fr.lcdlv.coffeemachine;

import static org.junit.Assert.*;

import org.junit.Test;

public class MakingDrinksTest {

	private Command command;
	private DrinkMakerProtocol drinkMaker;
	private String message;
	
	@Test
	public void makeOneTeaWithoutSugar() {
		command = new Command("Tea");
		drinkMaker = new DrinkMakerProtocol(command);
		message = drinkMaker.makeDrink();
		assertEquals(message, "T::");
	}
	
	@Test
	public void makeOneTeaWithOneSugar() {
		command = new Command("Tea");
		command.addOneSugar();
		drinkMaker = new DrinkMakerProtocol(command);
		message = drinkMaker.makeDrink();
		assertEquals(message, "T:1:0");
	}
	
	@Test
	public void makeOneTeaWithTwoSugar() {
		command = new Command("Tea");
		command.addOneSugar();
		command.addOneSugar();
		drinkMaker = new DrinkMakerProtocol(command);
		message = drinkMaker.makeDrink();
		assertEquals(message, "T:2:0");
	}
	
	@Test
	public void makeOneChocolateWithoutSugar() {
		command = new Command("Chocolate");
		drinkMaker = new DrinkMakerProtocol(command);
		message = drinkMaker.makeDrink();
		assertEquals(message, "H::");
	}
	
	@Test
	public void makeOneChocolateWithOneSugar() {
		command = new Command("Chocolate");
		command.addOneSugar();
		drinkMaker = new DrinkMakerProtocol(command);
		message = drinkMaker.makeDrink();
		assertEquals(message, "H:1:0");
	}
	
	@Test
	public void makeOneChocolateWithTwoSugar() {
		command = new Command("Chocolate");
		command.addOneSugar();
		command.addOneSugar();
		drinkMaker = new DrinkMakerProtocol(command);
		message = drinkMaker.makeDrink();
		assertEquals(message, "H:2:0");
	}
	
	@Test
	public void makeOneCoffeeWithoutSugar() {
		command = new Command("Coffee");
		drinkMaker = new DrinkMakerProtocol(command);
		message = drinkMaker.makeDrink();
		assertEquals(message, "C::");
	}
	
	@Test
	public void makeOneCoffeeWithOneSugar() {
		command = new Command("Coffee");
		command.addOneSugar();
		drinkMaker = new DrinkMakerProtocol(command);
		message = drinkMaker.makeDrink();
		assertEquals(message, "C:1:0");
	}
	
	@Test
	public void makeOneCoffeeWithTwoSugar() {
		command = new Command("Coffee");
		command.addOneSugar();
		command.addOneSugar();
		drinkMaker = new DrinkMakerProtocol(command);
		message = drinkMaker.makeDrink();
		assertEquals(message, "C:2:0");
	}

}
