package positive;
import java.util.*;
public class CamelCase1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		CamelCase(S);
	}
	public static void CamelCase(String S) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<S.length();i++) {
			char ch = S.charAt(i);
			if(Character.isUpperCase(ch)){
				System.out.println(sb.toString());
				sb.setLength(0);
			}
			sb.append(ch);
		}
		System.out.println(sb.toString());
	}
}