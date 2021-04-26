package com.pyramids;

public class Pyramid8 {

	
	public static void main(String[] args) {
		
		for(int line = 1; line<=5; line ++) {
			char ch='a';
			for(int space = 3; space>=line-1;space--) {
				System.out.print(" ");
			}
			for(int star=1;star<=line;star++){
				
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println("");
		}
		
	}

}
