package com.blz.datatypes;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter integer value");
		int Integer = sc.nextInt();
		System.out.println("given number is Integer " + Integer);
		
		System.out.println("Enter byte value");
		byte Byte = sc.nextByte();
		System.out.println("given number is byte " +Byte);
		
		System.out.println("Enter short value");
		short Short = sc.nextShort();
		System.out.println("given number is short " +Short);
		
		System.out.println("Enter long value");
		long  Long  = sc.nextLong();
		System.out.println("given number is long " +Long);
		
		System.out.println("Enter float value");
		float Float = sc.nextFloat();
		System.out.println("given number is float " +Float);
		
		System.out.println("Enter double value ");
		double Double = sc.nextDouble();
		System.out.println("given number is double " +Double);
		
		System.out.println("Enter a charector ");
		char  charector = sc.next().charAt(0);
		System.out.println("given is charector " +charector);
		
		System.out.println("Enter boolean inpute ");
		boolean  Boolean = sc.nextBoolean();
		System.out.println("given is boolean " +Boolean);
		
	}
}


