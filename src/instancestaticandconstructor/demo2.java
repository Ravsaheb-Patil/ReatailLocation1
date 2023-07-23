package instancestaticandconstructor;

public class demo2 {
	{
		System.out.println("instance block1");
		
	}
	static {
		
		System.out.println("static block");
		}
     	public demo2() {
		System.out.println("constructo");
		{
	}
        System.out.println("instance block 2");
     	}
     	public static void main(String[] args) {
			demo2 d=new demo2();
			
		}
}