package com.basics;

public class Sample {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		//int num1 = e1.m1(); //method calling	--> m1 --> is going to return -- int type value
		//int num2 = e1.m2(); // method calling	--> m2 is not going to return the value
		int [] numbers= {10,20,30,40,35,100,200};	// 
		 e1.m2(numbers); //here
		 e1.m3(numbers);
	}
}


class Employee{
	
	public int findFirstDivisibleByThreeReturn(int []numbers) {
		for (int num : numbers) {
			if(num%3==0) {
				return num;
			}
		}
		System.out.println("Number not found..!");
		return 0;
	}
	
	public void findFirstDivisibleByThreePrint(int []numbers) {
		for (int num : numbers) {
			if(num%3==0) {
				System.out.println(num);
			}
		}
		System.out.println("Number not found..!");
	}
				
	
	public void m2(int []numbers) {			//numbers = [10,20,30,40,35,100,200]
		System.out.println("m2 started..*");		//started --> 10 20 30 40 35 35 found
		for (int num : numbers) {
			System.out.println("number --"+num);
			if(num == 35) {
				System.out.println("35 found --"+num);
				return;			// directly caller kade --> ya function --. directly function execution stop karel at that point itself--> 
			}						// control will be given to the caller.
		}
		
		System.out.println("M2 completed.."); 
	}
	
	public void m3(int []numbers) {
		System.out.println("M3 started..");		// m3 started --> 10 20 30 40 35 35 found-->
		for (int num : numbers) {
			System.out.println("number --"+num);
			if(num == 35) {
				System.out.println("35 found --"+num);
				break;			// function stop karel.  --> control wil never be given to caller--> current loop stop hoto
			}
		}
		
		System.out.println("M3 completed..");	// this will be printed
	}
	
	public void m4(int []numbers) {
		System.out.println("m4 completed..");
		for (int num : numbers) {
			System.out.println("number --"+num);
			if(num == 35) {
				System.out.println("35 found --"+num);
				continue;			// function stop karel.
			}
		}
		System.out.println("M4 completed..");
	}
}