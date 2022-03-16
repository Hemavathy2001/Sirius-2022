package lab1;
import java.util.*;
public class question_15b {

	public question_15b() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int operation=sc.nextInt();
		
		switch(operation) {
		
		case 1: System.out.println("Amstrong Number");
		         
		        int res=0,remainder=0;
		        int number=num;
		        while(num>0) {
		        	remainder=number%10;
		        	res=res+(remainder*remainder*remainder);
		        	num/=10;
		        }
		        if(res==number) {
		        	 System.out.println(number+ " is an amstrong number");
		        }
		        else {
		        	
		        	System.out.println(number+ " is not an amstrong number");
		        }
		        break;
		  
		case 2: System.out.println("palindrome");
		         int res1=0,remainder1=0;
                 int number1=num;
                 while(num>0) {
        	     remainder1=number1%10;
        	     res1=res1*10+remainder1;
        	      num/=10;
                   }
                if(res1==number1) {
        	          System.out.println(number1+ " is an palindrome");
                 }
                else {
                	System.out.println(number1+ " is not an palindrome");
                }
                break;
		case 3: System.out.println("perfect number");
		         int sum=0;
		         for(int i=1;i<=num;i++) {
		        	 if(num%i==0) {
		        		 sum+=i;
		        	 }
		         }
		         if(sum==num) {
		        	 System.out.print("Perfect Number");
		         }
		         else {
		        	 System.out.println("Not a Perfect Number");
		         }
		         break;
		 default: System.out.println("none");
		          break;
		         
		         
		        
		
		}
			
		
		
		
		
		
	}

}
