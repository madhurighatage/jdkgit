package com.basics;

import java.util.Scanner;

public class NumberToWord {
	public static void main(String[] args) {
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number : ");
		i=sc.nextInt();
		
		int temp1=i/10;
		int temp2=i%10;
		
		if(i>9 && i<100)
		{
			switch(temp1)
			{
				case 0:System.out.print("ZERO ");
				break;
				case 1:System.out.println("ONE ");
				break;
				case 2:System.out.println("TWO ");
				break;
				case 3:System.out.print("THREE ");
				break;
				case 4:System.out.print("FOUR ");
				break;
				case 5:System.out.print("FIVE ");
				break;
				case 6:System.out.print("SIX ");
				break;
				case 7:System.out.print("SEVEN ");
				break;
				case 8:System.out.print("EIGHT ");
				break;
				case 9:System.out.print("NINE ");
				break;
				default:System.err.println("Please enter valid number ..");
				break;
			}
			switch(temp2)
			{
				case 0:System.out.println("ZERO");
				break;
				case 1:System.out.println("ONE");
				break;
				case 2:System.out.println("TWO");
				break;
				case 3:System.out.println("THREE");
				break;
				case 4:System.out.println("FOUR");
				break;
				case 5:System.out.println("FIVE");
				break;
				case 6:System.out.println("SIX");
				break;
				case 7:System.out.println("SEVEN");
				break;
				case 8:System.out.println("EIGHT");
				break;
				case 9:System.out.println("NINE");
				break;
				default:System.err.println("Please enter valid number ..");
				break;
			}
		}
	}
			
}
