package methodcalling2;

import methodcalling1.A;

public class B{
	
	public void m2() {
		System.out.println("m2 method of class B and pckg name is method calling2");
		
	}

	public static void main(String[] args) {
		 B b = new B();
		 b.m2();
		 A a = new A();
         a.m1();		 
	}
	}