import java.util.*;
public class DayName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number between 1 to 7: ");
		day = scan.nextInt();
//		String dayName ="";
//		switch(day) {
//		case 1: dayName = "Monday";
//		break;
//		case 2: dayName = "Tuesday";
//		break;
//		case 3: dayName = "Wednesday";
//		break;
//		case 4: dayName = "Thursday";
//		break;
//		case 5: dayName = "Friday";
//		break;
//		case 6: dayName = "Saturday";
//		break;
//		case 7: dayName = "Sunday";
//		break;
//		}
//		System.out.println(dayName);
		System.out.println(getDay(day));
//		getDay(day);
	}
	
public static String getDay(int day) {
	String dayName ="";
	switch(day) {
	case 1: dayName = "Monday";
//	System.out.println("Monday");
	break;
	case 2: dayName = "Tuesday";
	break;
	case 3: dayName = "Wednesday";
	break;
	case 4: dayName = "Thursday";
	break;
	case 5: dayName = "Friday";
	break;
	case 6: dayName = "Saturday";
	break;
	case 7: dayName = "Sunday";
	break;
}
	return dayName;
}
}
