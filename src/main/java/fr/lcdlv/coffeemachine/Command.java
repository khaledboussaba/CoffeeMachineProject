package fr.lcdlv.coffeemachine;

public class Command {
	
	private DrinkType drinkType;
    private int sugarQuantity;
    
	public Command(DrinkType drinkType) {
		setDrinkType(drinkType);
	}

	public void addOneSugar() {
		this.sugarQuantity++;
	}

	public DrinkType getDrinkType() {
		return drinkType;
	}

	public void setDrinkType(DrinkType drinkType) {
		this.drinkType = drinkType;
	}

	public int getSugarQuantity() {
		return sugarQuantity;
	}

	public void setSugarQuantity(int sugarQuantity) {
		this.sugarQuantity = sugarQuantity;
	}
	
	public String getCodeDrinkType() {
		if (drinkType.equals(DrinkType.COFFEE))
			return "C";
		if (drinkType.equals(DrinkType.CHOCOLATE))
			return "H";
		return "T";
	}

}
