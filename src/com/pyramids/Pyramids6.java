package com.pyramids;

public class Pyramids6 {

	public static void main(String[] args) {
		int k = 0;
		for(int i=0; i<=5;i++,k=0) {
			for(int j=0; j<=5-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
	         {
	             System.out.print("* ");
	         }
			 System.out.println(); 
		}
	}

}
