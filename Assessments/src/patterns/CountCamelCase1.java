package patterns;

import java.util.Scanner;

public class CountCamelCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		countWords(s);
	}
	public static void countWords(String s) {
		int count=1;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(Character.isUpperCase(ch)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
//helloWorldJavaProgram
//4