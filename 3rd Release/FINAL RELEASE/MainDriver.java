package Food.Delivery;

import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;


public class MainDriver {
	
	private static Scanner input;

	public static void main(String[] args)throws IOException  {
		System.out.print("Menu");
    	System.out.print("Press 0 to 'View Menu', 1 to 'View order', 2 to 'Cancel' 3 to 'Edit order', 4 to 'Create order', 5 to pay order");
    	
        input = new Scanner(System.in);
    	int number = 0;
    	while ((number = input.nextInt()) != -1)
    	{    	
	    number = input.nextInt();
	    //When user selects 0
	    if (number==0) {
	    	FoodItems foodlist=new FoodItems();
			
			for(Iterator1 iterator=foodlist.getIterator();iterator.hasNext();){
				String item=(String)iterator.next();
				System.out.println("\nFood Item : "+item);
			}
	    	
	    }
	    else if(number==1) {
        System.out.print("VIEWING MODE\n");
        System.out.print("----------------\n");
    	ViewOrder order =new ViewOrder();
        String fileName = "C:\\Users\\cocos\\Desktop\\orders.txt";
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
		edit.Editorder(fileName, input.nextInt());
    	}
    	else if (number == 4) {
    		CreateOrder creator = new CreateOrder();
    		creator.createOrder();
    	
    	}
    	else if (number == 5) {
    		System.out.println("Payed order");
    		CreditCard card= new CreditCard();
    		card.Payment(number);
    	}
    	else {
            System.out.print("Please enter a valied number");

    		}
    	
    	}

	}
}