package lab1;

class parent {
	int a;
	public parent(int a) {
		this.a=a;
	}
	
	 public void print() {
		System.out.print(this.a);
	 }
	
	
}

public class exercise17_c {
	
	public static void main(String[] args) {
		
		parent a=new parent(1);
		a.print();
		
	}
	
}