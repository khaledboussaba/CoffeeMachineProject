package fr.lcdlv.coffeemachine;

public class Command {
	
	private String drinkType;
    private int sugarQuantity;
    
	public Command(String drinkType) {
		this.drinkType = drinkType;
	}

	public void addOneSugar() {
		this.sugarQuantity++;
	}

}
