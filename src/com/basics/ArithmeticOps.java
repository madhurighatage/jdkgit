package com.basics;

import java.util.Scanner;

public class ArithmeticOps {
	public static void main(String[] args) {
		int a,b;
		System.out.println("Enter two numbers :");
		
		Scanner sc=new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Addition of "+a+" and "+b+" is " +(a+b));
		System.out.println("Subration of "+a+" and "+b+" is " +(a-b));
		System.out.println("Multiplication of "+a+" and "+b+" is " +(a*b));
		System.out.println("Division of "+a+" and "+b+" is " +(a/b));
		sc.close();
	}
}
