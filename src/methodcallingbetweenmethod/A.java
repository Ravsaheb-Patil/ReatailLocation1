package methodcallingbetweenmethod;

public class A {

	public void m1() {
		
		System.out.println("m1 method execution started");
		System.out.println("m1 meethod of class a");
		B b = new B();
		b.m2();
		System.out.println("m1 method execution ended");
}

public static void main(String[] args) {
	System.out.println("main method execution started");
	A a=new A();
	a.m1();
	System.out.println("main method execution ended");
}


}


