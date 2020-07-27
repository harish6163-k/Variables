package Assignments;
import java.util.Scanner;
class BOOK
		{
		private int book_no,no_copies;
		private String book_title;
		private float price,cost;
		private void TOTAL_COST(int n)
		{
			cost=n*price;
		}
	public void input()
	{
			Scanner in=new Scanner(System.in);
			System.out.print("Enter the Book Number: ");
				book_no=in.nextInt();
			System.out.print("Enter the Book Title: ");
				book_title=in.next();
			System.out.print("Enter the Book Price: ");
				price=in.nextFloat();
	}
public void purchase()
{
Scanner in=new Scanner(System.in);
System.out.print("enter the no of copies purchase:");
no_copies=in.nextInt();
TOTAL_COST(no_copies);
}
public void display()
{
System.out.println("Book Number: "+book_no);
System.out.println("Book Title: "+book_title);
System.out.println("Book Price: "+price);
System.out.println("Number of copies: "+no_copies);
System.out.println("total Cost " +cost);
	}
}
class books
	{
		public static void main(String args[])
		{
			BOOK b= new BOOK();
			b.input();
			b.purchase();
			b.display();
		}
}