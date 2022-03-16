package lab1;

import java.util.*;

public class question5 {

	public question5() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int a[]=new int[num];
		for(int i=0;i<num;i++) {
			 a[i]=sc.nextInt();
		}
		
		System.out.println(average(num,a));
		
		
	}
	
	static float  average(int number,int a[]) { 
		int sum=0;
		for(int i=0;i<number;i++) {
			
			sum+=a[i];
	    }
		return sum/number;
	}

}
