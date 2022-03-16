package lab1;

import java.lang.reflect.Method;

class example1{
	
	
	private String name;
	
	//getter
	public String getName() {
		 return name;
	}
	
	//setter
	public void setName(String name) {
		this.name=name;
	}
	
	private void hello() {
		
	}
	
	
	public  void  sample1() {
		
		System.out.println("say Hii");
	}
	
    private  void  sample2() {
		
    	System.out.println("say Hello");
	}
    
    protected  void  sample3() {
		
    	System.out.println("say Welcome");
	}
    
    
}

public class exercise_22 {

	public static void main(String[] args) throws Exception  {
		
		example1 ex=new example1();
		ex.setName("janu");
		System.out.println(ex.getName());
		
		
		
		
		ex.sample1();
		//ex.sample2();
		ex.sample3();
		
		
		
		
		
	}

}
