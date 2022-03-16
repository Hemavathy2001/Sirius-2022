package lab1;

public class question_15a {

	public question_15a() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++) {
			if(checkPrime(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static boolean checkPrime(int number) {
		
		if(number<2) {
			return false;
		}
		else {
			int value=number/2;
			for(int i=2;i<value;i++) {
				if(number%i==0) {
					return false;
				}
			}
		}
		return true;
	}
	
	
	

}
