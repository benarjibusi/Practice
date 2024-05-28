package com.ben;

import java.util.List;
import java.util.Scanner;

public class RepeatbleChar {
	public static void repetableString(String str) {

		char[] ch = str.toCharArray();
		char dummy = 0;
		int count = 0;

		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					dummy = ch[i];

				}
			}
		}

		for (int k = 0; k < ch.length; k++) {
			if (ch[k] == dummy) {
				dummy = str.charAt(k);
				count++;
			}
		}

		System.out.println(" Repetable char : " + dummy);
		System.out.println(" Repeted count are : " + count);

	}

	public static void main(String[] args) {
		System.out.println(" enter String : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		repetableString(str);

	}

}
