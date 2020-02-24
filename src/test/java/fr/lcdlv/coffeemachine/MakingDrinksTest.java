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

}
