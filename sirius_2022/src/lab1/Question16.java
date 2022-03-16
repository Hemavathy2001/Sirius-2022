package lab1;

import java.util.Scanner;

public class Question16 {

	public Question16() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		int arr[]= new int[] {7,9,12,34,45,76};
		
		System.out.print("Enter the element to search:");
		
		Scanner sc=new Scanner(System.in);
		int count=0;
		int number=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==number) {
				System.out.println("The number is at position : " + i);
				count++;
			}
			
		}
	
	    if(count==0) {
	    	System.out.println("Element not present");
	    }
	    else {
	    	
	    	System.out.println("Element present "+ count + "  time");
	    	
	    }
} 

}
