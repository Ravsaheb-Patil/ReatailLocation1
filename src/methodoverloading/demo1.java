package methodoverloading;

public class demo1 {
   public void add(int a) {
	   int b =a + a;
	   System.out.println(b);
	   }
	public void add(int a , int b) {
		int c = a + b;
		System.out.println("two no of addition i ="+c);
	}
	public void add (int a ,int b ,int c) {
	  int d = a+b+c;
	  System.out.println("addition of a,band c="+c);
	  
	  }
public void add (double d1, double d2) {
	double d = d1+d2;
	System.out.println("addition of two double no is=" +d);
}
    public static void main(String[] args) {
		demo1 d =new demo1();
		d.add(11);
		d.add(11,22);
		d.add(11,22,33);
		d.add(11.00,33.00);

    
    
    
    }




}
