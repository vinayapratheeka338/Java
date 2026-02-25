package patterns;

import java.util.Scanner;

public class PrintUpper1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		printUpper(s);
	}
	public static void printUpper(String s) {
		String sb = new String();
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(Character.isUpperCase(ch)) {
				System.out.println(sb.toUpperCase().toString());
				sb="";
			}
			sb=sb+ch;
		}
		System.out.println(sb.toUpperCase().toString());
	}

}
//camelCaseStringExample
/*CAMEL
CASE
STRING
EXAMPLE*/
