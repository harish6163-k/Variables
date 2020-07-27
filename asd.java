package Assignments;

import java.util.Scanner;
class batsman
{
private int bcode;
private String bname;
private int innings,notout,runs;
double batavg;

private void calcavg()
	{
	batavg =runs/(innings-notout);
	}
public void readdata()
{
Scanner in=new Scanner(System.in);
System.out.print("Enter the batsman code: ");
bcode=in.nextInt();
System.out.print("Enter the batsman name: ");
bname=in.next();
System.out.print("Enter the number of innings: ");
innings=in.nextInt();
System.out.print("Enter the number of not out: ");
notout=in.nextInt();
System.out.print("Enter the batsman runs: ");
runs=in.nextInt();
calcavg();
}
public void displaydata()
	{
		System.out.println("batsman code: " +bcode);
		System.out.println("batsman name: " +bname);
		System.out.println("number of innings: " +innings);
		System.out.println("number of not out: " +notout);
		System.out.println("batsman runs: " +runs);
		System.out.println("batsman average: " +batavg);
	}
}
class batman
	{
		public static void main(String args[])
		{
			batsman b=new batsman();
			b.readdata();
			b.displaydata();
			}
}