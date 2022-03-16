package lab1;
import java.util.*;

public class exercise_21 {

	public exercise_21() {
		// TODO Auto-generated constructor stub
	}
   
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int month=sc.nextInt();
		int year=sc.nextInt();
		
		switch (month) {
        case 1:
            System.out.println("January");
            System.out.println("Number of days :31");
            break;
        case 2:
        	System.out.println("February");
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            	 System.out.println("Number of days :29");
            } else {
            	 System.out.println("Number of days :28");
            }
            break;
        case 3:
        	 System.out.println("March");
             System.out.println("Number of days :31");
             break;
        case 4:
        	System.out.println("April");
            System.out.println("Number of days :30");
            break;
        case 5:
        	System.out.println("May");
            System.out.println("Number of days :31");
            break;
        case 6:
        	System.out.println("June");
            System.out.println("Number of days :30");
            break;
        case 7:
        	System.out.println("July");
            System.out.println("Number of days :31");
            break;
        case 8:
        	System.out.println("August");
            System.out.println("Number of days :31");
            break;
        case 9:
        	System.out.println("September");
            System.out.println("Number of days :30");
            break;
        case 10:
        	System.out.println("October");
            System.out.println("Number of days :31");
            break;
        case 11:
        	System.out.println("November");
            System.out.println("Number of days :30");
            break;
        case 12:
        	System.out.println("December");
            System.out.println("Number of days :31");
            break;
    }
    
}

}

