package com.basics;

import java.util.Scanner;

public class ElementAddition {
	public static void main(String[] args) {
		int a[]=new int[5];
		int add=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 5 elements : ");
		
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<5;i++)
		{
			add = add+ a[i];
		}
		System.out.println("addition is : "+add);
		sc.close();
	}

}
