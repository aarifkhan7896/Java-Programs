import java.util.Scanner;
class StuC{
	String student_name;
	float studnet_cgpa,token_id;
	
	StuC(String name,float cgpa,float id){
		this.student_name=name;
		this.studnet_cgpa=cgpa;
		this.token_id=id;
	}
}
public class StudentCgpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Number of Students: ");
		int num = scan.nextInt();
		
		System.out.println("Enter the details in the given format[Enter Student_name Student_cgpa token_id]");
		String st = scan.next();
		
		float a=scan.nextFloat();
		float b=scan.nextFloat();
		
		String st1 = scan.next();
		float a1=scan.nextFloat();
		float b1=scan.nextFloat();
		StuC s1 = new StuC(st,a,b);
		StuC s2 = new StuC(st1,a1,b1);
		if(num>=2) {
		if(s1.studnet_cgpa > s2.studnet_cgpa) {
			System.out.println("Name:"+ s1.student_name);
			System.out.println("Name:"+ s2.student_name);
		}else{
			System.out.println("Name:"+ s2.student_name);
			System.out.println("Name:"+ s1.student_name);
			}
		
		if(st.equalsIgnoreCase(st1)) {
			if(a==a1) {
				if(b==b1) {
					System.out.println("Name: "+st.toUpperCase());
					System.out.println("Name: "+st1.toLowerCase());
				}else {
					System.out.println("Name: "+st1.toUpperCase());
					System.out.println("Name: "+st.toLowerCase());
				}
			}
		}
		
		if(st.equals(st1)) {
			if(a==a1) {
				if(b!=b1 && b>b1) {
					System.out.println("Name:"+st+", Token "+b);
				}else if( b1>b){
					System.out.println("Name:"+st1+", Token: "+b1);
				}
			}
		  }
		}else {
			System.out.println("Given input is not valid");
		}
	}
}
