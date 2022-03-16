package lab1;

import java.util.*;

public class question20 {

	public question20() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int column=sc.nextInt();
		
		int a[][]=new int[row][column];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		int k=0;
		for(int i=0;i<row;i++) {
			int temp=a[i][k];
			for(int j=0;j<column;j++) {
				if(a[i][j]>temp) {
					temp=a[i][j];
				}
			}
			k++;
			System.out.println(temp);
			
		}
		
	}

}
