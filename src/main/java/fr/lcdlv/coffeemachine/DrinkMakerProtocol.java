package fr.lcdlv.coffeemachine;

public class DrinkMakerProtocol {

	private Command command;

	public DrinkMakerProtocol(Command command) {
		this.command = command;
	}

	public String makeDrink() {
		String message = "";
		switch (command.getSugarQuantity()) {
		case 2:
			message += command.getCodeDrinkType() + ":2:0";
			break;
		case 1:
			message += command.getCodeDrinkType() + ":1:0";
			break;
		case 0:
			message += command.getCodeDrinkType() + "::";
			break;
		default:
			break;
		}
		return message;
	}
	
}
