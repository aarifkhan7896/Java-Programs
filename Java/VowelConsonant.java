import java.util.*;
public class VowelConsonant {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter an Alphabet: ");
		char ch = scan.next().charAt(0);
//		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
//			System.out.println("Vowel");	
		//}
		boolean bool =false;
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			bool=true;
			break;
		}
		if(bool==true) {
			System.out.println("Vowel");
		}else {
			if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
				System.out.println("Consonant");
			}else {
				System.out.println("Not an alphabet");
			}
		}
	}

}
