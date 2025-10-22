package com.demo.test;

import java.util.Scanner;

import com.demo.service.*;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Service serv = new ServiceImpl();
		
		int choice = 0;
		
		do {
			
			System.out.println("1. Add two Numbers.\n2.Print Multiplication table of a number.\n"
					+ "3. Print Number Pattern in Pramid.\n"
					+ "4. Sum of Digits of a Number.\n"
					+ "5. Find GCD and LCM of Two Numbers.\n"
					+ "6. Find Missing Number from an Array.\n"
					+ "7. Exit");
			
			System.out.println("Enter Your Choice...");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1->{
				System.out.print("Enter 1st number : ");
				int a = sc.nextInt();
				System.out.println("Enter 2nd Number : ");
				int b = sc.nextInt();
				System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
			}
			
			case 2->{
				System.out.println("Want me to print the table of which number ?");
				System.out.print("Enter a Number : ");
				int n = sc.nextInt();
				serv.printTable(n);
			}
			
			case 3->{
				System.out.println("Enter the No. of rows");
				int r = sc.nextInt();
				serv.printPramid(r);
			}
			case 4->{
				System.out.println("Enter the No.");
				int r = sc.nextInt();
				System.out.println(serv.printSumOfDigits(r));
			}
			
			case 5->{
				System.out.println("Enter Two Numbers : ");
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				serv.findGCDLCM(a,b);
			}
			
			case 6->{
				serv.findMissingNum();
			}
			
			case 7->{
				System.out.println("It's Over...");
				sc.close();
				System.exit(0);
			}
			}
		}while(choice != 7);
	}

}
