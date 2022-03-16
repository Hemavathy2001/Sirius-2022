package lab1;

import java.io.*;
import java.util.Scanner;
public class question8 {

	public static void main(String[] args) {
		int arr[]= new int[] {7,9,12,34,45,76};
		
		System.out.print("Enter the element to search:");
		
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the number:" );
		int number=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==number) {
				System.out.println("The number is at position : " + i);
				
			}
			}
		}
		
		
		
	}

