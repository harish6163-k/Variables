package com.Variables;

import java.util.Scanner;

public class Denomination {

	public static void main(String[] args) {
	   
		Scanner scan = new Scanner(System.in);
		
		int amount = 575;
		
		int[] notes = new int[]{500, 100, 50, 20, 10, 5, 1 }; 
        int[] noteCounter = new int[7]; 
        
        for (int i = 0; i < 7; i++) { 
            if (amount >= notes[i]) { 
                noteCounter[i] = amount / notes[i]; 
                amount = amount - noteCounter[i] * notes[i]; 
            } 
        } 
       
        System.out.println("Currency Count ->"); 
        for (int i = 0; i < 7; i++) { 
            if (noteCounter[i] != 0) { 
                System.out.println(notes[i] + " : "
                    + noteCounter[i]); 
            } 
        } 


	}}
