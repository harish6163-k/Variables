package Assignments;
import java.util.Scanner;
class Student
{
		private int adno;
		private String sname;
		private float eng,math,sci;
		private float total;
		public void ctotal()
			{
				total=eng+math+sci;
			}
public void takedata()
{
Scanner in=new Scanner(System.in);
System.out.print("Enter the Admission number: ");
adno=in.nextInt();
System.out.print("Enter the Name: ");
sname=in.next();
System.out.print("Enter the English Marks: ");
eng=in.nextFloat();
System.out.print("Enter the Math Marks: ");
math=in.nextFloat();
System.out.print("Enter the Science Marks: ");
sci=in.nextFloat();
ctotal();
}
public void showdata()
	{
System.out.println("Addmission Number:" +adno);
System.out.println("English marks:" +eng);
System.out.println("Math marks:" +math);
System.out.println("Science marks:" +sci);
System.out.println("Total marks:" +total);
	}
}
class studentt
{
	public static void main(String[] args)
			{
				Student s1=new Student();
				s1.takedata();
				s1.showdata();
			}
}
