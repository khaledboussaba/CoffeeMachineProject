package fr.lcdlv.coffeemachine.report;

import java.util.HashMap;
import java.util.Map;

import fr.lcdlv.coffeemachine.Command;
import fr.lcdlv.coffeemachine.DrinkType;

public final class SalesReport {

	private static Map<DrinkType, Integer> sales = new HashMap<DrinkType, Integer>();
	private static double totalSalesAmount;
	
	private SalesReport(Map<DrinkType, Integer> sales, double totalSalesAmount) {
		SalesReport.sales = sales;
		SalesReport.totalSalesAmount = totalSalesAmount;
	}
	
	public static void addSale(Command command) {
		if (!SalesReport.sales.containsKey(command.getDrinkType())) {
			SalesReport.sales.put(command.getDrinkType(), 0);
		}
		SalesReport.sales.put(command.getDrinkType(), SalesReport.sales.get(command.getDrinkType()) + 1);
		SalesReport.totalSalesAmount += command.getDrinkType().getPrice();
	}
	
    public static void printSalesReport() {
        System.out.println("Sales report\n\n" +
                "Drinks sold : \n\t" + "=> " + sales +
                "\n\nTotal money earned :\n\t" + "=> " + totalSalesAmount + " euro(s)");
    }
	
    public static double getTotalSalesAmount() {
    	return totalSalesAmount;
    }
}
