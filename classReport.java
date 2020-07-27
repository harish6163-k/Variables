package Assignments;
import java.util.*;
class Report
{
private int adno;
private String name;
private double marks[]={56.00,68.50,69.30,76.00,78.30};
private double avg;
private double getavg()
{
return((56.00+68.50+69.30+76.00+78.30)/5.00);
}
public void readinfo()
{
Scanner in=new Scanner(System.in);
System.out.print("Enter 4 digit addmission number:");
adno=in.nextInt();
System.out.print("Enter name:");
name=in.next();
}
public void displayinfo()
{
System.out.println("The 4 digit admission number is:"+adno);
System.out.println("The name of the student is:"+name);
System.out.println("The avg in five subjects obtained by the student is:"+getavg());
}
}
class reportt
{
public static void main(String[] args)
{
Report obj=new Report();
obj.readinfo();
obj.displayinfo();
}
}