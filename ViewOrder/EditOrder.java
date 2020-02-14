import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EditOrder {
	
	public void Editorder(String path, int ordernum) {
		Scanner sc = new Scanner(System.in);
		
		try {
			BufferedReader readorder = new BufferedReader(new FileReader(path));
			FileWriter orderwriter = new FileWriter(path);
			String row;
			while((row = readorder.readLine()) != null) {
				String[] order = row.split(",");
				if(Integer.parseInt(order[2]) == ordernum) {
					System.out.println("Enter new order details:");
					String neworder = sc.nextLine();
					orderwriter.append(neworder);
					sc.close();
					readorder.close();
					orderwriter.close();
					return;
				}
			System.out.print("order not found");
			return;
			}
		} catch (IOException e1) {
			System.out.print("error")
		}
		
	}
}
