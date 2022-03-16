package lab1;


import java.util.*;

public class question10 {

	public question10() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int column=sc.nextInt();
		
		int array[][]=new int[row][column];
		
		for (int i = 0; i < row; i++)
		{
		    for(int j = 0; j < column; j++)
		    {
	           	array[i][j] = sc.nextInt();
	           	
		    }
		}   
		
		for (int i = 0; i < row; i++)
		{
		    for(int j = 0; j < column; j++)
		    {
	           	System.out.print(array[i][j]+" ");
	           	
		    }
		    System.out.println();
		}   
		
	}

}
