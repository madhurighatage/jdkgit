package com.basics.arrays;

public class FirstArray {

	public static void main(String[] args) {
		int[] x= {1,2,3,4,5};
		int[] y=new int[5];
		int c=0;
		for(int i=x.length-1;i>=0;i--) {
			y[c]=x[i];
			c++;
		}
		for(int i=0;i<y.length;i++) {
			System.out.print(y[i]+" ");
		}
	}

}
