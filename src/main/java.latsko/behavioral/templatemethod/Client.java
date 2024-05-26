package behavioral.templatemethod;

import java.io.IOException;

public class Client {

	public static void main(String[] args) throws IOException {
		Order order = new Order("101");
		order.addItem("Soda", 2.50);
		order.addItem("Pizza", 12.54);
		order.addItem("Sushi", 25.20);

		OrderPrinter printer = new HtmlPrinter();
		printer.printOrder(order, "101.txt");
	}
}
