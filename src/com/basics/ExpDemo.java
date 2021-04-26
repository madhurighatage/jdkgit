package com.basics;

import java.util.Scanner;

public class ExpDemo {
		
	
	
	public static void main(String[] args) {
		System.out.println("inside main...!");
			//m1(0);
			m5();	//m5 --> m4 --> m3 --> m2 --> m1
			// java --> whenever method gets executed --> loaded on Thread stack 
			
			//stack --> main -- m5 -- m4 -- m3 -- m2 -- m1
					// m1 - m2 -- m3 - m4 -- m5 --main.
			System.out.println("main completed");
	}
	private static int m1(int num) {		// return -- inside method --> break/continue -- looping-for/while
															//switch --> only break
		System.out.println("inside m1 method...5");
		int ans = num*num;
		if(ans>50)
			return ans; // function exucution will stop here --. caller --> line num10;
		System.out.println("m1 completed..");
		return 20;
	}
	
	private static int m2() {
		System.out.println("inside m2 method...4");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");	// 10
		int value = sc.nextInt();
		System.out.println("Entered Number : "+value);
		value = m1(value); //caller -->
		System.out.println("m2 completed..");
		return value;
	}
	
	private static void m3() {
		System.out.println("inside m3 method..3");
		int ans = m2(); // dead code.
		System.out.println(ans);// m1-m2-m3
		System.out.println("m3 completed..");
	}
	
	private static void m4() {
		System.out.println("inside m4 method..2");
		m3();
		System.out.println("m4 completed..");
	}
	
	private static void m5() {
		System.out.println("inside m5 method..1");
		m4();
		System.out.println("m5 completed..");
	}
	
}
