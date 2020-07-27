package Assignments;

import java.util.Scanner;

class flight
{
private int flight_no;
private String destination;
private float distance;
private float fuel;

private void calfuel()
{
		if (distance<=1000)
			fuel=500;
		else if(distance>=2000)
			fuel=1000;
		
		else fuel= 2200;
}

public void FEEDINFO()
{
Scanner in=new Scanner(System.in);
System.out.print("Enter the Flight number: ");
flight_no=in.nextInt();
System.out.print("Enter the Destination of flight: ");
destination=in.next();
System.out.print("Enter the Distance of Flight: ");
distance=in.nextFloat();
calfuel();
}

public void SHOWINFO()
	{
	System.out.println("Flight number= " +flight_no);
	System.out.println("Destination of flight= " +destination);
	System.out.println("Distance of Flight= " +distance);
	System.out.println("Fuel= " +fuel);
	}
}
class flighttest
	{
public static void main(String args[])
		{
			flight ft=new flight();
			ft.FEEDINFO();
			ft.SHOWINFO();
}
}