package lab1;

class sample{
	
	int a,b,c;
	
	

	public sample() {
		this.a=1;
		this.b=1;
		this.c=1;
	}
	
	public sample(int i, int j, int k) {
		this.a=i;
		this.b=j;
		this.c=k;
	}
	
	public void print(int x) {
		System.out.println(this.a*x*x + this.b*x + c);
	}
	
	
	
}

public class question24 {

	public static void main(String[] args) {
		
		sample s =new sample();
		s.print(2);
		
		sample s1=new sample(1,2,3);
		s1.print(1);
		
	}

}
