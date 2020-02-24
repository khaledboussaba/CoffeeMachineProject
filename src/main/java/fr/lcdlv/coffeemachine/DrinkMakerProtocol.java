package fr.lcdlv.coffeemachine;

public class DrinkMakerProtocol {

	private Command command;
	private MessageFormater messageFormater = new MessageFormater();

	public DrinkMakerProtocol(Command command) {
		this.command = command;
	}

	public String makeDrink() {
		return messageFormater.formatMessageCommand(command);
	}

}
