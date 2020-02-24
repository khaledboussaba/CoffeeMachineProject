package fr.lcdlv.coffeemachine;

public class DrinkMakerProtocol {

	private Command command;

	public DrinkMakerProtocol(Command command) {
		this.command = command;
	}

	public String makeDrink() {
		if (this.command.getDrinkType().equals("Chocolate")) {
			return "H::";
		}
		if (this.command.getDrinkType().equals("Coffee")) {
			return "C:2:0";
		}
		return "T:1:0";
	}	
	
}
