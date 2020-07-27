package com.Variables;

import java.util.Scanner;

public class NoofYears {

	
		static final int DAYS_IN_WEEK = 7; 
		static Scanner scan = new Scanner(System.in);
	      
	    static void find(int number_of_days) 
	    { 
	        int year, week, days; 
	    
	        year = number_of_days / 365; 
	        week = (number_of_days % 365) / 
	                DAYS_IN_WEEK; 
	        days = (number_of_days % 365) %  
	                DAYS_IN_WEEK; 
	          
	        System.out.println("years = " + year); 
	        System.out.println("weeks = " + week); 
	        System.out.println("days = " + days); 
	    } 
	      
	  
	    public static void main(String[] args) {
	        int number_of_days = scan.nextInt(); 
	        find(number_of_days); 
	    } 
	 
		
	}


