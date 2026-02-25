//learningJavaIsInteresting
//Interesting
package patterns;

import java.util.Scanner;

public class LongestWord1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		longest(s);
	}
	public static void longest(String s) {
		String s1="";
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			count++;
			if(Character.isUpperCase(ch)) {
				
			}
		}
	}

}
