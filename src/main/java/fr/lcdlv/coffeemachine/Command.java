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

	public String getDrinkType() {
		return drinkType;
	}

	public void setDrinkType(String drinkType) {
		this.drinkType = drinkType;
	}

	public int getSugarQuantity() {
		return sugarQuantity;
	}

	public void setSugarQuantity(int sugarQuantity) {
		this.sugarQuantity = sugarQuantity;
	}

}
