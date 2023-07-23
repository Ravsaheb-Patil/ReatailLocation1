package instancestaticandconstructor;

public class demo1 {
	{
   System.out.println("instance block");
   }
static {
	System.out.println("stasic block");
	{
		System.out.println("statick block 2");
	}
	{
		System.out.println("instance block2");
	}
	
}
public demo1(){
	System.out.println("constructor");
}
public static void main(String[] args) {
	demo1 d= new demo1();
	
}

	 
	
}
