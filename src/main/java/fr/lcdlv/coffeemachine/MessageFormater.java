package fr.lcdlv.coffeemachine;

public class MessageFormater {

	public String formatMessageCommand(Command command) {
		String message = "";
		if (command.getInsertedAmount() < command.getDrinkType().getPrice()) {
			double missingMoney = command.getDrinkType().getPrice() - command.getInsertedAmount();
			message += "M:" + missingMoney + " euro is missing !";
		} else {
			switch (command.getSugarQuantity()) {
			case 2:
				message += command.getCodeDrinkTypeAndCheckIfExtraHot() + ":2:0";
				break;
			case 1:
				message += command.getCodeDrinkTypeAndCheckIfExtraHot() + ":1:0";
				break;
			case 0:
				message += command.getCodeDrinkTypeAndCheckIfExtraHot() + "::";
				break;
			default:
				break;
			}
		}
		return message;
	}

}
