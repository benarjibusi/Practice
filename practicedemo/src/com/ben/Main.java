package com.ben;

import java.util.Scanner;

public class Main {
//	public static void fourthRepChar(String str) {
//		char[] ch = str.toCharArray();
//		char dummy = 0;
//		String ss = null;
//		char dm = 0;
//		String s = null;
//
//		for (int i = 0; i < ch.length; i++) {
//			for (int j = i + 1; j < ch.length; j++) {
//				if (ch[i] == ch[j]) {
//					dummy = ch[i];
//				}
//
//			
//			
//			}
//		}
//
//		System.out.println(" Repeatable char : " + dummy);
//
//		System.out.println(" UnRepeatable char : " + dm);
//
//	}
//	}

	public static void main(String[] args) {

		String str = "iiiambennnll";
		int count=0;
		char dummy=0;
		char dm=0;
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=1+i;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					dummy=ch[i];

					
                  }
				else if(ch[i]!=ch[j]) {
			}
		}
		

}}
