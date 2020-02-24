package fr.lcdlv.coffeemachine.report;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.lcdlv.coffeemachine.Command;
import fr.lcdlv.coffeemachine.DrinkType;

public class SalesReportTest {
	
	@Test
	public void getReportAboutSales() {
		System.out.println("**Before sales**\n");
		SalesReport.printSalesReport();
		
		Command coffee = new Command(DrinkType.COFFEE, 1.0);
		Command coffee2 = new Command(DrinkType.COFFEE, 1.0);
		Command tea = new Command(DrinkType.TEA, 1.0);
		Command chocolate = new Command(DrinkType.CHOCOLATE, 1.0);
		Command orangeJuice = new Command(DrinkType.ORANGE_JUICE, 1.0);
		double total = coffee.getDrinkType().getPrice() + 
						coffee2.getDrinkType().getPrice() +
						tea.getDrinkType().getPrice() + 
						chocolate.getDrinkType().getPrice() + 
						orangeJuice.getDrinkType().getPrice();
		SalesReport.addSale(coffee);
		SalesReport.addSale(coffee2);
		SalesReport.addSale(tea);
		SalesReport.addSale(chocolate);
		SalesReport.addSale(orangeJuice);

		assertEquals(SalesReport.getTotalSalesAmount(), total, 0.00);
		
		System.out.println("\n**After sales**\n");
		SalesReport.printSalesReport();
	}

}
