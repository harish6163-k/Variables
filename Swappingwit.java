package com.Variables;

public class Swappingwit {

	public static void main(String[] args) {
		int x=10;
		int y=21;
		
		x= x+y;
		y= x-y;
		x= x-y;
		
		System.out.println("After swapping:" +   " x: " +  x  +  " y: " +  y);
	
	}

}
