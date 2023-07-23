package methodcallingsmeclass;


public class demo {
	public void m1() {
		System.out.println("insite demo m1 class");

	}

	public static void main(String[] args) {
		demo d = new demo();
		d.m1();
		demo1 d1=new demo1();
		d1.m2();

	}
}
