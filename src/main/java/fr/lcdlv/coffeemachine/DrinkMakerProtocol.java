package fr.lcdlv.coffeemachine;

public class DrinkMakerProtocol {

	private Command command;

	public DrinkMakerProtocol(Command command) {
		this.command = command;
	}

	public String makeDrink() {
		return "T:1:0";
	}	
	
}
