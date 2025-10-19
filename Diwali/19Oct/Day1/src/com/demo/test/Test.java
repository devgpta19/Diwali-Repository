package com.demo.test;

import java.util.Scanner;

import com.demo.service.Service;
import com.demo.service.ServiceImpl;

public class Test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Service serv = new ServiceImpl();

		int ch = 0;

		do {

			System.out.println("1. Check if a number is prime\n2. Generate all prime numbers up to n\n"
					+ "3. Calculate factorial of a number\n4. Generate Fibonacci series up to n terms\n"
					+ "5. Check if a number is even or odd\n6. EXIT\n\n7. Coding Challenge");

			System.out.println("Enter Your Choice");
			ch = sc.nextInt();

			switch (ch) {
			case 1 -> {
				System.out.println("Enter A Number : ");
				int x = sc.nextInt();

				boolean status = serv.isPrime(x);
				if (status)
					System.out.println("The Number " + x + " is Prime.");
				else
					System.out.println("The Number " + x + " is Non-Prime.");
			}
			case 2 -> {
				System.out.println("Enter A Number : ");
				int x = sc.nextInt();

				serv.findAllPrime(x);
			}
			case 3 -> {
				System.out.println("Enter A Number : ");
				int x = sc.nextInt();

				int fact = serv.calcFact(x);
				System.out.println("Factorial of " + x + " is " + fact);
			}
			case 4 -> {
				System.out.println("Enter A Number : ");
				int x = sc.nextInt();

				serv.calcFibonacci(x);
			}
			case 5 -> {
				System.out.println("Enter A Number : ");
				int x = sc.nextInt();

				boolean status = serv.evenOdd(x);
				if (status)
					System.out.println("The Number " + x + " is Even");
				else
					System.out.println("The Number " + x + " is Odd");
			}
			case 6->{
				System.out.println("ThankYou...");
				sc.close();
				System.exit(0);
			}
			case 7->{
				System.out.println(". You are given an array of strings. Your task is to determine the length of the\r\n"
						+ "longest string in the array.\r\n");
				System.out.println("Enter the length of Array");
				int x = sc.nextInt();
				
				String str = serv.longestString(x);
				System.out.println("The Longest String is "+str);
			}
			default ->{
				System.out.println("Re-Enter A Correct Choice...");
			}
			}

		} while (ch != 6);
	}
}
