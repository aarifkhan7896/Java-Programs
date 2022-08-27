import java.util.*;
public class DayInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year,month;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Month Number: ");
		month=scan.nextInt();
		System.out.println("Enter Year: ");
		year=scan.nextInt();
		int days =0;
		String monthName = "";
		
		switch(month) {
		case 1: monthName = "January";
		days=31;
		break;
		
		case 2: monthName = "Fabruary";
		if(((year%400==0) && (year%100!=0)) || (year%4==0)) {
			days=29;
		}else {
			days=28;
		}
		
		break;
		
		case 3: monthName = "March";
		days=31;
		break;
		
		case 4: monthName = "April";
		days=30;
		break;
		
		case 5: monthName = "May";
		days=31;
		break;
		
		case 6: monthName = "June";
		days=30;
		break;
		
		case 7: monthName = "July";
		days=31;
		break;
		
		case 8: monthName = "August";
		days=31;
		break;
		
		case 9: monthName = "September";
		days=30;
		break;
		
		case 10: monthName = "October";
		days=31;
		break;
		
		case 11: monthName = "November";
		days=30;
		break;
		
		case 12: monthName = "December";
		days=31;
		break;
		}
		System.out.println(monthName+" has "+days+" days in year "+year);
		}

}
