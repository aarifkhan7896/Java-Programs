import java.util.*;
public class TypeConversion {

	public static void main(String[] args) {
//		char to string
		char c = 's';
		String s = Character.toString(c);
		System.out.println(s);
		
//		char array to string
		char[] ch = {
				'z','a','e','f'
		};
		String s1 = String.valueOf(ch);
		System.out.println(s1);
		
//		String to char Array
		String s2 = "this is";
		char[] ca = s2.toCharArray();
		System.out.println(Arrays.toString(ca));
		
//		int to long
		int a =12;
		long b = a;
		System.out.println(b);
		
//		long to int
		long d = 12L;
		int e = (int) d;
		System.out.println(e);
		
//		int to double
		int f =222;
		double g = f;
		System.out.println(g);
		
//		double to int
		double h = 222.34;
		int i = (int) h;
		System.out.println(i);
		
//		char to int
		char j = 'A';
		int k = j;
		System.out.println(k);
		
	}

}
