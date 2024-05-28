package com.ben;

import java.util.Scanner;

public class PrimeNumberFinder {
public static int primeFinder(int number) {
	int count=0;
	for(int i =1;i<=number;i++) {
		if(number%i==0) {
			count++;
		}
	}if(count==2) {
		System.out.println(number + " is Prime number ");
	}
	return count;
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println(" Enter number: ");
	int number=sc.nextInt();
	for(int i =1;i<=number;i++) {
		primeFinder(i);
	}
}
}
