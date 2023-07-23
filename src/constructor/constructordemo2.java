package constructor;

public class constructordemo2 {
    
	int a;
	String name;
	public constructordemo2() {
		a=0;
		name=null;
	}
	public void display() {
		System.out.println(a+" "+name);
		
		
	}
public static void main(String[] args) {
	constructordemo2 constructordemo2 = new constructordemo2();
	constructordemo2.display();
}
}
