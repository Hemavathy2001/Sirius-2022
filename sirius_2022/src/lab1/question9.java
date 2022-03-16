package lab1;

public class question9 {

	public static void main(String[] args) {
		int arr[]= new int[] {7,9,12,34,45,76};
		for(int i = 0; i < arr.length / 2; i++) {
		    int temp = arr[i];
		    arr[i] = arr[arr.length - i - 1];
		    arr[arr.length - i - 1] = temp;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
