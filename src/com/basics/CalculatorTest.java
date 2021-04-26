package com.basics;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 	byte --> short ---> int --> long --> float --> double
 * 			 char
 * 
 * byte b = 10
 * int n = b;		// java implicitly converting --> smaller type to larger type..
 * 
 * int n = 10
 * byte b = (byte)n;		// we are explicitly converting larger type to smaller type
 * 
 * float f = 10.0f;
 * 
 * double n  = f;
 * 
 * 
 * @author Lenovo
 *
 */
public class CalculatorTest {
		public static int addition(int num1,int num2) {
			//System.out.println("(ADD)Entered Values are : "+num1 +","+num2);
			int result  = num1 + num2;	// e1 + e2 - e4
			return result;
		}
		public static int division(int num1,int num2) {
			//System.out.println("(DIV)Entered Values are : "+num1 +","+num2);
			if(num2==0) {
				System.out.println("Cannot perform division-- second number cannot be zero");
				return 0;
			}else {
				int result  = (num1 / num2);
				return result;
			}
			
		}
		public static int multiplication(int num1,int num2) {
			//System.out.println("(MUL)Entered Values are : "+num1 +","+num2);
			int result  = num1 * num2;
			return result;
		}
		public static int substraction(int num1,int num2) {
			//System.out.println("(SUB)Entered Values are : "+num1 +","+num2);
			int result  = num1 - num2;
			return result;
		}
		
		public static int enterNumber(Scanner sc) {
			//Scanner sc = new Scanner(System.in); // buffer --> storage --> ref -- clear
			for(int i=0;i<3;i++) {
				try {
					int num  = Integer.parseInt(sc.next()); // work around..
					return num;
				}catch (NumberFormatException e) {
						System.out.println("Enter Valid Number..attempt :"+(i+1));
				}
			}
			return 0;
			
		}
		
		
		public static void main(String[] args) {
			//Scanner sc = new Scanner(System.in);
			//System.out.println("Do u want to start Calculator : Y/N");
			String onOff = "Y";
			if (onOff.equalsIgnoreCase("Y")) {
				
				while(true) {
					System.out.println("Enter Ur Choice : "
							+ "\n1. Addition "
							+ "\n2. Substraction "
							+ "\n3. Multiplication "
							+ "\n4. Division "
							+ "");
					int num1 = 0;		//local variable --> as long as those are not initialized -->
					int num2 = 0;		// local variables never gets ini to default values.
					int result = 0;
					Scanner sc = new Scanner(System.in);
					int choice = enterNumber(sc);
					
					switch (choice) {
					case 1:
						System.out.println("Enter Number 1 :");
						num1 = enterNumber(sc);//enterNumber(sc);;
						System.out.println("Enter Number 2 :");
						num2 = enterNumber(sc);//enterNumber(sc);;
						result = addition(num1, num2);
						System.out.println("Addition Result is --> " + num1 +"+" +num2 +":"+result);
						break;
					case 2:
						System.out.println("Enter Number 1 :");
						num1 = enterNumber(sc);
						System.out.println("Enter Number 2 :");
						num2 = enterNumber(sc);
						result = substraction(num1, num2);
						System.out.println("Substraction Result is --> " + num1 +"-" +num2 +":"+result);
						break;
					case 3:
						System.out.println("Enter Number 1 :");
						num1 = enterNumber(sc);
						System.out.println("Enter Number 2 :");
						num2 = enterNumber(sc);
						result = multiplication(num1, num2);
						System.out.println("Multiplication Result is --> " + num1 +"*" +num2 +":"+result);
						break;
					case 4:
						System.out.println("Enter Number 1 :");
						num1 = enterNumber(sc);
						System.out.println("Enter Number 2 :");
						num2 = enterNumber(sc);
						result = division(num1, num2);
						System.out.println("Division Result is --> " + num1 +"/" +num2 +":"+result);
						break;
					default:
						System.out.println("Invalid Choice..!");
						break;
					}
					System.out.println("Do you want to continue : Y/N");
					onOff = sc.nextLine();
					if(onOff.equalsIgnoreCase("N")) {
						System.out.println("Shutting down...");
						break;
					}
				}
				
				
			}else {
				System.out.println("No output -- Shutting down..");
			}
		}
		
}
