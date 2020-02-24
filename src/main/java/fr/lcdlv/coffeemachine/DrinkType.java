package fr.lcdlv.coffeemachine;

public enum DrinkType {
	TEA(0.4), CHOCOLATE(0.5), COFFEE(0.6);
	
	private double price;
	
	DrinkType(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}
	
}
