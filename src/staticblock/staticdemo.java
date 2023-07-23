package staticblock;

public class staticdemo {

	static {
		
		System.out.println("static block");
	}
	{
		System.out.println("instance block");
	}
	public static void main(String[] args) {
		staticdemo staticdemo = new staticdemo();
		staticdemo staticdemo1=new staticdemo();	
	}
}



