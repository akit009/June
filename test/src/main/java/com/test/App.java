package com.test;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//		System.out.println("Hello World!");
//		int no = -2;
//		if (no % 2 == 0)
//			System.out.println("EVEN NO.");
//		else
//			System.out.println("Odd NO.");

//		int a= 2;
//		int b = 5;
//		
//		a = a+b;
//		b= a-b;
//		a= a-b;
//		System.out.println(a);
//		System.out.println(b);

//		int no = 5;
//		int n = no;
//		for (int i = 1; i < n; i++) {
//			no = no * i;
//		}
//		System.out.println(no);
		
		
		boolean isprime = true;
		int n =25;
		for(int i = 2; i<= n/2; i++) {
			int num= n%i;
			
			
			if(num== 0) {
			  isprime = false; 		
				break;
			}
			
			if(isprime) {
				System.out.println("Prime no");
			}
			else
				System.out.println("Not a Prime No");
			break;
			
		}

	}

}
