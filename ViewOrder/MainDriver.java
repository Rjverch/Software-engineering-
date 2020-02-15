package Food.Delivery;

import java.io.IOException;
import java.util.Scanner;

public class MainDriver {
	
	private static Scanner input;

	public static void main(String[] args)throws IOException  {
		System.out.print("Menu");
    	System.out.print("Press 1 to 'View order', 2 to 'Cancel' 3 to 'Edit order', 4 to 'Create order'");
    	
        input = new Scanner(System.in);
    	int number = 0;
    	while ((number = input.nextInt()) != -1)
    	{    	
	number = input.nextInt();
    	if(number==1) {
        System.out.print("VIEWING MODE\n");
        System.out.print("----------------\n");

    	ViewOrder order =new ViewOrder();
        String fileName = "..\\orders.txt";
		order.Vieworder(fileName);
    	}
    	else if(number==2) {
          System.out.print("Comeback soon!");
          System.exit(number);
    	}
    	else if (number==3) {
    		EditOrder edit = new EditOrder();
		String fileName = "";
		System.out.println("enter order number");
		edit.Editorder(fileName, sc.nextInt());
    	}
    	else if (number == 4) {
    		CreateOrder creator = new CreateOrder();
    		creator.createOrder();
    	}
    	else {
            System.out.print("Please enter a valied number");

    	}
	
}
}
}
