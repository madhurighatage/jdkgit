package com.basics;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		int a;
		boolean flag=false;
		System.out.println("Enter number : ");

		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		
		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)
			{
				flag=true;
				break;
			}
		}
		
		if(!flag)
		{
			System.out.println("number is prime.");
		}
		else
		{
			System.out.println("number is not prime.");
		}
		sc.close();
	}
	
}
