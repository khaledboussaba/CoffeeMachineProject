package fr.lcdlv.coffeemachine;

import static org.junit.Assert.*;

import org.junit.Test;

public class MakingDrinksTest {

	private Command command;
	private DrinkMakerProtocol drinkMaker;
	private String message;
	
	@Test
	public void makeOneTeaWithoutSugar() {
		command = new Command(DrinkType.TEA, 1.0);
		drinkMaker = new DrinkMakerProtocol(command);
		message = drinkMaker.makeDrink();
		assertEquals(message, "T::");
	}
	
	@Test
	public void makeOneTeaWithOneSugar() {
		command = new Command(DrinkType.TEA, 1.0);
		command.addOneSugar();
		drinkMaker = new DrinkMakerProtocol(command);
		message = drinkMaker.makeDrink();
		assertEquals(message, "T:1:0");
	}
	
	@Test
	public void makeOneTeaWithTwoSugar() {
		command = new Command(DrinkType.TEA, 1.0);
		command.addOneSugar();
		command.addOneSugar();
		drinkMaker = new DrinkMakerProtocol(command);
		message = drinkMaker.makeDrink();
		assertEquals(message, "T:2:0");
	}
	
	@Test
	public void makeOneChocolateWithoutSugar() {
		command = new Command(DrinkType.CHOCOLATE, 1.0);
		drinkMaker = new DrinkMakerProtocol(command);
		message = drinkMaker.makeDrink();
		assertEquals(message, "H::");
	}
	
	@Test
	public void makeOneChocolateWithOneSugar() {
		command = new Command(DrinkType.CHOCOLATE, 1.0);
		command.addOneSugar();
		drinkMaker = new DrinkMakerProtocol(command);
		message = drinkMaker.makeDrink();
		assertEquals(message, "H:1:0");
	}
	
	@Test
	public void makeOneChocolateWithTwoSugar() {
		command = new Command(DrinkType.CHOCOLATE, 1.0);
		command.addOneSugar();
		command.addOneSugar();
		drinkMaker = new DrinkMakerProtocol(command);
		message = drinkMaker.makeDrink();
		assertEquals(message, "H:2:0");
	}
	
	@Test
	public void makeOneCoffeeWithoutSugar() {
		command = new Command(DrinkType.COFFEE, 1.0);
		drinkMaker = new DrinkMakerProtocol(command);
		message = drinkMaker.makeDrink();
		assertEquals(message, "C::");
	}
	
	@Test
	public void makeOneCoffeeWithOneSugar() {
		command = new Command(DrinkType.COFFEE, 1.0);
		command.addOneSugar();
		drinkMaker = new DrinkMakerProtocol(command);
		message = drinkMaker.makeDrink();
		assertEquals(message, "C:1:0");
	}
	
	@Test
	public void makeOneCoffeeWithTwoSugar() {
		command = new Command(DrinkType.COFFEE, 1.0);
		command.addOneSugar();
		command.addOneSugar();
		drinkMaker = new DrinkMakerProtocol(command);
		message = drinkMaker.makeDrink();
		assertEquals(message, "C:2:0");
	}

	@Test
	public void tryToMakeOneTeaWithEnoughInsertedAmount() {
		command = new Command(DrinkType.TEA, 0.2);
		drinkMaker = new DrinkMakerProtocol(command);
		double missingMoney = command.getDrinkType().getPrice() - command.getInsertedAmount();;
		message = drinkMaker.makeDrink();
		assertEquals(message, "M:" + missingMoney + " euro is missing !");
	}
	
	@Test
	public void tryToMakeOneCoffeeWithEnoughInsertedAmount() {
		command = new Command(DrinkType.COFFEE, 0.5);
		drinkMaker = new DrinkMakerProtocol(command);
		double missingMoney = command.getDrinkType().getPrice() - command.getInsertedAmount();
		message = drinkMaker.makeDrink();
		assertEquals(message, "M:" + missingMoney + " euro is missing !");
	}
	
	@Test
	public void tryToMakeOneChocolateWithEnoughInsertedAmount() {
		command = new Command(DrinkType.CHOCOLATE, 0.2);
		drinkMaker = new DrinkMakerProtocol(command);
		double missingMoney = command.getDrinkType().getPrice() - command.getInsertedAmount();;
		message = drinkMaker.makeDrink();
		assertEquals(message, "M:" + missingMoney + " euro is missing !");
	}
	
	@Test
	public void makeOneOrangeJuice() {
		command = new Command(DrinkType.ORANGE_JUICE, 1.0);
		drinkMaker = new DrinkMakerProtocol(command);
		message = drinkMaker.makeDrink();
		assertEquals(message, "O::");
	}
	
	@Test
	public void tryToMakeOneOrangeJuiceWithEnoughInsertedAmount() {
		command = new Command(DrinkType.ORANGE_JUICE, 0.2);
		drinkMaker = new DrinkMakerProtocol(command);
		double missingMoney = command.getDrinkType().getPrice() - command.getInsertedAmount();
		message = drinkMaker.makeDrink();
		assertEquals(message, "M:" + missingMoney + " euro is missing !");
	}
	
	@Test
	public void makeOneCoffeeExtraHotWithoutSugar() {
		command = new Command(DrinkType.COFFEE, true, 1.0);
		drinkMaker = new DrinkMakerProtocol(command);
		message = drinkMaker.makeDrink();
		assertEquals(message, "Ch::");
	}
	
	@Test
	public void makeOneChocolateExtraHotWithOneSugar() {
		command = new Command(DrinkType.CHOCOLATE, true, 1.0);
		command.addOneSugar();
		drinkMaker = new DrinkMakerProtocol(command);
		message = drinkMaker.makeDrink();
		assertEquals(message, "Hh:1:0");
	}
	
	@Test
	public void makeOneTeaExtraHotWithTwoSugar() {
		command = new Command(DrinkType.TEA, true, 1.0);
		command.addOneSugar();
		command.addOneSugar();
		drinkMaker = new DrinkMakerProtocol(command);
		message = drinkMaker.makeDrink();
		assertEquals(message, "Th:2:0");
	}
	
	@Test
	public void tryToMakeOneTeaExtraHotWithEnoughInsertedAmount() {
		command = new Command(DrinkType.TEA, true, 0.1);
		drinkMaker = new DrinkMakerProtocol(command);
		double missingMoney = command.getDrinkType().getPrice() - command.getInsertedAmount();
		message = drinkMaker.makeDrink();
		assertEquals(message, "M:" + missingMoney + " euro is missing !");
	}
	
}
