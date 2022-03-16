package lab1;

public class question7 {

	public static void main(String[] args) {
		int arr[]= new int[] {7,9,12,34,45,76};
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("Descending order");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
