package com.basics;
import java.util.Scanner;

public class BlankFinal {
	
	public final float pi;
	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Pie value : ");
		pi=sc.nextFloat();
	}
	public void display() {
		System.out.println("Pie is : " + pi);
	}
	public static void main(String[] args) {
		BlankFinal b=new BlankFinal();
		b.display();
		BlankFinal b1=new BlankFinal();
		b1.display();
	}
}