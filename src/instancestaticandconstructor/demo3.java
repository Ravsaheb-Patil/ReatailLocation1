package instancestaticandconstructor;

public class demo3 {
	{
		System.out.println("instance block 1");
	}
  static {
	  System.out.println("static block 1");
	  
  }
public demo3() {
	System.out.println("constructor");
}
static {
	System.out.println("static block1");
	
}
{
	System.out.println("instance block2");
	

}
public static void main(String[] args) {
	demo d1  =new demo();
}	demo d2 = new demo();
}