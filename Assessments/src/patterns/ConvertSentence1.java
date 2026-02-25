//thisIsVeryEasy
//this is very easy
package patterns;

import java.util.Scanner;

public class ConvertSentence1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String w=sc.next();
		convert(w);
	}
	public static void convert(String w) {
		String s = "";
		for(int i=0;i<w.length();i++) {
			char ch = w.charAt(i);
			if(Character.isUpperCase(ch)) {
				System.out.print(s.toLowerCase().toString()+" ");
				s="";
			}
			s=s+ch;
		}
		System.out.println(s.toLowerCase().toString());
	}
}
