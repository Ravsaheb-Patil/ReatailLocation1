package methodoverloading;

public class demo {
	public void m1() {
		System.out.println("this is m1 method with no argument");
	}
    public void m1 (String name) {
    	System.out.println("my name is " + name);
     }
public void m1 ( String name,String lname) {
	
System.out.println("my first name is " + fname + " and my last name is" + lname);
}
public void m1(String name , int age) {
System.out.println("my name is" + name + " and my age is" + age);

}
public static void main(String[] args) {
	 demo d= new demo();
	 d.m1();
	 d.m1("ravsaheb");
    d.m1("ravsaheb ",26);
    d.m1 ("ravsaheb","rajendra");
}
}