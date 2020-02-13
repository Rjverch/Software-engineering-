import java.io.FileWriter;
import java.util.Scanner;

public class EditOrder {
	
	public void Editorder(String path) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter new order details:");
		String order = sc.nextLine();
		try {
			FileWriter orderwriter = new FileWriter(path);
			orderwriter.write(order);
			orderwriter.close();
			System.out.println("order successfully edited");
		}catch(Exception e) {
			System.out.println("error in editing order");
		}
		sc.close();
	}
}
