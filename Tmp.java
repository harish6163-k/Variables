package com.Variables;

import java.util.Scanner;

public class Tmp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter temperature in Fahreinheit");
		int Fahreinheit = scan.nextInt();
		
		int Celsius = (((Fahreinheit-32)*5)/9);
		
		System.out.println("Temperature in Celsius is:" + Celsius);
		

	}

}
