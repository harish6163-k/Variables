package com.Variables;

import java.util.Scanner;

public class CheckNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int n1 = scan.nextInt();
		String result;
		result = (n1 < 0) ? "negative" : "positive";
		System.out.println("result is :" + result);
	}
		

}
