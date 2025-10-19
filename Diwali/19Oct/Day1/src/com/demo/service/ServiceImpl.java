package com.demo.service;

import java.util.Scanner;

import com.demo.dao.Dao;
import com.demo.dao.DaoImpl;

public class ServiceImpl implements Service {

	private Dao dao;

	public ServiceImpl() {
		dao = new DaoImpl();
	}

	@Override
	public boolean isPrime(int x) {
		// TODO Auto-generated method stub
		for (int i = 2; i < x; i++) {
			if ((x % i) == 0)
				return false;
		}
		return true;
	}

	@Override
	public void findAllPrime(int x) {
		// TODO Auto-generated method stub

		boolean flag = false;

		for (int i = 2; i <= x; i++) {
			if (isPrime(i)) {
				flag = true;
				System.out.println(i);
			}
		}

		if (!flag)
			System.out.println("Did't find any Prime No.");

	}

	@Override
	public int calcFact(int x) {
		// TODO Auto-generated method stub
		int fact = 1;
		for (int i = 1; i <= x; i++) {
			fact = fact * i;
		}

		return fact;
	}

	@Override
	public void calcFibonacci(int x) {
		// TODO Auto-generated method stub

		int a = 0;
		int b = 1;
		int c = 0;
		int i = 2;
		while (i != x) {
			System.out.println(c);
			a = b;
			b = c;
			c = a + b;

			i = i + 1;
		}

	}

	@Override
	public boolean evenOdd(int x) {
		// TODO Auto-generated method stub
		if (x % 2 == 0)
			return true;
		else
			return false;
	}

	@Override
	public String longestString(int x) {
		Scanner sc = new Scanner(System.in);
		String []str = new String[x];
		System.out.println("Enter Elements of array");
		for(int i=0;i<x;i++) {
			str[i] = sc.nextLine();
		}
		String max = str[0];
		for(int i=0;i<x-1;i++) {
			if(max.length() < str[i+1].length()) {
				max = str[i+1];
			}
		}
		
		return max;
	}

}
