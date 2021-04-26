package com.basics;
import java.util.*;
public class EvenOdd {
	public static void main(String[] args) {
		int a;
		
		System.out.println(" Enter number : ");
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();		
		if(a%2==0)
		{
			System.out.println(a+" is even number. ");
		}
		else
		{
			System.out.println(a+" is odd number. ");
		}
		sc.close();
	}
}
