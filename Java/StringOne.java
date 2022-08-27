
public class StringOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String a = "program";
		String d = "p";
		String e =a.concat(d);
		System.out.println(e);
		System.out.println(a.contains(d));
		
		String s = "programming";
		String first = s.substring(0,1);
		String second = s.substring(1, s.length());
		first = first.toUpperCase();
		s=first+second;
		System.out.println(s);
		
		StringBuffer b = new StringBuffer("heelooo");
		System.out.println(b);
		b = new StringBuffer();
//		b.delete(0, b.length());
		System.out.println("Deleted: "+b);
		
	}
	
}
