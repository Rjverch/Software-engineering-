package Food.Delivery;

import java.io.IOException;
import java.util.Scanner;

public class MainDriver {
	
	private static Scanner input;

	public static void main(String[] args)throws IOException  {
		System.out.print("Menu");
    	System.out.print("Press 1 to 'View order', 2 to 'Cancel' 3 to 'Edit order'");
    	
        input = new Scanner(System.in);
    	int number = input.nextInt();
    	while ((number = input.nextInt()) != -1)
    	{    	
		
    	if(number==1) {
        System.out.print("VIEWING MODE\n");
        System.out.print("----------------\n");

    	ViewOrder order =new ViewOrder();
        String fileName = "C:\\Users\\cocos\\Documents\\software engineering 1\\Software-engineering--master\\orders.txt";
		order.Vieworder(fileName);
    	}
    	else if(number==2) {
          System.out.print("Comeback soon!");
          System.exit(number);
    	}
    	else if (number==3) {
    		//call edit order method
    	}
    	else {
            System.out.print("Please enter a valied number");

    	}
	
}
}
}