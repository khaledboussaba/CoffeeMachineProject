package fr.lcdlv.coffeemachine;

public class DrinkMakerProtocol {

	private Command command;

	public DrinkMakerProtocol(Command command) {
		this.command = command;
	}

	public String makeDrink() {
		String message = "";
		if (command.getInsertedAmount() < command.getDrinkType().getPrice()) {
			double missingMoney = command.getDrinkType().getPrice() - command.getInsertedAmount();
			message += "M:" + missingMoney + " euro is missing !";
		} else {
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
		}
		return message;
	}

}
