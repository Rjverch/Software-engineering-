package Food.Delivery;

import java.util.Scanner;
import java.io.IOException;

public class CreditCard {
	protected String CardNum;
	protected String exp;
	protected String cvv;
	protected String zip;
	

public void Payment(double price){
	boolean loopNum =true;
	boolean loopExp =true;
	boolean loopZip = true;
	boolean loopCvv = true;
	System.out.println("Would you like to pay with card(1) or cash(2)?");
	int paymentchoice;
	Scanner sc = new Scanner(System.in);
	if (sc.hasNextInt()) {
		paymentchoice = sc.nextInt();
			if (paymentchoice == 1) {
				System.out.println("Please input your card number.");
				sc.nextLine(); //to get rid of \n token that isn't removed from .nextInt()
			while (loopNum){
				this.CardNum =sc.nextLine();
				if ((CardNum.length() < 17) && ( CardNum.length() > 14)) {
					for (int i=0;i<CardNum.length();i++) {
						if (Character.isDigit(CardNum.charAt(i)));
						else {
							System.out.println("Please only insert numbers.");
							i=i+15;
						}
					}
					loopNum=false;
					System.out.println("Please input your card expiration as a four digit number. (For example, January 2019 = 0119)");
				while (loopExp){
					this.exp=sc.nextLine();
					if (exp.length() ==4) {
						for (int i=0;i<4;i++) {
							if (Character.isDigit(exp.charAt(i)));
							else {
								System.out.println("Please only insert numbers.");
								i=i+4;
							}
						
						}	
						//exp and num are correct
						loopExp=false;
						while (loopZip) {
							System.out.println("Please input your card's billing zip code.");
							this.zip=sc.nextLine();
							if (zip.length() == 5) {
								for (int i=0;i<5;i++) {
									if (Character.isDigit(zip.charAt(i)));
									else {
										System.out.println("Please only insert numbers.");
										i=i+5;
									}
								}
								// zip code is right too
								loopZip=false;
								while(loopCvv) {
									System.out.println("Please input your card's Security code. (For 15-digit numbers, its a 4 digit number. For 16 digit numbers, it is 3 numbers.)");
								this.cvv=sc.nextLine();
								if (((cvv.length() == 3) && (CardNum.length() == 16)) || ((cvv.length() == 4) && (CardNum.length() == 15))) {
									for (int i=0;i<cvv.length();i++) {
										if (Character.isDigit(cvv.charAt(i)));
										else {
											System.out.println("Please only insert numbers.");
											i=i+5;
										}
									}
									loopCvv=false;
									System.out.println("Thank you for your payment!");
									//end case if completely correct
								}
								else {
									System.out.println("Please only insert 3 or 4 digits.");
								}
								}
							}
						
							else {
								System.out.println("Please only insert five digits.");
							}
						}
					}
					else {
						System.out.println("Please only insert four digits.");
					}
				}//while loop for card Exp
				}
				else {
					System.out.println("Must be valid card number length (15-16 digits)");
				}
			 }//while loop for CardNum
			}
	
			if (paymentchoice==2) {
				System.out.printf("Please have your cash ready for the driver when they arrive. The total is again $");
				System.out.println(price);
				return;
			}
	}
  
}
}
//Testing
