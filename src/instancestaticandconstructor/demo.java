package instancestaticandconstructor;

public class demo {
	{
		System.out.println("instance block");
	}
	static {
		System.out.println("static block");
	}
	public demo() {
		System.out.println("constructor");
	}
	public static void main(String[] args) {
		
	}
	
	
}
