package typeofconstructor;

public class student {
    
	int rollno;
	String name;
	public student(int rollno,String name) {
	
	super();
	this.rollno=rollno;
	this.name=name;
	System.out.println(rollno+" "+name);
	
	}
	public static void main(String[] args) {
		student stu= new student(111,"ravsaheb");
	}
}
