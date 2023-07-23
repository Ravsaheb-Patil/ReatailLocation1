package methodcallingsmeclass;

public class demo1{
	public void m2() {
		System.out.println("insite demo1 m2 class");
	 
}
public static void main(String[] args) {
	demo1 d1 = new demo1();
	d1.m2();
	demo d = new demo();
	d.m1();
}
}