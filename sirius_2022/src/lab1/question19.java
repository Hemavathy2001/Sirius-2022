package lab1;
import java.util.*;

public class question19 {

	public question19() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int column=sc.nextInt();
		
		int array[][]=new int[row][column];
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				array[i][j]=sc.nextInt();
			}
		}
		
		for(int j = 0; j < row ; j++){
		    for(int i = 0; i < column / 2; i++) {
		        int temp = array[j][i];
		        array[j][i] = array[j][column - i - 1];
		        array[j][column - i - 1] = temp;
		    }
		}
		
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

}
