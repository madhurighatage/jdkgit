package com.pyramids;

public class Pyramid3 {
	public static void main(String[] args) {
		char c='a';
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(c);
			}
			c++;
			System.out.println();
		}
		
	}

}
