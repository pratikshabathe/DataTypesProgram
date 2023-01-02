package com.blz.datatypes;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
	
		System.out.println("Enter any value");
		Scanner sc = new Scanner(System.in);
		int percentage= sc.nextInt();
		
		if(70 <= percentage &&  percentage < 100) {
			System.out.println("First Class with Distinction");
		}else if(60 <=  percentage &&  percentage < 70) {
			System.out.println("First Class ");
		}else if (50 <=  percentage &&  percentage <60) {
			System.out.println("Second class ");
		}else if (35 <=  percentage &&  percentage <50) {
			System.out.println("Just class ");
		}else {
			System.out.println("you are failed");
				
		}
	}
}
