package Assignments;

import java.util.Scanner;
class Test {
private int testcode;
private String Des;
private int nocandi;
private int calcntr() {
	return (nocandi/100+1);
}
public void schedule() {
	Scanner s = new Scanner(System.in);
	System.out.print("Enter the testcode values:");
	testcode = s.nextInt();
	System.out.print("Enter the description:");
	Des = s.next();
System.out.print("No. of candidate:");
nocandi = s.nextInt();
	calcntr();
}
public void disptest()
{
System.out.println("testcode :" +testcode);
System.out.println("description is :" +Des);
System.out.println("no. of centers is :" +nocandi);
}
}
class testt
	{
public static void main(String[] args) {
	Test t1 = new Test();
	t1.schedule();
	t1.disptest();
	}
}