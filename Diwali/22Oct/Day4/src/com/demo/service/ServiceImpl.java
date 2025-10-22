package com.demo.service;

import java.util.Scanner;

public class ServiceImpl implements Service {

	@Override
	public void printTable(int n) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "x" + i + "=" + (n * i));
		}

	}

	@Override
	public void printPramid(int r) {
		// TODO Auto-generated method stub

		int n = 1;

		for (int i = 0; i < r; i++) {
			for (int j = r - 1; j > i; j--) {
				System.out.print("   ");
			}
			for (int j = 0; j <= i + i; j++) {
				System.out.print(" " + n + " ");
				n++;
			}

			System.out.println();
		}

	}

	@Override
	public int printSumOfDigits(int n) {
		// TODO Auto-generated method stub

		int sum = 0;
		while (n != 0) {
			sum = sum + (n % 10);
			n = n / 10;
		}

		return sum;
	}

	@Override
	public void findGCDLCM(int a, int b) {
		// TODO Auto-generated method stub

		int gcd = 1;

		for (int i = 1; i < ((a > b) ? a : b); i++) {
			if ((a % i) == 0 && (b % i) == 0) {
				gcd = gcd * i;
			}
		}

		int lcm = (a * b) / gcd;

		System.out.println("LCM is : " + lcm);
		System.out.println("GCD is : " + gcd);

	}

	@Override
	public void findMissingNum() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length of the array");
		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int total = (n * (n + 1)) / 2;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + arr[i];
		}

		int missingNo = total - sum;
		System.out.println(missingNo);

	}

}
