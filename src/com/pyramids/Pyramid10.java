package com.pyramids;

public class Pyramid10 {
	public static void main(String[] args) {
		char ch='a';
		for(int line = 1; line<=5; line ++) {
			for(int space = 3; space>=line-1;space--) {
				System.out.print(" ");
			}
			for(int star=1;star<=line;star++){
				System.out.print(ch+" ");
			}		
			System.out.println("");
			ch++;
		}
	}
}
