package practice;

public class Pg2 {
	public static void main(String[] args) {
		byte b=50;
		//b=b*50;//arithmetic involving byte, short, or char is automatically promoted to int
		//what happens internally (int)b * (int)50  → result is int
		//we have to explicitly tell but if we use *= (compound assignment) automatically convert to byte
		b*=50;//2500 out of range so it wraps back -128,-127,...0....126,127(total 256 values)
		System.out.println(b);//-60     2500 % 256 = 196(cant store)
									//  196 - 256 = -60
	}

}
//If value ≤ 127 → positive

//If value ≥ 128 → negative
 //actual value = stored_value − 256