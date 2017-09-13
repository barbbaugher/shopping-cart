import java.util.ArrayList;
import java.util.Scanner;

public class ShopApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Item itemsInCart = new Item();

		ArrayList<String> itemNames = new ArrayList<String>();
		ArrayList<Double> itemPrices = new ArrayList<Double>();
		ArrayList<Integer> itemQuantities = new ArrayList<Integer>();

		String continueShopping;

		do {

			System.out.println("Enter the name of the item: ");
			itemNames.add(itemsInCart.itemName = input.next());

			System.out.println("Enter the unit price: ");
			itemPrices.add(itemsInCart.itemPrice = input.nextDouble());

			System.out.println("Enter the quantity: ");
			itemQuantities.add(itemsInCart.itemQuantity = input.nextInt());

			System.out.println("Current cart:");
			
			double runningTotal = 0;
			
			for (int index = 0; index < itemNames.size(); index++) {
				System.out.print("Item: " + itemNames.get(index));
				System.out.print("\tPrice: " + itemPrices.get(index));
				System.out.println("\t Quantity: " + itemQuantities.get(index));
				double totalItemPrice = itemPrices.get(index) * itemQuantities.get(index);
				runningTotal += totalItemPrice;
			}
		
			System.out.println("Total Cart Price: " + runningTotal);
			
			System.out.println("Continue shopping (y/n)? ");
			continueShopping = input.next();

		} while (continueShopping.equalsIgnoreCase("y"));

		input.close();
	}

}
