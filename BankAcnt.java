package com.Overiding;

import java.util.Scanner;
public class BankAcnt {
		public static void main(String[] args) {
			Scanner x= new Scanner(System.in);//scanning input
			Scanner y= new Scanner(System.in);
			int Choice;//installing
			int Nmb;
			boolean quit = false;
			float balance = 12000.f;
			do {
				 
					System.out.println("Choose your account 1.Savings 2.Current");
					System.out.println("Your Nmb");
					Nmb = y.nextInt();
					switch (Nmb) {
					case 1:{
						System.out.println("Transaction successful");
						break;
						}
					case 2:{
						System.out.println("Your Current Account");
						break;
						}
					default:{
						System.out.println("Entered wrong choice");
					    }
						break;
					}
				
	
					System.out.println("Enter your choice 3. Dep,4. Withdraw,5. Check");//options
					System.out.print("Your choice, 0 to quit: ");
					Choice = x.nextInt();//taking input
					switch (Choice) {
					case 3:
						float amount;
						System.out.print("Amount to deposit: ");
						amount = x.nextFloat();
						balance += amount;
						System.out.println(amount + " has been deposited.");
						System.out.println("Your amount is :" + balance);
						break;
					case 4:
						System.out.print("Amount to withdraw: ");
						amount = x.nextFloat();
						if (amount <= 0 || amount > balance) {
            	
							System.out.println("Withdrawal can't be dne do to in sufficant bal.");
						}
						else
						{
							balance -= amount;
							System.out.println(amount + " has been withdrawn.");
							System.out.println("Remaining balance is :" + balance);
						}
						break;

					case 5:
						System.out.println("Your balance:" + balance);break;
					case 0:
						quit = true; break;//if some one choose this it comes out of loops

					default:
						System.out.println("Wrong choice."); break;
					}
			}
					while (!quit);{

						System.out.println("enter correct choice");     }
			}
}







