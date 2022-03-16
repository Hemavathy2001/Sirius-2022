package lab1;


public class question27 {

	public static void main(String[] args) {
		int amount=14000;
		
		for(int i=0;i<3;i++) {
			if(i==0) {
				amount=amount+((40/100)*14000);
			}
			else if(i==1){
				amount=amount-1500;
			}
			else {
				amount=amount+((12/100)*14000);
			}
		}
		
		System.out.println(amount);
		System.out.println("It won't be worth");
		
		 
	}
}
