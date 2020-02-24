package fr.lcdlv.coffeemachine;

import fr.lcdlv.coffeemachine.service.BeverageQuantityChecker;
import fr.lcdlv.coffeemachine.service.EmailNotifier;

public class DrinkMakerProtocol {

	private Command command;
	private MessageFormater messageFormater = new MessageFormater();

	private BeverageQuantityChecker beverageQuantityChecker;
	private EmailNotifier emailNotifier;
	
	public DrinkMakerProtocol(Command command, BeverageQuantityChecker beverageQuantityChecker, EmailNotifier emailNotifier) {
		this.command = command;
		this.beverageQuantityChecker = beverageQuantityChecker;
		this.emailNotifier = emailNotifier;
	}

	public String makeDrink() {
		if(beverageQuantityChecker.isEmpty(command.getDrinkType().toString())) {
            emailNotifier.notifyMissingDrink(command.getDrinkType().toString());
            return messageFormater.formatMessageShortage(command.getDrinkType());
        }
		return messageFormater.formatMessageCommand(command);
	}

}
