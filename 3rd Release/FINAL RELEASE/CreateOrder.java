package Food.Delivery;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class CreateOrder {
	int lastOrderNumber = 500;
	public CreateOrder() {
		
	}
	
	void createOrder() {
		Scanner s = new Scanner(System.in);
		System.out.println("View menu? y/n");
		if (s.next().toLowerCase().contains("y")) {
			System.out.println("Pizza, burger, burrito, pudding, nachos");
		}
		String food = "";
		while (true) {
			System.out.println("Enter selection");
			if (food.length() > 0) {
				food = food + " and ";
			}
			food = food + s.nextLine();
			System.out.println("Select another food? y/n");
			if (!s.next().toLowerCase().contains("y")) {
				break;
			}
		}
		System.out.println("Enter name");
		String name = s.nextLine();
		System.out.println("Enter address");
		String address = s.nextLine();
		int orderNumber = ++lastOrderNumber;
		String order = name + ", " + food + ", " + orderNumber +
				", " + "Waiting on cook" + ", " + address;
		
		
		
		try {
			FileWriter fileWriter = new FileWriter("C:\\Users\\cocos\\Desktop\\orders.txt", true);
			PrintWriter printWriter = new PrintWriter(fileWriter);
			printWriter.println(order);
			printWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
}