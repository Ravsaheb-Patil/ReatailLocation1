package methodcalling1;

import methodcalling2.B;

public class A {
	public void m1() {
		System.out.println("m1 method of A class pckg is method calling");
	}
public static void main(String[] args) {
	A a=new A();
	a.m1();
	
	B b =new B();
	b.m2();

}
}
