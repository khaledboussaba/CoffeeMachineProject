package fr.lcdlv.coffeemachine.shortage;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import fr.lcdlv.coffeemachine.Command;
import fr.lcdlv.coffeemachine.DrinkMakerProtocol;
import fr.lcdlv.coffeemachine.DrinkType;
import fr.lcdlv.coffeemachine.service.BeverageQuantityChecker;
import fr.lcdlv.coffeemachine.service.EmailNotifier;

public class BeverageQuantityCheckerTest {

	private Command command;
	private DrinkMakerProtocol drinkMaker;
	private String message;
	
	@Test
	public void shortageDrinkNotifies() {
		command = new Command(DrinkType.COFFEE, 1.0);
		BeverageQuantityChecker checker = mock(BeverageQuantityChecker.class);
		when(checker.isEmpty(command.getDrinkType().toString())).thenReturn(true);
		EmailNotifier notifier = mock(EmailNotifier.class);
		doNothing().when(notifier).notifyMissingDrink(command.getDrinkType().toString());
		drinkMaker = new DrinkMakerProtocol(command, checker, notifier);
		message = drinkMaker.makeDrink();
		
		assertEquals(message, command.getDrinkType().name() + " is in shortage, a notification has been sent !");
		
		System.out.println(message);
	}

}
