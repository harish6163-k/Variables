package com.Variables;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Principal :");
		int Principal = scan.nextInt();
		System.out.print("Rate :");
		int Rate = scan.nextInt();
		System.out.print("Time :");
		int Time = scan.nextInt();
		
		
		int SimpleInterest = (Principal*Rate*Time)/100;
		System.out.println("Simple interest is :" + SimpleInterest);
	}

}
