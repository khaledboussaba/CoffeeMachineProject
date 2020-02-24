package fr.lcdlv.coffeemachine;

import static org.junit.Assert.*;

import org.junit.Test;

public class MakingDrinksTest {

	private Command command;
	private DrinkMakerProtocol drinkMaker;
	private String message;
	
	@Test
	public void makeOneTeaWithoutSugar() {
		command = new Command(DrinkType.TEA);
		drinkMaker = new DrinkMakerProtocol(command);
		message = drinkMaker.makeDrink();
		assertEquals(message, "T::");
	}
	
	@Test
	public void makeOneTeaWithOneSugar() {
		command = new Command(DrinkType.TEA);
		command.addOneSugar();
		drinkMaker = new DrinkMakerProtocol(command);
		message = drinkMaker.makeDrink();
		assertEquals(message, "T:1:0");
	}
	
	@Test
	public void makeOneTeaWithTwoSugar() {
		command = new Command(DrinkType.TEA);
		command.addOneSugar();
		command.addOneSugar();
		drinkMaker = new DrinkMakerProtocol(command);
		message = drinkMaker.makeDrink();
		assertEquals(message, "T:2:0");
	}
	
	@Test
	public void makeOneChocolateWithoutSugar() {
		command = new Command(DrinkType.CHOCOLATE);
		drinkMaker = new DrinkMakerProtocol(command);
		message = drinkMaker.makeDrink();
		assertEquals(message, "H::");
	}
	
	@Test
	public void makeOneChocolateWithOneSugar() {
		command = new Command(DrinkType.CHOCOLATE);
		command.addOneSugar();
		drinkMaker = new DrinkMakerProtocol(command);
		message = drinkMaker.makeDrink();
		assertEquals(message, "H:1:0");
	}
	
	@Test
	public void makeOneChocolateWithTwoSugar() {
		command = new Command(DrinkType.CHOCOLATE);
		command.addOneSugar();
		command.addOneSugar();
		drinkMaker = new DrinkMakerProtocol(command);
		message = drinkMaker.makeDrink();
		assertEquals(message, "H:2:0");
	}
	
	@Test
	public void makeOneCoffeeWithoutSugar() {
		command = new Command(DrinkType.COFFEE);
		drinkMaker = new DrinkMakerProtocol(command);
		message = drinkMaker.makeDrink();
		assertEquals(message, "C::");
	}
	
	@Test
	public void makeOneCoffeeWithOneSugar() {
		command = new Command(DrinkType.COFFEE);
		command.addOneSugar();
		drinkMaker = new DrinkMakerProtocol(command);
		message = drinkMaker.makeDrink();
		assertEquals(message, "C:1:0");
	}
	
	@Test
	public void makeOneCoffeeWithTwoSugar() {
		command = new Command(DrinkType.COFFEE);
		command.addOneSugar();
		command.addOneSugar();
		drinkMaker = new DrinkMakerProtocol(command);
		message = drinkMaker.makeDrink();
		assertEquals(message, "C:2:0");
	}

}
