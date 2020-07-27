package com.Variables;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a, b, c, d;
        
        System.out.println("Enter all three numbers:");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        d = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        System.out.println("Largest Number:"+d);
	}
}
