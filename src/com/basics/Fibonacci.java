package com.basics;

public class Fibonacci {

	public static void main(String[] args) {
		// 1 1 2 3 5 8 13 21 ....n

		int k, a = 1, b = 1;

		System.out.println("1 \n1 ");
		k = 0;
		while (k <= 50) {
			k = a + b;
			if (k >= 50)
				break;
			System.out.println(k + " ");
			a = b;
			b = k;
		}
	}

}
