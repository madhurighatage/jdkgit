
package com.basics;
import java.util.Scanner;
public class Demo {

		public static void main(String[] args) {
			breakDemo();
		}

		private static void breakDemo() {
				for(int i=0;i<5;i++) {			
					for(int j=0;j<5;j++) {
						
						if(j==0)
							break; // current loop la stop karto --> j chya loop la
						System.out.print(i+" "+j+"\t");
					}
					System.out.println("\n"); // new row
				}
		}
}

/**
 * i			j
 * 0	0	1	2	3	4
 * 1	0	1	2	3	3	
 * 	
 * 
 * 
 * 
 * 
 * 
 */
