package fr.lcdlv.coffeemachine;

public class Command {
	
	private DrinkType drinkType;
    private int sugarQuantity;
    private double insertedAmount;
    private boolean extraHot;
	
	public Command(DrinkType drinkType, double insertedAmount) {
		setDrinkType(drinkType);
		this.insertedAmount = insertedAmount;
	}
	
	public Command(DrinkType drinkType, boolean extraHot, double insertedAmount) {
		setDrinkType(drinkType);
		setExtraHot(extraHot);
		setInsertedAmount(insertedAmount);
	}

	public void addOneSugar() {
		this.sugarQuantity++;
	}
	
	public String getCodeDrinkTypeAndCheckIfExtraHot() {
		if (extraHot)
			return getCodeDrinkType() + "h";			
		return getCodeDrinkType();
	}
	
	private String getCodeDrinkType() {
		if (drinkType.equals(DrinkType.COFFEE))
			return "C";
		if (drinkType.equals(DrinkType.CHOCOLATE))
			return "H";
		if (drinkType.equals(DrinkType.TEA))
			return "T";
		return "O";
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
	
	public double getInsertedAmount() {
		return insertedAmount;
	}

	public void setInsertedAmount(double insertedAmount) {
		this.insertedAmount = insertedAmount;
	}
	
	public boolean isExtraHot() {
		return extraHot;
	}

	public void setExtraHot(boolean extraHot) {
		this.extraHot = extraHot;
	}

}
