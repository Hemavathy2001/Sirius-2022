package lab1;
import java.util.*;
public class question13 {

	public question13() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		int students=sc.nextInt();
		int marks=sc.nextInt();
		int  array[][]=new int[students][marks];
		
		for(int i=0;i<students;i++) {
			for(int j=0;j<marks;j++) {
				 
				array[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		for(int i=0;i<students;i++) {
			for(int j=0;j<marks;j++) {
				 
				//System.out.println(array[i][j]);
				sum+=array[i][j];
			}
			System.out.println(sum);
			sum=0;
		}
		
		
		
	}

}
