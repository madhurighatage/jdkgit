package com.basics;

public class ReverseString {

	public static String str = "Madhuri";
	public static void main(String[] args) {
		for(int i=str.length();i>0;i--) {
			System.out.print(str.charAt(i-1));
		}
		
	}

}
